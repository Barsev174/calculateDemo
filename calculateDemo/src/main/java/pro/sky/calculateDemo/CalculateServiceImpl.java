package pro.sky.calculateDemo;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculatorService {

    public String answerHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String addUpNumbers(int a, int s) {
        int sum = a + s;
        return a + " + " + s + " = " + sum;
    }

    public String minusNumbers(int a, int s) {
        int sum = a - s;
        return a + " - " + s + " = " + sum;
    }

    public String multiplyNumbers(int a, int s) {
        int sum = a * s;
        return a + " * " + s + " = " + sum;
    }

    public String divideNumbers(Double a, Double s) {
        if (s != 0) {
            Double sum = a / s;
            return a + " / " + s + " = " + sum;
        } else {
            return "<b>Делить на ноль нельзя</b>";
        }
    }
}