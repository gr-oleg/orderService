package com.order.orderservice.service;

import com.order.orderservice.model.order;

import java.util.List;
import java.util.Optional;

public interface orderService {
    public order saveOrder(order order);
    List<order> getAllOrders();
    Optional<order> findById(int id);
    List<order> findByIdItems(String idItems);
    List<order> findByIdUser(int idUser);
}