package shuwei.study.rebuild.c8.ReplaceTypeCodeWithSubclasses;
/**
 * @author shuwei
 * @version 创建时间：2017年12月28日 上午9:32:28
 * 类说明
 */
public class Manager extends Employee {

    @Override
    int getType() {
        return Employee.MANAGER;
    }

}
