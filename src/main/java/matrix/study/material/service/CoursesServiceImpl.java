package matrix.study.material.service;

import io.micronaut.http.HttpResponse;
import matrix.study.material.dto.CourseDTO;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Arrays;
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

        List<String> tagsListJava = new ArrayList<>(Arrays.asList("Java, POO"));
        List<String> tagsListNet = new ArrayList<>(Arrays.asList(".Net", "Microsoft"));
        List<String> tagsListMySQL = new ArrayList<>(Arrays.asList("MySQL", "YourSQL"));
        List<String> tagsListMongoDB = new ArrayList<>(Arrays.asList("MongoDB", "NoSQL"));
        ;

        this.courses.add(CourseDTO.builder()
                .courseId(Long.valueOf(01))
                .title("Java")
                .description("Curso de Java")
                .link("https://micronaut.io/")
                .tags(tagsListJava)
                .isActive(Boolean.TRUE)
                .build());
        this.courses.add(CourseDTO.builder()
                .courseId(Long.valueOf(02))
                .title(".Net")
                .description("Curso de .Net")
                .link("https://dotnet.microsoft.com/")
                .tags(tagsListNet)
                .isActive(Boolean.TRUE)
                .build());
        this.courses.add(CourseDTO.builder()
                .courseId(Long.valueOf(03))
                .title("MySql")
                .description("Curso de MySQL")
                .link("https://www.mysql.com/")
                .tags(tagsListMySQL)
                .isActive(Boolean.TRUE).build());
        this.courses.add(CourseDTO.builder()
                .courseId(Long.valueOf(04))
                .title("MongoDB")
                .description("Curso de MongoDB")
                .link("https://www.mongodb.com/es")
                .tags(tagsListMongoDB)
                .isActive(Boolean.FALSE).build());
    }

    @Override
    public List<CourseDTO> getCourses() {
        return courses;
    }

    @Override
    public CourseDTO createCourse(final CourseDTO course) {
        return CourseDTO.builder()
                .courseId(course.getCourseId())
                .title(course.getTitle())
                .description(course.getDescription())
                .link(course.getLink())
                .tags(course.getTags())
                .isActive(Boolean.TRUE)
                .build();
    }
}
