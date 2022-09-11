package pro.sky.calculateDemo;

import org.springframework.stereotype.Service;


public class CalculateServiceImpl implements CalculatorService {
    @Override
    public String answerHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public int plusNumbers(Integer a, Integer s) {
        return a + s;
    }
    @Override
    public int minusNumbers(Integer a, Integer s) {
        return a - s;
    }
    @Override
    public int multiplyNumbers(Integer a, Integer s) {
        return a * s;
    }
    @Override
    public double divideNumbers(Double a, Double s) {
        return a / s;
    }

}