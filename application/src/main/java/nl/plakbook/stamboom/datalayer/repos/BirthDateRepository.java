package nl.plakbook.stamboom.datalayer.repos;

import nl.plakbook.stamboom.datalayer.entities.BirthDate;
import org.springframework.data.repository.CrudRepository;

public interface BirthDateRepository extends CrudRepository<BirthDate, Long> {
}
