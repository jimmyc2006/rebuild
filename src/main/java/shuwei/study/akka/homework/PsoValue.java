package shuwei.study.akka.homework;

import java.util.Collections;
import java.util.List;

public final class PsoValue {
    // 该方案的收益
    final double value;
    // 该方案每年投资的钱
    final List<Double> x;

    public PsoValue(double v, List<Double> x2) {
        this.value = v;
        this.x = Collections.unmodifiableList(x2);
    }

    public double getValue() {
        return value;
    }

    public List<Double> getX() {
        return x;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("value: ").append("-->").append(x.toString());
        return sb.toString();
    }
}
