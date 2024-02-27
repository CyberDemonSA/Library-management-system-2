package kz.aitu.demo.controllers;

import kz.aitu.demo.models.Order;
import kz.aitu.demo.services.interfaces.OrderServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders_of_books")
public class OrderController {

    private final OrderServiceInterface service;

    public OrderController(OrderServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Order> getAll(){
        return service.getAll();
    }

    @GetMapping("/{ordert_id}")
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

    @GetMapping("/user_client_id/{user_client_id}")
    public List<Order> getAllByUserId(@PathVariable("user_client_id") int user_client_id){
        return service.getByUserId(user_client_id);
    }

}