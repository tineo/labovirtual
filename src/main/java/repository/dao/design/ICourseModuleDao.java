package repository.dao.design;

import model.CourseModule;

import java.util.List;

public interface ICourseModuleDao {

	List<CourseModule> getCourseModuleByIdCourse(Long idCourse);
	void saveNewCourseModule(Long idCourse, CourseModule courseModule);
	void saveNewCourseModule(CourseModule courseModule);
}
