package spring.chuck.noris.app.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokeImpl implements ChuckNorrisJoke {

	
	private final ChuckNorrisQuotes chuckQuotes;
	
	public  ChuckNorrisJokeImpl() {
		chuckQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJokes() {
		return chuckQuotes.getRandomQuote();
	}
	
	
}
