package currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import management.ExchangeRateRepository;
import model.ExchangeConservation;
import model.ExchangeRate;

@Service
public class CurrencyService {
	
	
	@Autowired
	ExchangeRateRepository exchangeRepository;
	
	public ExchangeRate getExchangeRate(String from, String to) {
		 return exchangeRepository.findByFromAndTo(from,to);
		
	}
	
	public ExchangeConservation getExchange(String from, String to, Double amount) {
		ExchangeConservation conservation = new ExchangeConservation(getExchangeRate(from, to));
		conservation.setFromAmount(amount);
		conservation.setToAmount(amount* conservation.getExchangeRateDetails().getRate());
		return conservation;
	}

}
