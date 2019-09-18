package repository;

import domain.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository <Joke, String> {
}
