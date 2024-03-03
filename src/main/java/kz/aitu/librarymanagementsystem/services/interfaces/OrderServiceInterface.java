package kz.aitu.librarymanagementsystem.services.interfaces;

import kz.aitu.librarymanagementsystem.models.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAll();
    Order getById(int id);
    Order create(Order order);
}
