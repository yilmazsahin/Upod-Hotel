package HostelReservationSystem.repository;

import HostelReservationSystem.entity.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author malisahin
 * @since 12/1/2023
 */

public interface RoomsRepository extends JpaRepository<Rooms,Integer> {
}
