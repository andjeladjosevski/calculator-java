import java.util.List;
import java.util.ArrayList;

public class TestCalculator {
    public static void main(String[] args) {
        testcalculate();
    }

    public static void testcalculate() {
        String expression = "2*3";
        String expectedResult = "6.0";
        Calculator actualResult = new Calculator();

        Calculator.Run(expression);
        String textResult = Float.toString(actualResult.finalResult);

        if (expectedresult.equals(textResult)) {
            System.out.println ("Test passed");
        
        } else {
            System.out.println ("Test failed.");
        }
    }
}
