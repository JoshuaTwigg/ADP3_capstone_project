package com.college.controller;

import com.college.domain.Room;
import com.college.factory.RoomFactory;
import com.college.service.RoomService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    private Room room;

    public RoomController() {
        // No-arg constructor (can be empty)
    }



    @FXML
    private Button buttonVip; // must be the same as fx:id
    @FXML
    private Button buttonSuite;
    @FXML
    private Button buttonStandard;
    @FXML
    private Button buttonEconomy;

    @FXML
    private void handleVipClick() {
        System.out.println("Button clicked!");
        buttonVip.setText("Clicked!");
    }

    @FXML
    private void handleSuiteClick() {
        System.out.println("Button clicked!");
        buttonSuite.setText("Clicked!");
    }

    @FXML
    private void handleStandardClick() {
        System.out.println("Button clicked!");
        buttonStandard.setText("Clicked!");
    }

    @FXML
    private void handleEconomyClick() {
        System.out.println("Button clicked!");
        buttonEconomy.setText("Clicked!");
    }



    public RoomController(RoomService roomService) {
        this.roomService = roomService;
        room = RoomFactory.createRoom(1, "Single", 100.0f, true, "WiFi, TV");
    }


    @RequestMapping("/test")
    Room save(Room room) {
        return roomService.create(room);
    }

    @RequestMapping("/read")
    String read(int id) {
        roomService.read(id);
        return "welcome";
    }

    @RequestMapping("/update")
    String update(Room room) {
        roomService.update(room);
        return "welcome";
    }

    @RequestMapping("/delete")
    String delete(int id) {
        roomService.delete(id);
        return "welcome";
    }
}
