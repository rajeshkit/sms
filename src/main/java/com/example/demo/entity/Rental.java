package com.example.demo.entity;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Table(name="Rentals")
public class Rental {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "id")
	private int id;
	@Column(name = "rentalName")
	private String rentalName;
	@Column(name = "amount")
	private int amount;
	
//	@OneToMany(targetEntity = Movie.class)
//	private List movielist;

}
