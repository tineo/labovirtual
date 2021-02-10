package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseModule extends AbstractCourse {

	private Long idCourseModule;
	private String title;
	List<Class> classList = new ArrayList<Class>();

}
