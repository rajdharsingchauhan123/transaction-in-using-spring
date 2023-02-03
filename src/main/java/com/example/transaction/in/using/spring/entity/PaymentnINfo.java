package com.example.transaction.in.using.spring.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PAYMETN_INFO")
public class PaymentnINfo {

        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2",strategy = "org.hibernate.id.UUIDGenerator")
        private String paymentId;

        private String accountNo;
        private double amount;
        private String cardType;
        private Long passengerld;

}
