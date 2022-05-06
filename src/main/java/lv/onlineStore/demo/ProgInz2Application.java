package lv.onlineStore.demo;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import lv.onlineStore.demo.models.Course;
import lv.onlineStore.demo.models.Grade;
import lv.onlineStore.demo.models.Professor;
import lv.onlineStore.demo.models.Student;
import lv.onlineStore.demo.repos.iCourseRepo;
import lv.onlineStore.demo.repos.iGradeRepo;
import lv.onlineStore.demo.repos.iProfessorRepo;
import lv.onlineStore.demo.repos.iStudentRepo;

@SpringBootApplication
public class ProgInz2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProgInz2Application.class, args);
	}
	
	//@Bean
	public CommandLineRunner runner(iProfessorRepo profRepo, iStudentRepo studRepo,
			iCourseRepo courseRepo, iGradeRepo gradeRepo) {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Professor prof1 = new Professor("Maris", "Random", "Videne");
				Professor prof2 = new Professor("Vitaliks", "Nezinu", "Dr.ing");
				profRepo.save(prof1);
				profRepo.save(prof2);
				
				Student stud1= new Student("Vairis", "Kalns");
				Student stud2= new Student("Daube", "Saule");
				studRepo.save(stud1);
				studRepo.save(stud2);
				
				Course cour1 = new Course("Hacking", 4, new ArrayList<>(Arrays.asList(prof2)));
				Course cour2 = new Course("Breaking bad", 4, new ArrayList<>(Arrays.asList(prof1,prof2)));
				courseRepo.save(cour1);
				courseRepo.save(cour2);
				
				gradeRepo.save(new Grade(10, stud1, cour1));
				gradeRepo.save(new Grade(3, stud1, cour2));
				gradeRepo.save(new Grade(7, stud2, cour1));
			}
		};
	}

}
