package shuwei.study.rebuild.c1;
/**
 * @author shuwei
 * @version 创建时间：2017年12月17日 上午11:25:28
 * 类说明
 */
public class Rental {
    private Movie movie;
    private int daysRented;
    
    public Rental(Movie movie, int daysRented) {
        super();
        this.movie = movie;
        this.daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    
    public Movie getMovie() {
        return movie;
    }
}
