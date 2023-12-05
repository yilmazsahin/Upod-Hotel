package HostelReservationSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/")
public class UpodHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpodHotelApplication.class, args);
	}

}
