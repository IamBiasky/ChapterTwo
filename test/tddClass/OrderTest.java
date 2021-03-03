package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;
    @BeforeEach
    void StartAllTestWith(){
        order = new Order();
    }

    @Test
    void purchaseOneUnitOfOrderTest(){

        assertEquals(1500, order.calculatePriceFor(1));

    }

    @Test
    void purchaseFourUnitOfOrderTest(){
        assertEquals(1500*4, order.calculatePriceFor(4));
    }

    @Test
    void purchaseFiveUnitOfOrderTest(){
        assertEquals(1400*5, order.calculatePriceFor(5));
    }

    @Test
    void purchaseTenToTwentyThreeUnitOfOrderTest() {
        assertEquals(1200 * 10, order.calculatePriceFor(10));
        assertEquals(1200 * 29, order.calculatePriceFor(29));
        assertEquals(1200 * 23, order.calculatePriceFor(23));
    }

    @Test
    void purchaseThirtyToFortyNineUnitOfOrderTest() {
        assertEquals(1100 * 30, order.calculatePriceFor(30));
        assertEquals(1100 * 37, order.calculatePriceFor(37));
        assertEquals(1100 * 49, order.calculatePriceFor(49));

    }

}