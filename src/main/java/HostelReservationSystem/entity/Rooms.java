package HostelReservationSystem.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Data
@Entity
@Table(name = "rooms")
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoomId")
    private int roomId;

    @Column(name = "RoomName")
    private String roomName;

    @Column(name = "Capacity")
    private int capacity;

    @Column(name = "Price")
    private double price;

    @Column(name = "Features")
    private String features;

    @Column(name = "TotalRooms")
    private int totalRooms;

    @Column(name = "AvailableRooms")
    private int availableRooms;
    @OneToMany(mappedBy = "room")
    private List<Reservations> reservations;

}
