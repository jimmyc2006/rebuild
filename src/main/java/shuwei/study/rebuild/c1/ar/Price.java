package shuwei.study.rebuild.c1.ar;
/**
 * @author shuwei
 * @version 创建时间：2017年12月17日 下午5:15:50
 * 类说明
 */
public abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
    
    public double getCharge(int daysRented) {
        double result = 1.5;
        if(daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}

class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
    
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
    
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2: 1;
    }
}

class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }
    
    public double getCharge(int daysRented) {
        double result = 2;
        if(daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}