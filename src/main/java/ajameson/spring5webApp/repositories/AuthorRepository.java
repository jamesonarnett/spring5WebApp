package ajameson.spring5webApp.repositories;

import ajameson.spring5webApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
