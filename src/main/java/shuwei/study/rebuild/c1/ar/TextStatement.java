package shuwei.study.rebuild.c1.ar;

/**
 * @author shuwei
 * @version 创建时间：2017年12月27日 上午9:36:29 类说明
 */
public class TextStatement extends Statement {

    String headerString(Customer c) {
        return "Rental Record for " + c.getName() + "\n";
    }

    String eachRentalString(Rental r) {
        return "\t" + r.getMovie().getTitle() + "\t" + String.valueOf(r.getCharge()) + "\n";
    }

    String footerString(Customer c) {
        return "Amount owed is " + String.valueOf(c.getTotalCharge()) + "\n" + "You earned "
                + String.valueOf(c.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}
