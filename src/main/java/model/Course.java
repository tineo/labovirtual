package model;

import patterns.prototype.ICloneable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends AbstractCourse implements ICloneable {

	private Long idCourse;
	private String title;
	private String description;
	private Double cost;
	private String start;
	private String end;
	private String imageName;
	private String image;
	private List<CourseModule> courseModuleList;

	@Override
	public ICloneable clone() {
		Course course = null;

		course = (Course) clone();

		return course;
	}
}
