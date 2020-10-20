package com.example.demo.entity;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Entity
/*
 * @NoArgsConstructor
 * 
 * @AllArgsConstructor
 * 
 * @Getter
 * 
 * @Setter
 */
@Table(name="Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "id")
	private int id;
	@Column(name = "UserName")
	private String userName;
	@Column(name = "age")
	private int age;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return userName+" "+age	;
	}
//	@OneToMany(targetEntity = Movie.class)
//	private List movielist;
}
