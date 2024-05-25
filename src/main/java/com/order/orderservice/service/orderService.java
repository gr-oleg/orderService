package com.item.orderService.service;

import com.item.orderService.model.order;

import java.util.List;
import java.util.Optional;

public interface orderService {
    public order saveOrder(order order);
    List<order> getAllOrders();
    Optional<order> findById(int id);
    List<order> findByIdItems(int idItems);
    List<order> findByIdUser(int idUser);
}