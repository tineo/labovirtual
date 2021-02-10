package patterns.factory;

import model.User;
import model.UserDao;
import repository.dao.design.IStudentDao;
import repository.dao.implement.StudentDaoImpl;

public class StudentDao implements ILogin {

	IStudentDao studentDao = new StudentDaoImpl();

	@Override
	public UserDao getuser(Long idUser) {
		return studentDao.getDataStudent(idUser);
	}
}
