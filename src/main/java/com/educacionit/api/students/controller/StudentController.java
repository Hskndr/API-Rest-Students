
package com.educacionit.api.students.controller;


import com.educacionit.api.students.entities.Student;
import com.educacionit.api.students.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping ("students")
public class StudentController {

    @Autowired
    private IStudentRepository dao;


    @RequestMapping (method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> findAllStudents () {

        return ResponseEntity.ok (dao.findAll());
    }


    @RequestMapping (method = RequestMethod.POST, consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> save (@RequestBody Student data) {

        try {

            this.dao.save (data);

        } catch (Exception e) {

            return ResponseEntity.badRequest ().build ();
        }

        return ResponseEntity.noContent().build ();
    }
}