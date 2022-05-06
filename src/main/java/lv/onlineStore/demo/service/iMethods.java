package lv.onlineStore.demo.service;

import java.util.ArrayList;

import lv.onlineStore.demo.models.Course;
import lv.onlineStore.demo.models.Grade;
import lv.onlineStore.demo.models.Professor;
import lv.onlineStore.demo.models.Student;

public interface iMethods {

	//public abstract ArrayList<Student> selectAllStudents();
	//public abstract ArrayList<Professor> selectAllProfessors();
	//public abstract ArrayList<Course> selectAllSubjects();
	public abstract ArrayList<Grade> selectAllGradesFromStudentById(int studentID);
	public abstract ArrayList<Grade> selectAllGradesFromCourseById(int courseID);
	public abstract ArrayList<Grade> selectAllBadGrades();
	public abstract float getAVGSubject(int subjectId);

	//public abstract Grade selectGradesByStudent(Student student);
	//public abstract Course selectCoursesByStudent(Student student);
	
}
