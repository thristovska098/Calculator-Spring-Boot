package mk.com.iwec.CalculatorApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import mk.com.iwec.CalculatorApp.service.*;

@RestController
@RequestMapping("/api")
public class CalculatorController implements Controller {
	@Autowired
	CalculateServiceImpl service;

	@GetMapping("/addition")
	public Double addition(@RequestParam(name = "first") Double first, @RequestParam(name = "second") Double second) {
		return service.addition(first, second);
	}

	@GetMapping("/substraction")
	public Double substraction(@RequestParam(name = "first") Double first,
			@RequestParam(name = "second") Double second) {
		return service.substraction(first, second);
	}

	@GetMapping("/multiplication")
	public Double multiplicitaion(@RequestParam(name = "first") Double first,
			@RequestParam(name = "second") Double second) {
		return service.multiplication(first, second);
	}

	@GetMapping("/division")
	public Double division(@RequestParam(name = "first") Double first, @RequestParam(name = "second") Double second) {
		return service.division(first, second);
	}

}
