package shuwei.study.rebuild.c7.extractClass;
/**
 * @author shuwei
 * @version 创建时间：2017年12月19日 上午11:15:12
 * 类说明
 */
public class Person {
    private String name;
    
    private TelephoneNumber officeTelephone = new TelephoneNumber();
    
    public String getTelephoneNumber() {
        return this.officeTelephone.getTelephoneNumber();
    }
    
    public String getName() {
        return name;
    }

    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }
}