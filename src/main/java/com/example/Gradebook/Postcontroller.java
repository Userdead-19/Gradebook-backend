package com.example.Gradebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Gradebook.model.Courseinfo;
import com.example.Gradebook.model.Gradeentry;
import com.example.Gradebook.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Postcontroller {

    @Autowired
    private StudentRepository sr;

    @Autowired
    private CourseinfoRepository cr;

    @Autowired
    private GradeentryRepository gr;

    @RequestMapping("/post")
    public String post() {
        return "This is a post request";
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return sr.findAll();
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return sr.save(student);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        return sr.save(student);
    }

    @GetMapping("/student/{rollno}")
    public Optional<Student> getStudent(@PathVariable String rollno) {
        return sr.findById(rollno);
    }

    @GetMapping("/courseinfo")
    public List<Courseinfo> getCourseinfo() {
        return cr.findAll();
    }

    @PostMapping("/courseinfo")
    public Courseinfo saveCourseinfo(@RequestBody Courseinfo courseinfo) {
        return cr.save(courseinfo);
    }

    @PutMapping("/courseinfo")
    public Courseinfo updateCourseinfo(@RequestBody Courseinfo courseinfo) {
        return cr.save(courseinfo);
    }

    @GetMapping("/courseinfo/{courseid}")
    public Optional<Courseinfo> getCourseinfo(@PathVariable String courseid) {
        return cr.findById(courseid);
    }

    @GetMapping("/gradeentry")
    public List<Gradeentry> getGradeentry() {
        return gr.findAll();
    }

    @PostMapping("/gradeentry")
    public Gradeentry saveGradeentry(@RequestBody Gradeentry gradeentry) {
        return gr.save(gradeentry);
    }

    @PutMapping("/gradeentry")
    public Gradeentry updateGradeentry(@RequestBody Gradeentry gradeentry) {
        return gr.save(gradeentry);
    }

    @PutMapping("/student/{rollno}")
    public ResponseEntity<Gradeentry> updateGradeentry(@PathVariable String rollno,
            @RequestBody Gradeentry gradeentry) {
        Optional<Gradeentry> optionalGradeentry = gr.findById(rollno);

        if (optionalGradeentry.isPresent()) {
            Gradeentry existingGradeentry = optionalGradeentry.get();
            existingGradeentry.setRollno(gradeentry.getRollno());
            existingGradeentry.setCourseid(gradeentry.getCourseid());
            existingGradeentry.setFinalmarks(gradeentry.getFinalmarks());
            return ResponseEntity.ok(gr.save(existingGradeentry));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/student/{rollno}")
    public ResponseEntity<String> deleteGradeentry(@PathVariable String rollno) {
        try {
            gr.deleteById(rollno);
            return ResponseEntity.ok("Deleted gradeentry with id: " + rollno);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
        }
    }

    @GetMapping("/gradeentry/for/{rollno}")
    public HashMap<List<Gradeentry>, Float> getGradeentryForEach(@PathVariable String rollno) {
        List<Gradeentry> gradeentries = gr.findAll();
        List<Gradeentry> gradeentries2 = new ArrayList<>();
        float Overall = 0;
        for (Gradeentry gradeentry : gradeentries) {
            if (gradeentry.getRollno().equals(rollno)) {
                gradeentries2.add(gradeentry);
                Overall += gradeentry.getTotalmarks();

            }
        }
        HashMap<List<Gradeentry>, Float> hm = new HashMap<List<Gradeentry>, Float>();
        hm.put(gradeentries2, Overall);
        return hm;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        e.printStackTrace();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
    }
}
