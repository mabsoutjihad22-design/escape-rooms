package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Profil "passage" : chemin valide pour accéder aux chambres
@Service
@Profile("passage")
public class Room1Service implements RoomService {

    @Override
    public String entreeSalle() {
        return "Bravo, vous avez trouvé la deuxième salle !";
    }

}
