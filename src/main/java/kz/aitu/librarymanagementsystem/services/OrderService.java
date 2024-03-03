package kz.aitu.librarymanagementsystem.services;

import kz.aitu.librarymanagementsystem.models.Order;
import kz.aitu.librarymanagementsystem.repositories.OrderRepositoryInterface;
import kz.aitu.librarymanagementsystem.services.interfaces.OrderServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrderService implements OrderServiceInterface {

    private final OrderRepositoryInterface repo;

    public OrderService(OrderRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Order> getAll() {
        return repo.findAll();
    }

    @Override
    public Order getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Order create(Order order) {
        return repo.save(order);
    }

}