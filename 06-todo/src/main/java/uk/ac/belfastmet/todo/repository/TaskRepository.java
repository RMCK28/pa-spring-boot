package uk.ac.belfastmet.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.todo.domain.*;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
