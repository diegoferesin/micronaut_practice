package matrix.study.material.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import matrix.study.material.dto.CourseDTO;
import matrix.study.material.service.CoursesService;

import java.util.List;

@Controller("/")
public class CourseControllerImpl implements CourseController {

    private CoursesService coursesService;

    public CourseControllerImpl(final CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @Get("/courses")
    public HttpResponse<List<CourseDTO>> getCourses() {

        return HttpResponse.ok(this.coursesService.getCourses());

    }

    @Override
    public CourseDTO createCourse(final CourseDTO course) {

        if (course.getIsActive()) {

            return this.coursesService.createCourse(course);
        }

        return null;

    }
}
