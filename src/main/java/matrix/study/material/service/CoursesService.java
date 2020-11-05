package matrix.study.material.service;

import io.micronaut.http.HttpResponse;
import matrix.study.material.dto.CourseDTO;

import java.util.List;

public interface CoursesService {

    public List<CourseDTO> getCourses();

    public CourseDTO createCourse(CourseDTO course);
}
