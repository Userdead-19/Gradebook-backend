# Gradebook API Routes

This Spring Boot application provides RESTful API endpoints for managing student information, course details, and grade entries.

## Students

### Get all students

- **Endpoint:** `/api/student`
- **Method:** `GET`
- **Description:** Retrieve a list of all students.

### Get student by roll number

- **Endpoint:** `/api/student/{rollno}`
- **Method:** `GET`
- **Description:** Retrieve information for a specific student based on their roll number.

### Add a new student

- **Endpoint:** `/api/student`
- **Method:** `POST`
- **Request Body:** JSON object representing the new student.
- **Description:** Add a new student to the system.

### Update a student

- **Endpoint:** `/api/student`
- **Method:** `PUT`
- **Request Body:** JSON object representing the updated student.
- **Description:** Update an existing student's information.

### Delete a student

- **Endpoint:** `/api/student/{rollno}`
- **Method:** `DELETE`
- **Description:** Delete a student based on their roll number.

## Courses

### Get all courses

- **Endpoint:** `/api/courseinfo`
- **Method:** `GET`
- **Description:** Retrieve a list of all courses.

### Get course by course ID

- **Endpoint:** `/api/courseinfo/{courseid}`
- **Method:** `GET`
- **Description:** Retrieve information for a specific course based on its course ID.

### Add a new course

- **Endpoint:** `/api/courseinfo`
- **Method:** `POST`
- **Request Body:** JSON object representing the new course.
- **Description:** Add a new course to the system.

### Update a course

- **Endpoint:** `/api/courseinfo`
- **Method:** `PUT`
- **Request Body:** JSON object representing the updated course.
- **Description:** Update an existing course's information.

## Grade Entries

### Get all grade entries

- **Endpoint:** `/api/gradeentry`
- **Method:** `GET`
- **Description:** Retrieve a list of all grade entries.

### Add a new grade entry

- **Endpoint:** `/api/gradeentry`
- **Method:** `POST`
- **Request Body:** JSON object representing the new grade entry.
- **Description:** Add a new grade entry to the system.

### Update a grade entry

- **Endpoint:** `/api/gradeentry`
- **Method:** `PUT`
- **Request Body:** JSON object representing the updated grade entry.
- **Description:** Update an existing grade entry's information.

### Get all grade entries for a student

- **Endpoint:** `/api/gradeentry/for/{rollno}`
- **Method:** `GET`
- **Description:** Retrieve all grade entries for a specific student along with their overall marks.

### Delete a grade entry

- **Endpoint:** `/api/student/{rollno}`
- **Method:** `DELETE`
- **Description:** Delete a grade entry based on the student's roll number.

## Exception Handling

- **Description:** The API includes exception handling to provide appropriate responses in case of errors. The `handleException` method in the controller takes care of internal server errors and returns a response with a 500 status code and an error message.

Note: Ensure to replace `{rollno}` and `{courseid}` with actual roll numbers and course IDs when making requests.

Feel free to explore and utilize these routes to manage student information, courses, and grade entries efficiently.
