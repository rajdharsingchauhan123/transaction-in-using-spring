package com.example.transaction.in.using.spring.dto;

import com.example.transaction.in.using.spring.entity.PassengerInfo;
import com.example.transaction.in.using.spring.entity.PaymentnINfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowlegement {
    private String status;
    private double totalFare;

    private String pnrNO;
    private PassengerInfo passengerInfo;
}
