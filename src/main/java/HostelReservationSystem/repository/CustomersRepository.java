package HostelReservationSystem.repository;

import HostelReservationSystem.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author malisahin
 * @since 12/1/2023
 */

public interface CustomersRepository extends JpaRepository<Customers,Integer> {
}
