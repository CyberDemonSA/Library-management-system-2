package kz.aitu.milestone2.repositories;

import kz.aitu.milestone2.models.Order;
import kz.aitu.milestone2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepositoryInterface extends JpaRepository<Order, Integer> {
    List<Order> findByUser(User user);
}
