package kz.aitu.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orders_of_books")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public int user_id;
    public int book_id;
    public String date_of_issue;
    public String due_date;
}