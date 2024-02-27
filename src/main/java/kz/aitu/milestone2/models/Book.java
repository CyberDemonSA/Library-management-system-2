package kz.aitu.milestone2.models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int id;
    public String title;
    public String author;
    public String genre;
    public String type_of_book;
    public String language;
    public int age_limit;
    public String additional_info;

}
