package app.patterns.factory;

import app.model.User;
import app.model.UserDao;
import app.repository.dao.design.IStudentDao;
import app.repository.dao.implement.StudentDaoImpl;

public class StudentDao implements ILogin {

	IStudentDao studentDao = new StudentDaoImpl();

	@Override
	public UserDao getuser(Long idUser) {
		return studentDao.getDataStudent(idUser);
	}
}
