package whatever.java.user;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> user1 = new HashMap<String, String>();
        user1.put("id", "dohyeon123");
        user1.put("name", "dohyeon");
        user1.put("password", "abcd1234");
        user1.put("password2", "abcd1");


        System.out.println(user1.toString());

        // class명 변수명 = new 클래스명()
        User user2 = new User("dohyeon123", "dohyeon", "abcd1234");
        user2.userInfo();
    }
}
