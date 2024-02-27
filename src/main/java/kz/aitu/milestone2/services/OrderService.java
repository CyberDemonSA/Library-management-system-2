package kz.aitu.milestone2.services;

import kz.aitu.milestone2.models.Order;
import kz.aitu.milestone2.models.User;
import kz.aitu.milestone2.repositories.OrderRepositoryInterface;
import kz.aitu.milestone2.repositories.UserRepositoryInterface;
import kz.aitu.milestone2.services.interfaces.OrderServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService  {
    private OrderRepositoryInterface orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}

