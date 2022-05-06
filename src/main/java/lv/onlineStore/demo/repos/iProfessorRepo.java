package lv.onlineStore.demo.repos;

import org.springframework.data.repository.CrudRepository;

import lv.onlineStore.demo.models.Professor;

public interface iProfessorRepo extends CrudRepository<Professor, Integer> {

}
