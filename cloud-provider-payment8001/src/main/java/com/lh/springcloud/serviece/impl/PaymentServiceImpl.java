package com.lh.springcloud.serviece.impl;

import com.lh.springcloud.dao.PaymentDao;
import com.lh.springcloud.entities.Payment;
import com.lh.springcloud.serviece.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentdao;

    @Override
    public int create(Payment payment) {
        return paymentdao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentdao.getPaymentById(id);
    }
}
