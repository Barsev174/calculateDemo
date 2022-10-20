package pro.sky.calculateDemo;


import pro.sky.calculateDemo.exception.DivisionByZeroException;

public class CalculatorServiceImpl implements CalculatorService {
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
    public int divideNumbers(Integer a, Integer s) {
        if (s == 0) {
            throw new DivisionByZeroException();
        }
        return a / s;
    }

}