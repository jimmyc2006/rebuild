package shuwei.study.rebuild.c1;
/**
 * @author shuwei
 * @version 创建时间：2017年12月17日 上午11:23:36
 * 类说明
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private String title;
    private int priceCode;
    
    public Movie(String title, int priceCode) {
        super();
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }
}
