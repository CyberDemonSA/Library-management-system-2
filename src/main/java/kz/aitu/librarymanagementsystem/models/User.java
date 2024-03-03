package kz.aitu.librarymanagementsystem.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users_clients")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String name;
    private String surname;
    private String male;
    private int age;
    private boolean student;
}