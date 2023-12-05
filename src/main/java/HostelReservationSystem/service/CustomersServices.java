package HostelReservationSystem.service;

import HostelReservationSystem.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Service
public class CustomersServices {
    private final CustomersRepository customersRepository;

    @Autowired
    public CustomersServices(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }
}
