package shuwei.study.rebuild.c10;
/**
 * @author shuwei
 * @version 创建时间：2017年12月19日 下午4:52:08
 * 类说明
 */
public class SeparateQueryFromModifier {
    
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }
    
    String foundMiscreant(String[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if(people[i].equals("John")) {
                sendAlert();
                return "John";
            }
        }
        return "";
    }
    
    void sendAlert() {
        System.out.println("sendAlert()");
    }
    void someLaterCode(String name) {
        System.out.println("someLaterCode:" + name);
    }
}
