package kz.aitu.librarymanagementsystem.repositories;

import kz.aitu.librarymanagementsystem.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepositoryInterface extends JpaRepository<Order, Integer>  {

}