package lv.onlineStore.demo.service.impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lv.onlineStore.demo.models.Course;
import lv.onlineStore.demo.models.Grade;
import lv.onlineStore.demo.models.Professor;
import lv.onlineStore.demo.models.Student;
import lv.onlineStore.demo.repos.iCourseRepo;
import lv.onlineStore.demo.repos.iGradeRepo;
import lv.onlineStore.demo.repos.iProfessorRepo;
import lv.onlineStore.demo.repos.iStudentRepo;
import lv.onlineStore.demo.service.iMethods;

@Service
public class MethodsImpl implements iMethods{
	@Autowired
	//private iCourseRepo cRepo;
	private iGradeRepo gRepo;
	//private iStudentRepo sRepo;
	//private iProfessorRepo pRepo;
	@Override
	public ArrayList<Grade> selectAllGradesFromStudentById(int studentID) {
		ArrayList<Grade> result= gRepo.findByStudentIdStudent(studentID);
		return result;
		
	}
	@Override
	public ArrayList<Grade> selectAllGradesFromCourseById(int courseID) {
		ArrayList<Grade> result= gRepo.findByCourseIdCourse(courseID);
		return result;
	}
	@Override
	public ArrayList<Grade> selectAllBadGrades() {
		ArrayList<Grade> result= gRepo.findByValueLessThan(4);
		return result;
	}
	@Override
	public float getAVGSubject(int subjectId) {
		float result= gRepo.calculateAVGFromCourse(subjectId);
		return result;
	}
	
	
	
	/*@Override
	public ArrayList<Student> selectAllStudents() {
		return (ArrayList<Student>) sRepo.findAll();
	}

	@Override
	public ArrayList<Professor> selectAllProfessors() {
		return (ArrayList<Professor>) pRepo.findAll();
	}

	@Override
	public ArrayList<Course> selectAllSubjects() {
		return (ArrayList<Course>) cRepo.findAll();
	}

	@Override
	public ArrayList<Grade> selectAllGrades() {
		return (ArrayList<Grade>) gRepo.findAll();
	}

	@Override
	public Grade selectGradesByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course selectCoursesByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
*/
	
	
}
