package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private String age;

}

public class JSON2 {
    public static void main(String[] args) {
        // 객체 생성
        Gson gson = new Gson();
        Gson gsonBulder = new GsonBuilder().setPrettyPrinting().create();

        // 변수 선언
        String userJson = null;

        // 1. Jav Object -> json으로 변환
        User user1 = new User("kim", "9876", "a@test.com", "김일", "20");
        // 생성된 user1 인스턴스를 Json 데이터로 바꾸는 법
        userJson = gson.toJson(user1);
        System.out.println("gson 사용 결과값 : " + userJson);
        userJson = gsonBulder.toJson(user1);
        System.out.println("gsonBuilder 사용 결과값 : " + userJson);

        //2. JsonObject -> json으로 변환
        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("studentCode", "20250001");
        jsonObject1.addProperty("studentName", "김이");
        jsonObject1.addProperty("studentYear ", 2);
        jsonObject1.addProperty("score", 96.7);

        String studentJson = gson.toJson(jsonObject1);
        System.out.println(studentJson);
        // gson 및 gsonBuilder
        studentJson = gsonBulder.toJson(jsonObject1);
        System.out.println(studentJson);

        // 3. Map -> Json 데이터로
        Map<String, String> map1 = new HashMap<>();

        map1.put("productCode", "NT960XHA-KD72G");
        map1.put("productName", "삼성 갤럭시북 프로 5");

        System.out.println("gson 사용 사례 : " + gson.toJson(map1));
        System.out.println("gsonBuilder 사용 사례 : " + gsonBulder.toJson(map1));
        String productJson = gsonBulder.toJson(map1);       // Json 데이터들의 자료형이 전부 String으로 선언되어있다는것에 주목해야함

        // json -> Map / Java 객체 자료형으로 바꾸려면
        // json 데이터를 user 객체로 바꾸는것과 json 데이터를 map2 형태로 작성하는것을 의미한다
        // gson.fromJson(제이슨테이터 , 바꾸고자하는 클래스명.class)

        // json -> map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        // gsonBulder.toJson(map1) , gson.toJson(map1) 이든 상관 없음
        System.out.println(map2);

        // json -> User 클래스의 인스턴스로 바꾸는 방법

        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        // json -> jsonObject : 이것이 의미하는 바는 json 데이터 =/= JsonObject이다.
        // studentJson의 자료형은 String이고 jsonObject1의 자료형은 JsonObject이니까.
        JsonObject jsonObject2 = gson.fromJson(studentJson, JsonObject.class);
        System.out.println(jsonObject2);



        

    }
}
