package com.order.orderservice.controller;

import com.order.orderservice.model.order;
import com.order.orderservice.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class orderController {
    @Autowired
    private orderService orderService;

@PostMapping("/add")
public String add(@RequestBody order order){
    Optional<order> existingItem = orderService.findById(order.getId());
    orderService.saveOrder(order);
    return "Order accepted!";
}

    @GetMapping("/getAll")
    public List<order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/id/{id}")
    public Optional<order> getOrderById(@PathVariable int id){
        return orderService.findById(id);
    }

    @GetMapping("/idItems/{idItems}")
    public List<order> getOrdersByIdItems(@PathVariable int idItems){
        return orderService.findByIdItems(idItems);
    }

    @GetMapping("/idUser/{idUser}")
    public List<order> getOrdersByIdUser(@PathVariable int idUser){
        return orderService.findByIdUser(idUser);
    }

}