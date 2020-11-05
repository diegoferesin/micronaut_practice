package matrix.study.material.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.RequestAttributes;
import matrix.study.material.dto.CourseDTO;
import matrix.study.material.service.CoursesService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

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
    public CourseDTO createCourse(@Valid final CourseDTO course) {

        return this.coursesService.createCourse(course);
    }

    @Override
    public List<CourseDTO> getCourseByTag(final String sentence) {

        return this.coursesService.getCourses().stream()
                .filter(courseDTO -> courseDTO.getTags().contains(sentence))
                .collect(Collectors.toList());
    }
}
