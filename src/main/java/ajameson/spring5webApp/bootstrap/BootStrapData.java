package ajameson.spring5webApp.bootstrap;

import ajameson.spring5webApp.domain.Author;
import ajameson.spring5webApp.domain.Book;
import ajameson.spring5webApp.repositories.AuthorRepository;
import ajameson.spring5webApp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //add Book
        Author eric = new Author("JRR", "Tolkien");
        Book hobbit = new Book("The Hobbit", "123123");
        eric.getBooks().add(hobbit);
        hobbit.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(hobbit);

        //add Book2
        Author gm = new Author("George", "Martin");
        Book WoW = new Book("Winds of Winter", "0");
        gm.getBooks().add(WoW);
        WoW.getAuthors().add(gm);

        authorRepository.save(gm);
        bookRepository.save(WoW);

        //startUp
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
