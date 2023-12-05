package HostelReservationSystem.entity;

import HostelReservationSystem.entity.Customers;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Data
@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "Room")
    private Rooms room;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "CheckIn_Date")
    private LocalDate checkInDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "CheckOut_Date")
    private LocalDate checkOutDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Checked_In")
    private LocalDate checkedIn;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Checked_Out")
    private LocalDate checkedOut;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;
}
