package app.patterns.factory;

import app.model.User;
import app.model.UserDao;

public interface ILogin {

	UserDao getuser(Long idUser);

}
