package lv.onlineStore.demo.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
//@AllArgsConstructor
public class Course {
	
	@Setter(value=AccessLevel.NONE)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Course_ID")
	private long c_ID;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Credit_Point")
	private int creditPoint;
	
	
	
	//@Column(name="Professor")
	@OneToOne
	@JoinColumn(name="Professor_ID")
	private Professor professor;
	
	
	@OneToMany(mappedBy = "course")
	@ToString.Exclude
	private ArrayList<Grade> grades;
	
	
	
	
	public Course(String title, int creditPoint, Professor professor) {
		
		this.title = title;
		this.creditPoint = creditPoint;
		this.professor = professor;
	}
	
	
	
}
