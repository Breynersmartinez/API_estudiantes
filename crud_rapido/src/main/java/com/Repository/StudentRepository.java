package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Entity.Student;

/*Se agrega la anotacion repository */
@Repository

public interface StudentRepository extends JpaRepository<Student, Long>{

}
