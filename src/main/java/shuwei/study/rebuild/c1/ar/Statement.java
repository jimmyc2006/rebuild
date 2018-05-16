package shuwei.study.rebuild.c1.ar;
/**
 * @author shuwei
 * @version 创建时间：2017年12月27日 上午9:36:16
 * 类说明
 */
public abstract class Statement {
    
    public String value(Customer c) {
        String result = headerString(c);
        for(Rental r : c.getRentals()) {
            result += eachRentalString(r);
        }
        result += footerString(c);
        return result;
    }
    
    abstract String headerString(Customer c);
    abstract String eachRentalString(Rental r);
    abstract String footerString(Customer c);
}
