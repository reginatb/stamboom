package nl.plakbook.stamboom.datalayer.repos;

import nl.plakbook.stamboom.datalayer.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
