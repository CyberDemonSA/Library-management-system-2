package kz.aitu.librarymanagementsystem.controllers;

import kz.aitu.librarymanagementsystem.models.Order;
import kz.aitu.librarymanagementsystem.models.User;
import kz.aitu.librarymanagementsystem.services.interfaces.OrderServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    private final OrderServiceInterface service;

    public OrderController(OrderServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Order> getAll(){
        return service.getAll();
    }

    @GetMapping("/{order_id}")
    public ResponseEntity<Order> getById(@PathVariable("order_id") int id){
        Order order = service.getById(id);
        if(order == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(order, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<Order> create(@RequestBody Order order){
        Order createdOrder = service.create(order);
        if(createdOrder == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED); //201
    }

}