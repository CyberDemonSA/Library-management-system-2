package kz.aitu.demo.services.interfaces;

import kz.aitu.demo.models.Order;

import java.util.List;

public interface OrderServiceInterface {
    List<Order> getAll();
    Order getById(int id);
    Order create(Order order);
    List<Order> getByUserId(int user_id);

}
