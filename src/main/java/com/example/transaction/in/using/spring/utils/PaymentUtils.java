package com.example.transaction.in.using.spring.utils;

import com.example.transaction.in.using.spring.exception.InsufficieantAmountEx;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String, Double> paymentMap = new HashMap<>();
    {


            paymentMap.put("acc1", 12000.0);
            paymentMap.put("acc2", 10000.0);
            paymentMap.put("acc3", 5000.0);
            paymentMap.put("acc4", 8000.0);


    }
    public  static Boolean validateCreditLimit(String accNO,Double paidAmount){
        if(paidAmount>paymentMap.get(accNO)){
            throw new InsufficieantAmountEx("insuffient fund");

        }else {
            return true;
        }
    }
}