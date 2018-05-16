package shuwei.study.rebuild.c1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuwei
 * @version 创建时间：2017年12月17日 上午11:27:09 
 * 第一步,把长长的函数切开，并把较小块的代码移至更合适的类 
 *  <1> 找出代码的逻辑泥团并运用extract method 110，switch语句 
 *      (1) 在这段代码里找出函数内的局部变量和参数-任何不会被修改的变量都可以被当成参数传入新的函数,如果只有一个变量修改，
 * 就把它当成返回值
 *      (2) 绝大多数，函数应该放在它所使用的数据的所属的对象内
 *      
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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + this.getName() + "\n";
        for (Rental r : rentals) {
            double thisAmount = 0;
            switch (r.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (r.getDaysRented() > 2) {
                        thisAmount += (r.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += r.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (r.getDaysRented() > 3) {
                        thisAmount += (r.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((r.getMovie().getPriceCode() == Movie.NEW_RELEASE) && r.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            // show figures for this rental
            result += "\t" + r.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
