package pro.sky.calculateDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {
    private final CalculatorService calculateService;

    public CalculateController(CalculatorService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(path = "/calculator")
    public String answerHello() {
        return calculateService.answerHello();
    }

    @GetMapping(path = "/calculator/plus")
    public String addUpNumbers(@RequestParam(value = "num1", required = false)  Integer a,
                               @RequestParam(value = "num2", required = false)  Integer s) {
        if(null == a|| null == s) {
            return  "<b>Параметр не может быть пустым</b>";
        } else {
            return calculateService.addUpNumbers(a, s);
        }
    }

    @GetMapping(path = "/calculator/minus")
    public String subtractNumbers(@RequestParam(value = "num1", required = false)  Integer a,
                                  @RequestParam(value = "num2", required = false)  Integer s) {
        if(null == a|| null == s) {
            return  "<b>Параметр не может быть пустым</b>";
        } else {
            return calculateService.minusNumbers(a, s);
        }
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyNumbers(@RequestParam(value = "num1", required = false)  Integer a,
                                  @RequestParam(value = "num2", required = false)  Integer s) {
        if(null == a|| null == s) {
            return  "<b>Параметр не может быть пустым</b>";
        } else {
            return calculateService.multiplyNumbers(a, s);
        }
    }

    @GetMapping(path = "/calculator/divide")
    public String divideNumbers(@RequestParam(value = "num1", required = false)  Double a,
                                @RequestParam(value = "num2", required = false)  Double s) {
        if(null == a|| null == s) {
            return  "<b>Параметр не может быть пустым</b>";
        } else {
            return calculateService.divideNumbers(a, s);
        }
    }
}