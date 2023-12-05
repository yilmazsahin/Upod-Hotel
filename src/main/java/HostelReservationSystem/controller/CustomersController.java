package HostelReservationSystem.controller;

import HostelReservationSystem.service.CustomersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Controller
@RequestMapping("/customers")
public class CustomersController {
    private final CustomersServices customersService;

    @Autowired
    public CustomersController(CustomersServices customersService) {
        this.customersService = customersService;
    }
}
