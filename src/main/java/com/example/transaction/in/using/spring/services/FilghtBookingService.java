package com.example.transaction.in.using.spring.services;

import com.example.transaction.in.using.spring.dto.FlightBookingAcknowlegement;
import com.example.transaction.in.using.spring.dto.FlightBookingRequest;
import com.example.transaction.in.using.spring.entity.PassengerInfo;
import com.example.transaction.in.using.spring.entity.PaymentnINfo;
import com.example.transaction.in.using.spring.repository.PassengerInfoRepository;
import com.example.transaction.in.using.spring.repository.PaymetnInfoRepo;
import com.example.transaction.in.using.spring.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class FilghtBookingService {

    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymetnInfoRepo paymetnInfoRepo;

@Transactional
    public FlightBookingAcknowlegement bookFilghtTicket(FlightBookingRequest request){



        PassengerInfo passengerInfo =request.getPassengerInfo();
        passengerInfo=passengerInfoRepository.save(passengerInfo);

        PaymentnINfo paymentnINfo =request.getPaymentnINfo();

        PaymentUtils.validateCreditLimit(paymentnINfo.getAccountNo(),passengerInfo.getFare());

        paymentnINfo.setPassengerld(passengerInfo.getPld());
        paymentnINfo.setAmount(passengerInfo.getFare());
        paymetnInfoRepo.save(paymentnINfo);

        return new FlightBookingAcknowlegement("sucess", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);

    }
}
