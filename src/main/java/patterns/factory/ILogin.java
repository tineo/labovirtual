package patterns.factory;

import model.User;
import model.UserDao;

public interface ILogin {

	UserDao getuser(Long idUser);

}
