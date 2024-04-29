import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {

        BookR book1 = new BookR("Test-Title", "Test-Author", "Test-ISBN", "Test-Publisher", "Test-Cover");
        BookR book2 = new BookR("Test-Title", "Test-Author", "Test-ISBN", "Test-Publisher", "Test-Cover");

        System.out.println(book1);
        System.out.println(book1.isbn());
        System.out.println(book1.author());

        System.out.println(book1.equals(book2));

       BookR book3 = new BookR(book1.title(), book1.author(), "123", book1.publisher(), book1.cover());

        System.out.println(book3);


        System.out.println("-----------------------------------");


        double d1 = 0.1;
        double d2 = 0.2;

        System.out.println(d1 + d2);


        BigDecimal big1 = new BigDecimal("0.1");
        BigDecimal big2 = new BigDecimal("0.2");

        System.out.println(big1.add(big2));

        System.out.println(big1.multiply(big2));

        System.out.println(big1.multiply(big2)
                .setScale(1, RoundingMode.HALF_UP));

        BigDecimal d = new BigDecimal("000.000030000");

        System.out.println(d);
    }
}
