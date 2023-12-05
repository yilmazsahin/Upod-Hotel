package HostelReservationSystem.service;

import HostelReservationSystem.entity.Reservations;
import HostelReservationSystem.repository.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Service
public class ReservationsService {
    private final ReservationsRepository reservationsRepository;

    @Autowired
    public ReservationsService(ReservationsRepository reservationsRepository) {
        this.reservationsRepository = reservationsRepository;
    }

    public List<Reservations> getAllReservations() {
        return reservationsRepository.findAll();
    }
}
