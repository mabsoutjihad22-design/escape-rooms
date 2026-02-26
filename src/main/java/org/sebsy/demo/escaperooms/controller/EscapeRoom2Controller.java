package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Spring utilise le nom du bean "room2" pour la récupération dans Startup
@Component("room2")
public class EscapeRoom2Controller {

    private final RoomService roomService;

    // Injection par constructeur
    @Autowired
    public EscapeRoom2Controller(RoomService roomService) {
        this.roomService = roomService;
    }

    public void entreeSalle2() {
        System.out.println(roomService.entreeSalle());
    }

}
