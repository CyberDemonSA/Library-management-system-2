package kz.aitu.librarymanagementsystem.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int order_id;
    public int user_id;
    public int book_id;
    public String date_of_issue;
    public String due_date;
}