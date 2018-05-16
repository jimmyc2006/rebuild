package shuwei.study.rebuild.c7.moveMethod;
/**
 * @author shuwei
 * @version 创建时间：2017年12月20日 上午9:09:38
 * 类说明
 */
public class AccountType {
    public boolean isPremium() {
        return true;
    }
    
    double overdraftCharge(int daysOverdrawn) {
        if(isPremium()) {
            double result = 10;
            if(daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else {
            return daysOverdrawn * 1.75;
        }
    }
}
