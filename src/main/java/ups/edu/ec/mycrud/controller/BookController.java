package ups.edu.ec.mycrud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ups.edu.ec.mycrud.model.Book;
import ups.edu.ec.mycrud.services.BookService;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {

        this.bookService = bookService;
    }

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }


    @PostMapping("/book")
    public long createBook(@RequestBody Book newBook) {
        return bookService.createBook(newBook);
    }

}
