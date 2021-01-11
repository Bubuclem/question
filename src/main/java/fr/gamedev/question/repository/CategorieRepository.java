package fr.gamedev.question.repository;
//TODO grp1 by DJE : CheckStyle : corrige les remarques de qualité de code surtout lorsqu'elles sont faciles ! (Les fichier de code source doivent se terminer par une ligne vide)

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.gamedev.question.data.Categorie;

/**
 * @author djer1
 *
 */
@RepositoryRestResource(collectionResourceRel = "categorie", path = "categorie")
public interface CategorieRepository extends PagingAndSortingRepository<Categorie, Long> {

}