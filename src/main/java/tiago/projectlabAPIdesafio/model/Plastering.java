package tiago.projectlabAPIdesafio.model;

import jakarta.persistence.*;

@Entity(name = "plastering")
public class Plastering {
	@Column(name = "plaster_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String floor;
	private String walls;
	private String ceiling;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public String getWalls() {
		return walls;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public String getCeiling() {
		return ceiling;
	}
	public void setCeiling(String ceiling) {
		this.ceiling = ceiling;
	}
}

