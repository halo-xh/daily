package Copy.cloneTest;

/**
 * Created by Xiao Hong on 2020-06-10
 */
public class User implements Cloneable{
    
    private String name;
    
    private Integer age;
    
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    @Override
    protected Object clone() {
        User u = null;
        try {
            u = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return u;
    }
}
