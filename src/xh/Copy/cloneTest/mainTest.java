package Copy.cloneTest;

/**
 * Created by Xiao Hong on 2020-06-10
 */
public class mainTest {
    
    
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("123", 1);
        User user2 = (User) user.clone();
        user2.setName("1231");
        System.out.println(user == user2);
        System.out.println(user.getName());
        System.out.println(user2.getName());
    }
    
}
