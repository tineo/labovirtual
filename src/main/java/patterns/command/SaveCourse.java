package patterns.command;

import model.AbstractCourse;
import model.Course;
import repository.dao.design.ICourseDao;
import repository.dao.implement.CourseDaoImpl;

public class SaveCourse implements IOperation {

	private ICourseDao courseDao = new CourseDaoImpl();
	private String title;

	public SaveCourse (String title) {
		this.title = title;
	}

	@Override
	public void save() {
		Course course = new Course();
		course.setTitle(title);
		courseDao.saveNewCourse(course);
	}
}
