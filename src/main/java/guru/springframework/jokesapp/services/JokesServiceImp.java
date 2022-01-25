package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImp implements JokesService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImp() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String GetRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
