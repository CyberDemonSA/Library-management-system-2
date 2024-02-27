package kz.aitu.milestone2.services.interfaces;

import kz.aitu.milestone2.models.Order;
import kz.aitu.milestone2.models.User;

import java.util.List;

public interface OrderServiceInterface{
    List<Order> getAllOrders();
    User getByIdOrder(int Id);
    User create (Order order);
    List<User> getByDueDate(String due_date);
}
