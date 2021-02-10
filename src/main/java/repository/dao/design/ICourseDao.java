package repository.dao.design;

import model.Course;

import java.util.List;

public interface ICourseDao {

	List<Course> getAllCourses();
	Course getCourseByIdCourse(Long idCourse);
	List<Course> getCoursesByDni(String dni);
	void saveNewCourse(Long idTeacher, Course course);
	void saveNewCourseOfUser(Long idUser, Long idCourse);
	void payCourse(Long idUser, Long idCourse, Double cost);
	void saveNewCourse(Course course);


}
