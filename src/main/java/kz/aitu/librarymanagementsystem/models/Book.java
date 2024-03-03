package kz.aitu.librarymanagementsystem.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int book_id;
    public String title;
    public String author;
    public String genre;
    public String type_of_book;
//    public String language;
    public int age_limit;
    public String additional_book_info;
}