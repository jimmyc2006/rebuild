package shuwei.study.akka.homework;

import java.util.List;

public class Fitness {
    public static double fitness(List<Double> x) {
        double sum = 0;
        for (int i = 1; i < x.size(); i++) {
            // 获取对于年投资的收益
            sum += Math.sqrt(x.get(i));
        }
        return sum;
    }
}
