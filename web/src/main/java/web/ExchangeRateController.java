package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import currency.CurrencyService;
import management.ExchangeRateRepository;
import model.ExchangeConservation;
import model.ExchangeRate;

@Controller
public class ExchangeRateController {

	@Autowired
	CurrencyService exchangeService;
	
    @GetMapping("/getExchangeRate")
    @ResponseBody
    public ExchangeRate getExchangeRate(@RequestParam(name="from", required=true) String from,
    		@RequestParam(name="to", required=true) String to) {
        return exchangeService.getExchangeRate(from, to);
    }
    
    @GetMapping("/getExchange")
    @ResponseBody
    public ExchangeConservation getExchange(@RequestParam(name="from", required=true) String from,
    		@RequestParam(name="to", required=true) String to,
    		@RequestParam(name="amount", defaultValue="100") Double amount) {
        return exchangeService.getExchange(from, to, amount);
    }
    
    

}
