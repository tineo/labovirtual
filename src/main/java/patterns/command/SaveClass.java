package patterns.command;

import model.AbstractCourse;
import model.Class;
import repository.dao.design.IClassDao;
import repository.dao.implement.ClassDaoImpl;

public class SaveClass implements IOperation {

	IClassDao classDao = new ClassDaoImpl();
	private String title;

	public SaveClass (String title) {
		this.title = title;
	}

	@Override
	public void save() {
		Class aClass = new Class();
		aClass.setTitle(title);
		classDao.saveNewClass(aClass);
	}
}
