package shuwei.study.rebuild.c6.rmwmo.old;
/**
 * @author shuwei
 * @version 创建时间：2017年12月26日 上午9:13:14
 * 类说明
 */
public class Gamma {
    private final Account account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;
    
    Gamma(Account source, int inputValArg, int quantityArg, int yearToDateArg) {
        account = source;
        inputVal = inputValArg;
        quantity = quantityArg;
        yearToDate = yearToDateArg;
    }
    
    int compute() {
        importantValue1 = (inputVal * quantity) + account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;
        if((yearToDate - importantValue1) > 100) {
            importantValue2 -= 20;
        }
        importantValue3 = importantValue2 * 7;
        return importantValue3 - 2 * importantValue1;
    }
}
