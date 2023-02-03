package com.example.transaction.in.using.spring.repository;

import com.example.transaction.in.using.spring.entity.PassengerInfo;
import com.example.transaction.in.using.spring.entity.PaymentnINfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymetnInfoRepo extends JpaRepository<PaymentnINfo,String> {
}
