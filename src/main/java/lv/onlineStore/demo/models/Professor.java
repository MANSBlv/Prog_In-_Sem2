package lv.onlineStore.demo.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Collection;

//import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

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
public class Professor {
	@Setter(value=AccessLevel.NONE)
	@Column(name="Professor_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long p_ID;
	@Column(name="Name_Professor")
	private String name;
	
	@Column(name="Surname_Professor")
	private String surname;
	
	@Column(name="Degree")
	private String degree;
	
	//mappedBy vienmer janorada uz mainigo nosaukum
	/*@OneToOne(mappedBy ="professor" )
	@ToString.Exclude
	private Course course;
	*/
	@ManyToMany
	private Collection<Course> subjectss = new ArrayList<Course>();
	
	
	
	
	public Professor(String name, String surname, String degree) {
		
		this.name = name;
		this.surname = surname;
		this.degree = degree;
	}
	
	
	
	
	
}
