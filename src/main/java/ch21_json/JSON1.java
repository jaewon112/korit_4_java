package ch21_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;


public class JSON1 {
    public static void main(String[] args) {
        // JsonObject 클래스의 인스턴스 생성
        JsonObject jsonObject1 = new JsonObject();
        // 속성(key-value entry)을 추가하는 메서드 -> addProperty() 사용
        jsonObject1.addProperty("username", 1);
        jsonObject1.addProperty("password", 1234);
        jsonObject1.addProperty("email", "a@test.com");
        jsonObject1.addProperty("name", "김일");
        System.out.println(jsonObject1);
        //Map 과의 출력에서 차이는 = ,: ""


        /*
            {"username":1,"password":1234,"email":"a@test.com","name":"김일"}
            이상의 콘솔창에서의 결과값을 Java Map 과 비교해보자면
            1. Map 에는 key 부분에 ""가 없고, JSONM에서는 모든 key가 String 자료형처럼 보이도록 ""가 있다.
            2. Map 에서는 key1 = value1의 형태로 작성되어있지만 JSON에서는 "key1" : value1의 형태로 작성되어있다.
         */
        jsonObject1.addProperty("job", "코리아아이티");
        System.out.println(jsonObject1);
        /*
            콘솔에 출력된 값을 확인해보면 한 줄로 길게 늘어져 있다.
            addProperty() 를 통해 키 - 값 쌍을 늘릴수록 계속 길어져서 가독성을 해치게 될 것으로 보임
            .md 파일에서 작성한 것 처럼 key:value 마다 개행이 나을거 같음.
            이때 사용하는 것이 GSon 관련 클래스이다
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); //method chaining 개념을 떠올려야함.
        String json = gson.toJson(jsonObject1);
        System.out.println(json);
    }

}
