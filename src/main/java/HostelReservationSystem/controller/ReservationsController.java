package HostelReservationSystem.controller;

import HostelReservationSystem.entity.Reservations;
import HostelReservationSystem.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author malisahin
 * @since 12/4/2023
 */

@Controller
@RequestMapping("/api")
public class ReservationsController {
    private final ReservationsService reservationsService;
    @Autowired
    public ReservationsController(ReservationsService reservationsService){
        this.reservationsService = reservationsService;
    }
    @GetMapping("/reservations")
    public List<Reservations> getAllReservations(){
        return reservationsService.getAllReservations();
    }
}
