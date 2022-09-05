package com.WeatherApp.Backend.entity;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "watchlist")
public class watchlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "city")
	private String city;
	public watchlist() {
	}
}
