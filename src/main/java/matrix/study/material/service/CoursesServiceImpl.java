package matrix.study.material.service;

import io.micronaut.http.HttpResponse;
import matrix.study.material.dto.CourseDTO;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class CoursesServiceImpl implements CoursesService {

    private List<CourseDTO> courses;

    private Long courseId;
    private String title;
    private String description;
    private String link;
    private List<String> tags;
    private Boolean isActive;

    public CoursesServiceImpl() {
        this.courses = new ArrayList<>();
        this.courses.add(CourseDTO.builder()
                .courseId(Long.valueOf(01))
                .title("Java")
                .description("Curso de Java")
                .link("https://micronaut.io/")
                .isActive(Boolean.TRUE).build());
        this.courses.add(CourseDTO.builder().title(".Net").isActive(Boolean.TRUE).build());
        this.courses.add(CourseDTO.builder().title("MySql").isActive(Boolean.TRUE).build());
        this.courses.add(CourseDTO.builder().title("MongoDB").isActive(Boolean.FALSE).build());


    }

    @Override
    public List<CourseDTO> getCourses() {
        return null;
    }

    @Override
    public CourseDTO createCourse() {
        return null;
    }
}
