package shuwei.study.rebuild.c8.ReplaceTypeCodeWithSubclasses;

/**
 * @author shuwei
 * @version 创建时间：2017年12月28日 上午8:59:37 Repacle Type Code with Subclasses 223
 */
public abstract class Employee {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new SalesMan();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    abstract int getType();
}
