package com.example.Gradebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Gradebook.model.Courseinfo;
import com.example.Gradebook.model.Gradeentry;
import com.example.Gradebook.model.Student;

import java.util.List;

@RestController
public class Postcontroller {

    // Autowire the StudentRepository
    @Autowired
    StudentRepository sr;

    @Autowired
    CourseinfoRepository cr;

    @Autowired
    GradeentryRepository gr;

    @RequestMapping("/post")
    public String post() {
        return "This is a post request";
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return sr.findAll();
    }

    // Add @RequestBody annotation to indicate that the Student object is in the
    // request body
    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return sr.save(student);
    }

    @GetMapping("/courseinfo")
    public List<Courseinfo> getCourseinfo() {
        return cr.findAll();
    }

    // Add @RequestBody annotation to indicate that the Courseinfo object is in the
    // request body
    @PostMapping("/courseinfo")
    public Courseinfo saveCourseinfo(@RequestBody Courseinfo courseinfo) {
        return cr.save(courseinfo);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String rollno) {
        return (Student) sr.findAll(rollno);
    }

    @GetMapping("/courseinfo/{courseid}")
    public Courseinfo getCourseinfoById(@PathVariable String courseid) {
        return cr.findAll(courseid);
    }

    @GetMapping("/gradeentry")
    public List<Gradeentry> getGradeentry() {
        return gr.findAll();
    }

    // Add @RequestBody annotation to indicate that the Gradeentry object is in the
    // request body
    @PostMapping("/gradeentry")
    public Gradeentry saveGradeentry(@RequestBody Gradeentry gradeentry) {
        return gr.save(gradeentry);
    }

    @GetMapping("/gradeentry/{rollno}")
    public Gradeentry getGradeentryById(@PathVariable String rollno) {
        return gr.findAll(rollno);
    }

    @PutMapping("/student/{rollno}")
    public Gradeentry updateGradeentry(@PathVariable String rollno, @RequestBody Gradeentry gradeentry) {
        Gradeentry gradeentry1 = gr.findAll(rollno);
        gradeentry1.setRollno(gradeentry.getRollno());
        gradeentry1.setCourseid(gradeentry.getCourseid());
        gradeentry1.setFinalmarks(gradeentry.getFinalmarks());
        return gr.save(gradeentry1);
    }

    @DeleteMapping("/student/{rollno}")
    public String deleteGradeentry(@PathVariable String rollno) {
        gr.deleteById(rollno);
        return "Deleted gradeentry with id: " + rollno;
    }

}
