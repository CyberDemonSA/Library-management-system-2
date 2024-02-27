package kz.aitu.milestone2.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class User {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
        private int id;
    private String name;
    private String surname;
    private String password;
    private String gender;
    private int age;

}

