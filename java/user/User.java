package whatever.java.user;

/*
* 1. User ��� Ŭ������ �ְ�, �� Ŭ������ id, password��� ������ ������ �ִ�.
* Main ���� User Ŭ������ �ҷ����� ���ؼ��� id, password ���� �ʿ��ϴ�.
* User ��ü�� �̿��ؼ� 2���� ���� �ٸ� �ν��Ͻ��� ������.
* 
* 2. User Ŭ���� ���� id, password�� ����ϴ� �޼��带 �����ϰ�, Main����
* �̸� ���ؼ� �� �ν��Ͻ��� id, password�� �ҷ��Ͷ�
*
* 3. Circle Ŭ������ ������ r, ���� a, �ѷ� s ��� ������ ���� �ִ�.
* �� Ŭ������ ���ؼ� �ν��Ͻ��� ������ ���� ������ ���� �ʿ��ϴ�.
* ���� �ٸ� ������ ���� ������ �ν��Ͻ��� 2�� �����, ������ ���̿� �ѷ��� ����ض�.
*
* 4. Square Ŭ������ ���� ���� d, ���� a, �ѷ� s ��� ������ ���� �ִ�.
* �� Ŭ������ ���ؼ� �ν��Ͻ��� ������ ���� ���� ���̰� �ʿ��ϴ�.
* ���� �ٸ� ���� ���� ������ �ν��Ͻ��� 2�� �����, ������ ���̿� �ѷ��� ����ض�.
*
* 5. d ���� ������ �� �ִ� setD() ��� �޼��带 �����, a2�� d�� ������ ����
* a2�� ���̿� �ѷ��� ����ض�.
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
