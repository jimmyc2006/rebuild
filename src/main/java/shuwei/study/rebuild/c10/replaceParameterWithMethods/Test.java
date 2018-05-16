package shuwei.study.rebuild.c10.replaceParameterWithMethods;

/**
 * @author shuwei
 * @version 创建时间：2017年12月21日 上午9:01:11 p292，如果函数可以通过其他途径获取参数值，那么它就不应该通过参数取得该值。
 *          过长的参数列会增加程序阅读者的理解难度，因此我们应该尽可能缩短参数列的长度
 */
public class Test {
    private int quantity = 1;
    private int itemPrice = 10;
    
    public double getPrice() {
        int basePrice = quantity * itemPrice;
        int discountLevel;
        if(quantity > 100) {
            discountLevel = 2;
        } else {
            discountLevel = 1;
        }
        double finalPrice = discountedPrice(basePrice, discountLevel);
        return finalPrice;
    }
    
    private double discountedPrice(int basePrice, int discountLevel) {
        if(discountLevel == 2) {
            return basePrice * 0.1;
        } else {
            return basePrice * 0.05;
        }
    }
}
