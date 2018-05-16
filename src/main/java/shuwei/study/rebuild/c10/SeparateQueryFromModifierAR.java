package shuwei.study.rebuild.c10;
/**
 * @author shuwei
 * @version 创建时间：2017年12月19日 下午4:52:08
 * 类说明
 */
public class SeparateQueryFromModifierAR {
    
    void checkSecurity(String[] people) {
        sendAlert(people);
        String found = foundPerson(people);
        someLaterCode(found);
    }
    
    void sendAlert(String[] people) {
        if(!foundPerson(people).equals("")) {
            sendAlert();
        }
    }
    
    String foundPerson(String[] people) {
        for(int i = 0; i < people.length; i++) {
            if(people[i].equals("Don") || people[i].equals("John")) {
                return people[i];
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
