package tiago.projectlabAPIdesafio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity(name="interior_ambient")
public class InteriorAmbient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@JdbcTypeCode(SqlTypes.JSON)
	private Plastering plastering;
	
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
	public Plastering getPlastering() {
		return plastering;
	}
	public void setPlastering(Plastering plastering) {
		this.plastering = plastering;
	}
}
