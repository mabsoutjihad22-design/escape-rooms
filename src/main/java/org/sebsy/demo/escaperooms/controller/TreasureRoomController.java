package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TreasureRoomController {

    private TreasureService tresorService;

    // Injection par setter (comme dans l'original, on garde le setter)
    @Autowired
    public void setTresorService(TreasureService tresorService) {
        this.tresorService = tresorService;
    }

    public String fin() {
        return tresorService.ouvrir();
    }

}
