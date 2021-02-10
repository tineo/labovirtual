package repository.dao.design;

import model.Teacher;
import repository.dto.UserDataDto;

import java.util.List;

public interface ITeacherDao {

	List<Teacher> getTeachers();
	UserDataDto getDataTeacher(Long idUser);
}
