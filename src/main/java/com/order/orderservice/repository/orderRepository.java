package com.order.orderservice.repository;

import com.order.orderservice.model.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface orderRepository extends JpaRepository<order, Integer> {
    Optional<order> findById(int id);
    List<order> findByIdItems(int idItems);
    List<order> findByIdUser(int idUser);
}