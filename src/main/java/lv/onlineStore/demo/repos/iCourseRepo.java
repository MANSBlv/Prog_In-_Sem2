package lv.onlineStore.demo.repos;

import org.springframework.data.repository.CrudRepository;

import lv.onlineStore.demo.models.Course;

public interface iCourseRepo extends CrudRepository<Course, Integer> {

}
