import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    public static double roundToNearestHundredth(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
    public static BigDecimal reverseSignAndRound(BigDecimal number) {
        return number.negate().setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal num3 = new BigDecimal("-45.67");

        System.out.println("Round to nearest hundredth: " + roundToNearestHundredth(num1));
        System.out.println("Reverse sign and round (1.2345): " + reverseSignAndRound(num2));
        System.out.println("Reverse sign and round (-45.67): " + reverseSignAndRound(num3));
    }
}
