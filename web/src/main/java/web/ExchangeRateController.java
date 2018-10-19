package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import management.ExchangeRateRepository;
import model.ExchangeRate;

@Controller
public class ExchangeRateController {

	@Autowired
	ExchangeRateRepository exchangeRepository;
	
    @GetMapping("/getExchangeRate")
    @ResponseBody
    public ExchangeRate greeting(@RequestParam(name="from", required=true) String from,
    		@RequestParam(name="to", required=true) String to) {
       System.out.print(exchangeRepository.findByFromAndTo(from,to));
        return exchangeRepository.findByFromAndTo(from,to);
    }

}
