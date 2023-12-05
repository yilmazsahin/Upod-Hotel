package HostelReservationSystem.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDate;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Data
@Entity
@Table(name = "customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerId")
    private int id;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "IdentityNumber")
    private String identityNumber;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "BirthDate")
    private LocalDate birthDate;

    @Column(name = "Description")
    private String description;
}
