package app.patterns.factory;

import app.model.User;
import app.model.UserDao;
import app.repository.dao.design.ITeacherDao;
import app.repository.dao.implement.TeacherDaoImpl;

public class TeacherDao implements ILogin{

	ITeacherDao teacherDao = new TeacherDaoImpl();

	@Override
	public UserDao getuser(Long idUser) {
		return teacherDao.getDataTeacher(idUser);
	}
}
