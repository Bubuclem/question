package fr.gamedev.question.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.gamedev.question.data.Skill;

//TODO grp1 by DJE : JavaDoc : Est-ce vraiment le bon Author ?
/**
 * @author djer1
 *
 */
@RepositoryRestResource(collectionResourceRel = "skill", path = "skill")
public interface SkillRepository extends PagingAndSortingRepository<Skill, Long> {

}
