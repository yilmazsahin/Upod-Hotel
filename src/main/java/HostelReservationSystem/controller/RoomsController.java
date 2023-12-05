package HostelReservationSystem.controller;

import HostelReservationSystem.entity.Rooms;
import HostelReservationSystem.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Controller
@RequestMapping("/rooms")
public class RoomsController {
    private final RoomsService roomsService;
    @Autowired
    public RoomsController(RoomsService roomsService) {
        this.roomsService = roomsService;
    }

    @GetMapping("/rooms")
    public String showRoomList(Model model) {
        List<Rooms> rooms = roomsService.getAllRooms();
        model.addAttribute("rooms", rooms);
        return "roomList";
    }
}
