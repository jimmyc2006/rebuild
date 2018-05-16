package shuwei.study.rebuild.c6.rmwmo.old;
/**
 * @author shuwei
 * @version 创建时间：2017年12月26日 上午9:07:36
 * Replace Method with Method Object
 */
public class Account {
    int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }
    
    int delta() {
        return 0;
    }
}
