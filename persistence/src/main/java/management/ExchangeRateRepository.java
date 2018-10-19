package management;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.ExchangeRate;

@Repository
public interface ExchangeRateRepository  extends CrudRepository<ExchangeRate, Long>{
	public ExchangeRate findByFromAndTo(String from, String to);

}
