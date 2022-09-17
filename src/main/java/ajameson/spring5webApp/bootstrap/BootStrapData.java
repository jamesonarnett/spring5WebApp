package ajameson.spring5webApp.bootstrap;

import ajameson.spring5webApp.domain.Author;
import ajameson.spring5webApp.domain.Book;
import ajameson.spring5webApp.domain.Publisher;
import ajameson.spring5webApp.repositories.AuthorRepository;
import ajameson.spring5webApp.repositories.BookRepository;
import ajameson.spring5webApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //add Publisher
        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St. Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        //add Book
        Author eric = new Author("JRR", "Tolkien");
        Book hobbit = new Book("The Hobbit", "123123");
        eric.getBooks().add(hobbit);
        hobbit.getAuthors().add(eric);

        hobbit.setPublisher(publisher);
        publisher.getBooks().add(hobbit);

        authorRepository.save(eric);
        bookRepository.save(hobbit);
        publisherRepository.save(publisher);

        //add Book2
        Author gm = new Author("George", "Martin");
        Book WoW = new Book("Winds of Winter", "0");
        gm.getBooks().add(WoW);
        WoW.getAuthors().add(gm);

        WoW.setPublisher(publisher);
        publisher.getBooks().add(WoW);

        authorRepository.save(gm);
        bookRepository.save(WoW);
        publisherRepository.save(publisher);

        //startUp
        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
        System.out.println("Publisher Book Count: " + publisher.getBooks().size());
    }
}
