package tddClass;

public class Order {
    public int calculatePriceFor(int orderQuantity) {
        int unitPrice = 0;

        if (orderQuantity >= 1 && orderQuantity <= 4) {
            unitPrice = 1500;
        }
        if (orderQuantity > 4 && orderQuantity < 10) {
            unitPrice = 1400;
        }

        if (orderQuantity > 9 && orderQuantity < 30) {
            unitPrice = 1200;
        }

        if (orderQuantity > 29 && orderQuantity < 50) {
            unitPrice = 1100;
        }

        if (orderQuantity > 50 && orderQuantity < 100) {
            unitPrice = 1000;
        }

        if (orderQuantity > 100 && orderQuantity < 200) {
            unitPrice = 900;
        }

        if (orderQuantity >= 200) {
            unitPrice = 800;
        }

        return unitPrice * orderQuantity;
    }
}
