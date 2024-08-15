package whatever.java.user;

/*
* 1. User 라는 클래스가 있고, 이 클래스는 id, password라는 변수를 가지고 있다.
* Main 에서 User 클래스를 불러오기 위해서는 id, password 값이 필요하다.
* User 객체를 이용해서 2개의 서로 다른 인스턴스를 만들어라.
* 
* 2. User 클래스 내에 id, password를 출력하는 메서드를 생성하고, Main에서
* 이를 통해서 각 인스턴스의 id, password를 불러와라
*
* 3. Circle 클래스는 반지름 r, 넓이 a, 둘레 s 라는 변수를 갖고 있다.
* 이 클래스를 통해서 인스턴스를 생성할 때는 반지름 값이 필요하다.
* 서로 다른 반지름 값을 가지는 인스턴스를 2개 만들고, 각각의 넓이와 둘레를 출력해라.
*
* 4. Square 클래스는 변의 길이 d, 넓이 a, 둘레 s 라는 변수를 갖고 있다.
* 이 클래스를 통해서 인스턴스를 생성할 때는 변의 길이가 필요하다.
* 서로 다른 변의 길이 가지는 인스턴스를 2개 만들고, 각각의 넓이와 둘레를 출력해라.
*
* 5. d 값을 수정할 수 있는 setD() 라는 메서드를 만들고, a2의 d를 수정한 다음
* a2의 넓이와 둘레를 출력해라.
* */

public class User {
    private String id;
    private String password;
    private String name;

    public User (String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public void userInfo() {
        System.out.printf("""
                id: %s
                name: %s
                password: %s
                """, id, name, password);
    }
}
