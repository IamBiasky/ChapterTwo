package tddClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach                         //Use of the function @BeforeEach
    void startAllTestsWith(){
        calculator = new Calculator();  //initializing the new Calculator object
    }

    @Test
    void addTwoNumbersTest(){
        //given
        Calculator calculator = new Calculator();

        //when
        int sum = calculator.add(3,2);

        //assert
        assertEquals(5,sum);
        assertEquals(7, calculator.add(5,2));
        assertEquals(12, calculator.add(6,6));
        assertTrue(sum==5);
    }

    @Test
    @DisplayName("Testing for multiplication")
    void twoNumbersCanBeMultipliedTest(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    @DisplayName("Testing for Division")
    void divideTwoNumbers(){

        Calculator calculator = new Calculator();

        assertEquals(2, calculator.divide(6,3));
    }

    @Test
    @DisplayName("Testing for float return")
    void divideTwoNumbersToYieldFloatTest(){

        Calculator calculator = new Calculator();

        assertEquals(2.5, calculator.divide(5,2));
    }

    @Test
    @DisplayName("Division by Zero returns zero")
    void divisionbyZeroTest(){

        Calculator calculator = new Calculator();

        assertEquals(0, calculator.divide(5,0));
    }

    @Test
    void difference_canBeCalculated(){
        assertEquals(5,calculator.subtract(10,5));
    }

    @Test
    void difference_willProduceAbsoluteResult(){
        assertEquals(5, calculator.subtract(5,10));
    }


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}