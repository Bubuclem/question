package fr.gamedev.question.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.gamedev.question.data.Preference;

/**
 * @author djer1
 *
 */
@RepositoryRestResource(collectionResourceRel = "preference", path = "preference")
public interface PreferenceRepository extends PagingAndSortingRepository<Preference, Long> {

}
