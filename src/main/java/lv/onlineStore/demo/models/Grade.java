package lv.onlineStore.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Grade {
	
	@Setter(value=AccessLevel.NONE)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Grade_ID")
	private long g_ID;
	
	@Column(name="Value")
	private int value;
	
	//@Column(name="Student")
	@ManyToOne
	@JoinColumn(name = "Student_ID")
	private Student student;
	
	//@Column(name="Course")
	@ManyToOne
	@JoinColumn(name = "Course_ID")
	private Course course;
	
	
	
	
	public Grade(int value, Student student, Course course) {
		
		this.value = value;
		this.student = student;
		this.course = course;
	}
	
	
	
	
}
