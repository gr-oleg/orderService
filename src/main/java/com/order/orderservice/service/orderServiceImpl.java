package com.order.orderservice.service;

import com.order.orderservice.model.order;
import com.order.orderservice.repository.orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class orderServiceImpl implements orderService {

    @Autowired
    private orderRepository orderRepository;

    @Override
    public order saveOrder(order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<order> findById(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<order> findByIdItems(String idItems) {
        return orderRepository.findByIdItems(idItems);
    }

    @Override
    public List<order> findByIdUser(int idUser) {
        return orderRepository.findByIdUser(idUser);
    }
}