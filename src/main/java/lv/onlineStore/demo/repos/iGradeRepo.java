package lv.onlineStore.demo.repos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lv.onlineStore.demo.models.Grade;

public interface iGradeRepo extends CrudRepository<Grade, Integer> {

	//no data JPA genereta, svarigs definet nosaukumu funkcijas
	ArrayList<Grade> findByStudentIdStudent(int studentID);

	//no data JPA genereta svarigs definet nosaukumu funkcijas

	ArrayList<Grade> findByCourseIdCourse(int courseID);


	//no data JPA genereta svarigs definet nosaukumu funkcijas
	ArrayList<Grade> findByValueLessThan(int i);


	//pašu veidota sql funkcija, nav svarigs funkcijas nosaukums
	//@Query(value="select avg(value) from Grade where course_id=?1",nativeQuery = true)
	//float calculateAVGFromSubject(int subjectId);
	@Query(value="select avg(value) from Grade where course_id=?1",nativeQuery = true)
	float calculateAVGFromCourse(int subjectId);

	

	

}
