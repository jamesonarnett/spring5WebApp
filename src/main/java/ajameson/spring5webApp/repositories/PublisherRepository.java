package ajameson.spring5webApp.repositories;

import ajameson.spring5webApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
