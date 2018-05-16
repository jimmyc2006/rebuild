package shuwei.study.rebuild.c8.ReplaceTypeCodeWithSubclasses;
/**
 * @author shuwei
 * @version 创建时间：2017年12月28日 上午9:31:00
 * 类说明
 */
public class SalesMan extends Employee{
    int getType() {
        return Employee.SALESMAN;
    }
}
