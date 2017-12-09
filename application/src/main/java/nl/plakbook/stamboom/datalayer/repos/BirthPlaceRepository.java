package nl.plakbook.stamboom.datalayer.repos;

import nl.plakbook.stamboom.datalayer.entities.BirthPlace;
import org.springframework.data.repository.CrudRepository;

public interface BirthPlaceRepository extends CrudRepository<BirthPlace, Long> {
}
