package com.lh.springcloud.serviece;

import com.lh.springcloud.dao.PaymentDao;
import com.lh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
