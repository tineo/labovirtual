package patterns.factory;

import model.User;
import model.UserDao;
import repository.dao.design.ITeacherDao;
import repository.dao.implement.TeacherDaoImpl;

public class TeacherDao implements ILogin{

	ITeacherDao teacherDao = new TeacherDaoImpl();

	@Override
	public UserDao getuser(Long idUser) {
		return teacherDao.getDataTeacher(idUser);
	}
}
