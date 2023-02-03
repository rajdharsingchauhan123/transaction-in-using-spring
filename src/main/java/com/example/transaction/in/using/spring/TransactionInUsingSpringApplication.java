package com.example.transaction.in.using.spring;

import com.example.transaction.in.using.spring.dto.FlightBookingAcknowlegement;
import com.example.transaction.in.using.spring.dto.FlightBookingRequest;
import com.example.transaction.in.using.spring.services.FilghtBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionInUsingSpringApplication {

	@Autowired
	private FilghtBookingService filghtBookingService;
	@PostMapping("/bookflightticket")

	public FlightBookingAcknowlegement bookFlightTicket(@RequestBody FlightBookingRequest request){
		return filghtBookingService.bookFilghtTicket(request);
	}

	public static void main(String[] args) {
		SpringApplication.run(TransactionInUsingSpringApplication.class, args);
	}

}
