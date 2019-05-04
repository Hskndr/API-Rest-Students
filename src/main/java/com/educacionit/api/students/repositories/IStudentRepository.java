
package com.educacionit.api.students.repositories;

import com.educacionit.api.students.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends MongoRepository<Student, String> {
}
