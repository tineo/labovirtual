package patterns.command;

import model.AbstractCourse;
import model.CourseModule;
import repository.dao.design.ICourseModuleDao;
import repository.dao.implement.CourseModuleDaoImpl;

public class SaveCourseModule implements IOperation {

	private ICourseModuleDao courseModuleDao = new CourseModuleDaoImpl();
	private String title;

	public SaveCourseModule (String title) {
		this.title = title;
	}

	@Override
	public void save() {
		CourseModule courseModule = new CourseModule();
		courseModule.setTitle(title);
		courseModuleDao.saveNewCourseModule(courseModule);
	}
}
