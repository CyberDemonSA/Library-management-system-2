package kz.aitu.librarymanagementsystem.controllers;

import java.util.List;

import kz.aitu.librarymanagementsystem.models.Book;
import kz.aitu.librarymanagementsystem.services.interfaces.BookServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookServiceInterface service;

    public BookController(BookServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Book> getAll(){
        return service.getAll();
    }

    @GetMapping("/{book_id}")
    public ResponseEntity<Book> getById(@PathVariable("book_id") int id){
        Book book = service.getById(id);
        if(book == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); //404

        return new ResponseEntity<>(book, HttpStatus.OK); //200
    }

    @PostMapping("/")
    public ResponseEntity<Book> create(@RequestBody Book book){
        Book createdBook = service.create(book);
        if(createdBook == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdBook, HttpStatus.CREATED); //201
    }

    @GetMapping("/{title}")
    public List<Book> getAllByTitle(@PathVariable("title") String title){
        return service.getByTitle(title);
    }

}