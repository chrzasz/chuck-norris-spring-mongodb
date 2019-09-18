package domain;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "jokes")
@Data
public class Joke {

    @Id
    private ObjectId _id;
    private String jokeId;
    private String jokeValue;
    private List<Joke> jokes;

}
