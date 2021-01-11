package fr.gamedev.question;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author djer1
 *
 */
@RestController
public class ResponseController {
    //TODO grp1 by DJE : JavaDoc : le @return est en général à la fin : première ligne description, puis paramètres et enfin le return.
    /**
     * @return response
     * @param questionId
     * @param answer
     * @param userId
     */
    @GetMapping("/response")
    public String answer(@RequestParam final long questionId, @RequestParam final Boolean answer,
            @RequestParam final long userId) {
        String response;
        //TODO grp1 by DJE : Java : où est l'implementation ?? (Sauvegarde de la répose et des points)
        //DJE : 1- rechercher la question
        //DJE : 2- rechercher la bonne réponse associé
        //DJE : 3- vérifier s'il y a correspondance
        //DJE : 4- identifier le nombre de points ganagé (0 ou 5)
        //DJE : 5- créer un UserResponse et le sauvegarder
        //DJE : 6- fournir une réponse.
        if (answer == Boolean.TRUE) {
            // Ajouter des points

            response = "Bravo ! vous avez trouvé ! ";
        } else {
            // Ne pas ajouter de points

            response = "Oops ! Ca n'est pas correcte";
        }

        return response;
    }

}
