package shuwei.study.rebuild.c1.ar;
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
    private Price price;
    
    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPrice(int priceCode) {
        switch(priceCode) {
            case REGULAR :
                this.price = new RegularPrice();
                break;
            case CHILDRENS:
                this.price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                this.price = new NewReleasePrice();
                break;
            default :
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return title;
    }
    
    public double getCharge(int daysRented) {
        return this.price.getCharge(daysRented);
    }
    
    public int getFrequentRenterPoints(int daysRented) {
        return this.price.getFrequentRenterPoints(daysRented);
    }
}
