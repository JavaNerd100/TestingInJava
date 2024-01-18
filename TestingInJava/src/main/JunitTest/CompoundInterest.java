package JunitTest;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class CompoundInterest {

    public String compoundIntrestCalculator(String deposit, int time, String annualInterest, int i) {
        BigDecimal a = new BigDecimal(annualInterest).divide(new BigDecimal(i));
        BigDecimal b = a.add(new BigDecimal(1));
        BigDecimal c = b.pow(i * time);
        BigDecimal d = c.multiply(new BigDecimal(deposit));
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(d);
    }
}
