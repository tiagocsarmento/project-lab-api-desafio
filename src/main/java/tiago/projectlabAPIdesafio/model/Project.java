package tiago.projectlabAPIdesafio.model;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity(name = "design_project")

public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String designer;
	private String status;
	@JdbcTypeCode(SqlTypes.JSON)
	private InteriorProject interiorProject;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesigner() {
		return designer;
	}
	public void setDesigner(String designer) {
		this.designer = designer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public InteriorProject getInteriorProject() {
		return interiorProject;
	}
	public void setInteriorProject(InteriorProject interiorProject) {
		this.interiorProject = interiorProject;
	}
	
	
}
