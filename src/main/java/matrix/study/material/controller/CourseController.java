package matrix.study.material.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import matrix.study.material.dto.CourseDTO;


// TODO Por qué declaro el path acá y también abajo?
@Controller("/")
public class CourseController {

    // TODO Qué reemplaza al "ResposeEntity" de Spring?
    @Get("/courses")
    public CourseDTO getCourses(){

        return this.courseService.getCourses();

    }




}
