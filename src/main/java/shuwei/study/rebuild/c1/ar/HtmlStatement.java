package shuwei.study.rebuild.c1.ar;
/**
 * @author shuwei
 * @version 创建时间：2017年12月27日 上午9:36:51
 * 类说明
 */
public class HtmlStatement extends Statement {
    
    String headerString(Customer c) {
        return "<H1>Rentals for <EM>" + c.getName() + "</EM></H1><P>\n";
    }
    
    String eachRentalString(Rental r) {
        return r.getMovie().getTitle() + ": " + String.valueOf(r.getCharge()) + "<BR>\n";
    }

    String footerString(Customer c) {
        return "<P>You owe <EM>" + String.valueOf(c.getTotalCharge()) + "</EM> frequent renter points<P>";
    }
}
