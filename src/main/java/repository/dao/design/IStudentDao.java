package repository.dao.design;

import repository.dto.UserDataDto;

public interface IStudentDao {

	UserDataDto getDataStudent(Long idUser);

}
