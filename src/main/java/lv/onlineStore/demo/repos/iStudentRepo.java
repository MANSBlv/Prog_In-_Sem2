package lv.onlineStore.demo.repos;

import org.springframework.data.repository.CrudRepository;

import lv.onlineStore.demo.models.Student;

public interface iStudentRepo extends CrudRepository<Student, Integer>{

}
