package mk.com.iwec.CalculatorApp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

	@Override
	public Double addition(Double a, Double b) {
		return a + b;
	}

	@Override
	public Double substraction(Double a, Double b) {
		return a - b;
	}

	@Override
	public Double multiplication(Double a, Double b) {
		return a * b;
	}

	@Override
	public Double division(Double a, Double b) {
		if (a == 0)
			return 0.0;
		else if (b == 0)
			return null;
		else
			return a / b;
	}

}
