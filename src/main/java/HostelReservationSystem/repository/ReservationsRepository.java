package HostelReservationSystem.repository;


import HostelReservationSystem.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

/**
 * @author malisahin
 * @since 12/1/2023
 */

public interface ReservationsRepository extends JpaRepository<Reservations, Integer> {
    List<Reservations> findAll();
}
