import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
        //test case
    void canAddTwoNumbers() {
        //given
        double num1 = 20d;
        double num2 = 30d;
        String expected = "50.00";
        //when
        Calculator calculator = new Calculator();
        String result = calculator.add(num1, num2);
        //then
        assertEquals(expected, result);
    }

    @Test
//test case
    void canAddTwoNumbersWithDecimalPoint() {
        double num1 = 23.50;
        double num2 = 2.70;
        String expected = "26.20";
        Calculator calculator = new Calculator();
        String result = calculator.add(num1, num2);
        assertEquals(expected, result);
    }

    @Test
    void CanSubtractTwoNumbers(){
        double num1 = 20;
        double num2 = 10;
        String expected = "10.00";
        Calculator calculator = new Calculator();
        String result = calculator.subtract(num1, num2);
        assertEquals(expected, result);
    }


    @Test
    void CanSubtractTwoNumbersWithNegativeResult(){
        double num1 = 5;
        double num2 = 10;
        String expected = "-5.00";

        Calculator calculator = new Calculator();
        String result = calculator.subtract(num1, num2);

        assertEquals(expected, result);
    }

    @Test
    void CanSubtractTwoNumbersWithDecimalPoints(){
        double num1 = 20;
        double num2 = 4.50;
        String expected = "15.50";

        Calculator calculator = new Calculator();
        String result = calculator.subtract(num1, num2);

        assertEquals(expected, result);
    }

    @Test
    void CanMultiplyTwoNumbers(){
        double num1 = 20;
        double num2 = 5;
        String expected = "100.00";
        Calculator calculator = new Calculator();
        String result = calculator.multiply(num1, num2);
        assertEquals(expected, result);
    }

    @Test
    void CanMultiplyTwoNumbersWithDecimalPoints(){
        double num1 = 20;
        double num2 = 4.50;
        String expected = "90.00";
        Calculator calculator = new Calculator();
        String result = calculator.multiply(num1, num2);
        assertEquals(expected, result);
    }

    @Test
    void canDivideTwoNumbers() {
        double num1 = 20d;
        double num2 = 10d;
        String expected = "2.00";
        //when
        Calculator calculator = new Calculator();
        String result = calculator.divide(num1, num2);
        //then
        assertEquals(expected, result);
    }
    @Test
    void canDivideTwoNumbersWithDecimalPoints() {
        double num1 = 20.5d;
        double num2 = 10.2d;
        String expected = "2.01";
        //when
        Calculator calculator = new Calculator();
        String result = calculator.divide(num1, num2);
        //then
        assertEquals(expected, result);
    }
}
