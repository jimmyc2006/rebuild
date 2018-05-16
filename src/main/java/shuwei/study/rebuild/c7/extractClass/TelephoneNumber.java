package shuwei.study.rebuild.c7.extractClass;
/**
 * @author shuwei
 * @version 创建时间：2017年12月19日 上午11:17:58
 * 类说明
 */
public class TelephoneNumber {
    private String areaCode;
    private String number;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTelephoneNumber() {
        return "(" + this.areaCode + ") " + this.number;
    }
}
