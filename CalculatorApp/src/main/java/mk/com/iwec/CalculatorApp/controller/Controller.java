package mk.com.iwec.CalculatorApp.controller;
import org.springframework.web.bind.annotation.RequestParam;

public interface Controller {
	public Double addition(@RequestParam(name = "first") Double first, @RequestParam(name = "second") Double second);

	public Double substraction(@RequestParam(name = "first") Double first,
			@RequestParam(name = "second") Double second);

	public Double multiplicitaion(@RequestParam(name = "first") Double first,
			@RequestParam(name = "second") Double second);

	public Double division(@RequestParam(name = "first") Double first, @RequestParam(name = "second") Double second);

}
