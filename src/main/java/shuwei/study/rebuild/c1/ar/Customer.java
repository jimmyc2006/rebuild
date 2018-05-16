package shuwei.study.rebuild.c1.ar;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuwei
 * @version 创建时间：2017年12月17日 上午11:27:09
 * 类说明
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();
    
    public Customer(String name) {
        super();
        this.name = name;
    }
    
    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String getName() {
        return name;
    }
    
    public String statement() {
        return new TextStatement().value(this);
    }
    
    public String htmlStatement() {
       return new HtmlStatement().value(this);
    }

    public List<Rental> getRentals() {
        return rentals;
    }
    
    public double getTotalCharge() {
        return this.rentals.stream().mapToDouble(Rental::getCharge).sum();
    }
    
    public int getTotalFrequentRenterPoints() {
        return this.rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
    }
}
