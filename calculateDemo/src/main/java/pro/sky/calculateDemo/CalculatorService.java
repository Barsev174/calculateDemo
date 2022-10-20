package pro.sky.calculateDemo;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

    String answerHello();

    int plusNumbers(Integer a, Integer s);
    int minusNumbers(Integer a, Integer s);
    int multiplyNumbers(Integer a, Integer s);
    int divideNumbers(Integer a, Integer s);


}