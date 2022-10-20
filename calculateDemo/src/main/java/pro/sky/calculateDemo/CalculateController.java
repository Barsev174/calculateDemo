package pro.sky.calculateDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculateDemo.exception.DivisionByZeroException;

@RestController
@RequestMapping("/calculator/")
public class CalculateController {
    private final CalculatorService calculateService;

    public CalculateController(CalculatorService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String answerHello() {
        return calculateService.answerHello();
    }

    @GetMapping(path = "/plus")
    public String plusNumbers(@RequestParam(value = "num1", required = false) Integer a,
                              @RequestParam(value = "num2", required = false) Integer s) {
        if (null == a || null == s) {
            return "<b>Параметр не может быть пустым</b>";
        } else {
            int plus = calculateService.plusNumbers(a, s);
            return a + " + " + s + " = " + plus;
        }
    }

    @GetMapping(path = "/minus")
    public String minusNumbers(@RequestParam(value = "num1", required = false) Integer a,
                                  @RequestParam(value = "num2", required = false) Integer s) {
        if (null == a || null == s) {
            return "<b>Параметр не может быть пустым</b>";
        } else {
            int minus = calculateService.minusNumbers(a, s);
            return a + " - " + s + " = " + minus;
        }
    }

    @GetMapping(path = "/multiply")
    public String multiplyNumbers(@RequestParam(value = "num1", required = false) Integer a,
                                  @RequestParam(value = "num2", required = false) Integer s) {
        if (null == a || null == s) {
            return "<b>Параметр не может быть пустым</b>";
        } else {
            int multiple = calculateService.multiplyNumbers(a, s);
            return a + " * " + s + " = " + multiple;
        }
    }

    @GetMapping(path = "/divide")
    public String divideNumbers(@RequestParam(value = "num1", required = false) int a,
                                @RequestParam(value = "num2", required = false) int s) {

            int divide = calculateService.divideNumbers(a, s);
            return a + " / " + s + " = " + divide;


    }
}