package shuwei.study.rebuild.c8.ReplaceTypeCodeWithSubclasses;
/**
 * @author shuwei
 * @version 创建时间：2017年12月28日 上午9:04:39
 * 类说明
 */
public class Engineer extends Employee{
    
    int getType() {
        return Employee.ENGINEER;
    }
}
