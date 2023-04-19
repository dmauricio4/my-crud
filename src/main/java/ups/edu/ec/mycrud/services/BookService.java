package ups.edu.ec.mycrud.services;

import ups.edu.ec.mycrud.model.Book;
import org.springframework.stereotype.Service;
import ups.edu.ec.mycrud.repositories.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {

        return repository.getAllBooks();
    }

    public long createBook(Book newBook) {
        return repository.createBook(newBook);
    }
}
