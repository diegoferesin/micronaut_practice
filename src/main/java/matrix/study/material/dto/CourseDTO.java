package matrix.study.material.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO implements Serializable {

    private Long courseId;
    private String title;
    private String description;
    private String link;
    private List<String> tags;
    private Boolean isActive;


}
