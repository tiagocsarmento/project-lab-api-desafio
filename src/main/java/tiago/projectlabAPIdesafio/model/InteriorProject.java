package tiago.projectlabAPIdesafio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity(name = "interior_project")
public class InteriorProject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JdbcTypeCode(SqlTypes.JSON)
	private InteriorAmbient interiorAmbient;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public InteriorAmbient getInteriorAmbient() {
		return interiorAmbient;
	}

	public void setInteriorAmbient(InteriorAmbient interiorAmbient) {
		this.interiorAmbient = interiorAmbient;
	}
	
}
