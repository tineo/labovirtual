package app.patterns.command;

import app.model.AbstractCourse;
import app.model.Class;
import app.repository.dao.design.IClassDao;
import app.repository.dao.implement.ClassDaoImpl;

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
