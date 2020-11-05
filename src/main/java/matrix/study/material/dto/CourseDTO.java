package matrix.study.material.dto;

import io.micronaut.validation.Validated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO implements Serializable {

    private Long courseId;
    @Valid
    private String title;
    private String description;
    @Valid
    private String link;
    private List<String> tags;
    private Boolean isActive;


}
