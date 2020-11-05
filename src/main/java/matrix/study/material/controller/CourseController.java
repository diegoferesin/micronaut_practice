package matrix.study.material.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import matrix.study.material.dto.CourseDTO;
import matrix.study.material.service.CoursesService;

import java.util.List;


public interface CourseController {

    HttpResponse<List<CourseDTO>> getCourses();

    CourseDTO createCourse(CourseDTO course);


}
