package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Profil "trap" : vous êtes dans une impasse
@Service
@Profile("trap")
public class Room2Service implements RoomService {

    @Override
    public String entreeSalle() {
        return "Perdu, vous etes dans la mauvaise salle !";
    }

}
