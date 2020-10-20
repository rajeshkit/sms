package com.example.demo.entity;
import javax.persistence.*;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name="Movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "id")
	private int id;
	@Column(name = "movieName")
	private String movieName;
	@Column(name = "genre")
	private String genre;

}
