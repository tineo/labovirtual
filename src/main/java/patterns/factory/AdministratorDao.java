package app.patterns.factory;

import app.model.UserDao;

public class AdministratorDao implements ILogin {
	@Override
	public UserDao getuser(Long idUser) {
		return null;
	}
}
