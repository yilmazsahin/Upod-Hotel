package HostelReservationSystem.controller;

import HostelReservationSystem.entity.Reservations;
import HostelReservationSystem.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@Controller
public class PageController {
    private final ReservationsService reservationsService;
    @Autowired
    public PageController(ReservationsService reservationsService) {
        this.reservationsService = reservationsService;
    }
    @GetMapping("/")
    public String showReservations(Model model) {
        List<Reservations> reservationsList = reservationsService.getAllReservations();
        model.addAttribute("reservations",reservationsList);
        return "index";
    }
}