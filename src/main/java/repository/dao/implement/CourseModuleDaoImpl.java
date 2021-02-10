package repository.dao.implement;

import model.CourseModule;
import repository.dao.design.IClassDao;
import repository.dao.design.ICourseModuleDao;
import repository.daoDataSource.CloseResources;
import repository.daoDataSource.DataSourceDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseModuleDaoImpl implements ICourseModuleDao {

	DataSourceDao dataSourceDao = DataSourceDao.getInstance();
	IClassDao classDao = new ClassDaoImpl();

	public List<CourseModule> getCourseModuleByIdCourse(Long idCourse) {
		List<CourseModule> courseModuleList = null;
		Connection connection = dataSourceDao.connect();
		String sql = "select mc.id_modulo, mc.titulo "
				+ "from modulo_curso mc "
				+ "where mc.idCurso5 = ?";

		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, idCourse);
			resultSet = preparedStatement.executeQuery();
			courseModuleList = new ArrayList<CourseModule>();
			while (resultSet.next()) {
				courseModuleList.add(new CourseModule(resultSet.getLong("id_modulo"),
						resultSet.getString("titulo"),
						classDao.getClassByIdCourseModule(resultSet.getLong("id_modulo"))));
			}

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} finally {
			dataSourceDao.disconnect();
			CloseResources.closeResources(preparedStatement, resultSet);
		}

		return courseModuleList;
	}

	@Override
	public void saveNewCourseModule(Long idCourse, CourseModule courseModule) {
		Connection connection = dataSourceDao.connect();
		String sql = "insert into modulo_curso (titulo, idCurso5) values (?, ?)";

		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, courseModule.getTitle());
			preparedStatement.setLong(2, idCourse);
			preparedStatement.executeUpdate();

		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} finally {
			dataSourceDao.disconnect();
			CloseResources.closeResources(preparedStatement);
		}
	}

	@Override
	public void saveNewCourseModule(CourseModule courseModule) {

	}
}
