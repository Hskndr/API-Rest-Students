
package com.educacionit.api.students.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.educacionit.api.students.entities.Student;

@Repository
public interface IStudentRepository extends MongoRepository<Student, String> {

    Student findStudentByEmailLike (String email);
}
