package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher extends UserDao {

	private Integer idTeacher;
	private Integer code;
	private List<Course> courses = new ArrayList<Course>();

}
