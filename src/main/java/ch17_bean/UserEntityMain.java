package ch17_bean;

/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+


 */

public class UserEntityMain {

    public static void main(String[] args) {
        UserEntity user1 = new UserEntity(1, 9876, " a@test.com", "김재원");

        System.out.println(user1);

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setName("김이");
        user2.setPassword(9876);
        user2.setEmail("b@test.com");
        user2.setUsername(2);
        System.out.println(user2);
    }
}
