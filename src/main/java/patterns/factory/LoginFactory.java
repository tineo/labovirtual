package patterns.factory;

public class LoginFactory {

	public static ILogin getLogin(String user) {
		if(user.equalsIgnoreCase("STUDENT")) {
			return new StudentDao();
		} else if(user.equalsIgnoreCase("TEACHER")) {
			return new TeacherDao();
		} else if(user.equalsIgnoreCase("ADMINISTRATOR")) {
			return new AdministratorDao();
		}
		return null;
	}

}
