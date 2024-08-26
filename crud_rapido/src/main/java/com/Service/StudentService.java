package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import com.Entity.Student;
import com.Repository.StudentRepository;

/* NOTACION DE LOS SERVICIOS   */
@Service

public class StudentService {

   /* notacion Autowired */ 
   @Autowired

   /* Definindo lo que seria este repositorio */
   StudentRepository studentRepository;

   /* Creacion de una serie de servicios  */


/*  Se devuelve una lista de elementos de lo que son los estudiantes. */
        public List<Student> getStudents(){

        /*Retonar toda la informacion.
        findAll() busca todos los elementos y los retorna 
        */
         return studentRepository.findAll();
   }

    /* BUSQUEDA DE ELEMENTOS A TRAVES DEL id */

    /* Este seria un estudiante y no una lista y esto  seria opcional */
    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);

    }


    /* GUARDAR Y ACTUALIZAR EN UN SOLO METODO */

    /* Va a recibir a un estudiante */
    public void saveOrUpdate(Student student){

        /* Se llama al repositorio y decirle que guarde  la informacion */
        studentRepository.save(student);
    }


    /* METODO PARA ELIMINAR A TRAVEZ DEL id  */
    public void delete( Long id){

        /* Se llama al repositorio y decirle que guarde  la informacion */
        studentRepository.deleteById(id);
    }

}
