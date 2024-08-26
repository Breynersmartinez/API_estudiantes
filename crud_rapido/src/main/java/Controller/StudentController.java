package Controller;

import javax.annotation.processing.SupportedSourceVersion;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.StudentService;

/* NOTACION DE RESTCONTROLLER */
@RestController

/* Se agrega la version con */

/* De esta manera tenemoos nuestra primera ruta  */
@RequestMapping(path = "api/v1/students")
public class StudentController {

    /* Notacion para enlazar nuestro servicio  */
    @Autowired

    private  StudentService studentServices;

/* Se van a exponer los servicios con: */
    @GetMapping

    /* Esto va a retornar una lista de estudiantes en services, le vamos a decir que 
    aca tambien vamos a tener esta informacion  */

public List<Student> getAll(){
return  studentServices.getStudents();
    }


    /* */

}
