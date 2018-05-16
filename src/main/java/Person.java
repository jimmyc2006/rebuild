
public class Person {
    public static final int GENDER_MALE = 1;
    public static final int GENDER_FEMALE = 2;
    
    private int id;
    // 1男 2女
    private int gender;
    private String name;
    private int age;
    private String cityName;
    
    public Person(int id, int gender, String name, int age, String cityName) {
        super();
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.cityName = cityName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    @Override
    public String toString() {
        return "Person [id=" + id + ", gender=" + gender + ", name=" + name + ", age=" + age + ", cityName=" + cityName
                + "]";
    }
}
