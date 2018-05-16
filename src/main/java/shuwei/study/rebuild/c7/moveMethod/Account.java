package shuwei.study.rebuild.c7.moveMethod;
/**
 * @author shuwei
 * @version 创建时间：2017年12月20日 上午9:08:46
 * 类说明
 */
public class Account {
    private AccountType type;
    private int daysOverdrawn;
    
    double bankCharge() {
        double result = 4.5;
        if(daysOverdrawn > 0) {
            result += this.type.overdraftCharge(this.daysOverdrawn);
        }
        return result;
    }
}