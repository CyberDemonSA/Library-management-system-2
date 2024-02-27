package kz.aitu.demo.repositories;

import kz.aitu.demo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepositoryInterface extends JpaRepository<Order, Integer> {
    List<Order> getByUserId(int user_id);
}