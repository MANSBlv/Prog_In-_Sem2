package lv.onlineStore.demo.repos;

import org.springframework.data.repository.CrudRepository;

import lv.onlineStore.demo.models.Grade;

public interface iGradeRepo extends CrudRepository<Grade, Long> {

}
