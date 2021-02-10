package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Class extends AbstractCourse {

	private Long idClass;
	private String title;
	private String description;
	private String urlLink;

}
