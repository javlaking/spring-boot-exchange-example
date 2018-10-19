package model;

public class ExchangeConservation {
	
	private ExchangeRate exchangeRateDetails;
	
	private Double fromAmount;
	
	private Double toAmount;

	public ExchangeRate getExchangeRateDetails() {
		return exchangeRateDetails;
	}

	public void setExchangeRateDetails(ExchangeRate exchangeRateDetails) {
		this.exchangeRateDetails = exchangeRateDetails;
	}

	public Double getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(Double fromAmount) {
		this.fromAmount = fromAmount;
	}

	public Double getToAmount() {
		return toAmount;
	}

	public void setToAmount(Double toAmount) {
		this.toAmount = toAmount;
	}
	
	public ExchangeConservation(ExchangeRate exchangeRateDetails) {
		this.exchangeRateDetails = exchangeRateDetails;
	}

	
	

}
