package lv.onlineStore.demo.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Table
@Entity
@Getter
@Setter 
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Setter(value=AccessLevel.NONE)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Student_ID")
	private long st_ID;
	
	@Column(name="Name_Student")
	private String name;
	
	@Column(name="Surname_Student")
	private String surname;
	
	@OneToMany(mappedBy = "student")
	@ToString.Exclude
	private ArrayList<Grade> grade;
	
	public Student(String name, String surname) {
		
		this.name = name;
		this.surname = surname;
	}
	

	

}
