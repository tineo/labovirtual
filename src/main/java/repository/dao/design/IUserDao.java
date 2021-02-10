package repository.dao.design;

import repository.dto.UserDataDto;
import repository.dto.UserLoginDto;

public interface IUserDao {

	UserLoginDto authentication(String username, String password);
	UserDataDto getDataAdmin(Long idUser);

}
