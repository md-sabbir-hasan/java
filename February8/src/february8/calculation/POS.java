package february8.calculation;

public class POS {

    public double getFinalPrice(double unitPrice, double qantity) {
        double grossPrice = unitPrice * qantity;
        double actualPrice = 0;
        if (grossPrice >= 100) {
            actualPrice = grossPrice - (grossPrice * 0.05);
        } else if (grossPrice >= 500) {
            actualPrice = grossPrice - (grossPrice * 0.1);
        } else if (grossPrice >= 1000) {
            actualPrice = grossPrice - (grossPrice * 0.15);
        } else if (grossPrice >= 5000) {
            actualPrice = grossPrice - (grossPrice * 0.2);
        } else {
            actualPrice = grossPrice;
        }

        return actualPrice;

    }
}
