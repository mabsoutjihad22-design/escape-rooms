package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Profil "trap" : vous êtes tombé dans un piège
@Service
@Profile("trap")
public class Treasure1Service implements TreasureService {

    @Override
    public String ouvrir() {
        return "Perdu, vous êtes tombé dans un piège !";
    }

}
