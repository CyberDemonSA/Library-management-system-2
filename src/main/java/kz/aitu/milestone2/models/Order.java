package kz.aitu.milestone2.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int id;
    public int users_id;
    public int book_id;
    public String date_of_issue;
    public String due_date;

}
