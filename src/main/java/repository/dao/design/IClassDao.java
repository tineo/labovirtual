package repository.dao.design;

import java.util.List;

import model.Class;

public interface IClassDao {

	List<Class> getClassByIdCourseModule(Long idCourseModule);
	void saveNewClass(Long idCourseModule, Class aClass);
	void saveNewClass(Class aClass);

}
