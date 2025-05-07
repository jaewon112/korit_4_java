package ch20_collections;

import java.util.*;

public class StrMap {
    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        //Map에 key - value 쌍 삽입 -> .put(키 , 값)
        strMap1.put("kor20250001", "김일");
        strMap1.put("kor20250002", "김이");
        strMap1.put("kor20250003", "김삼");
        strMap1.put("kor20250004", "김사");
        strMap1.put("kor20250005", "김오");

        //Map 출력
        System.out.println(strMap1);
        System.out.println("----------");

        strMap1.put("kor20250005", "김오오");
        System.out.println(strMap1);
        //Map 의 특징중 하나로 하나의 key 에는 하나의 value 만 가능하다.
        // 그래서 key 값이 동일하다면 value값은 최신것으로 덮어쓰기가 된다.

        //List의 경우에는 특정 인덱스를 조회하고 싶다면 리스트명.get(인덱스넘버); 의 형태로 확인할 수 있었다
        // Map의 경우에는 순서는 없는 대신 key가 있기 때문에

        // 특정 key 의 value 조회
        System.out.println(strMap1.get("kor20250002"));
        //이상과 같은 방법으로 출력이 가능하다 -> value만 나옴.

        // Java -> Map에서는 key - value pair를 entry라고 칭한다.

        // 특정 키의 값 수정 #1 -> .put(key)를 통해 덮어쓰기
        strMap1.put("kor20250001", "김일");

        // 특정 키의 값 수정 #2 -> .replace();
        strMap1.replace("kor20250002", "김이");

        //특정 키의 존재 여부 -> containsKey(); ->boolean
        boolean searchKeyFlag1 = strMap1.containsKey("kor20250006");
        System.out.println("Key 존재 여부 : " + searchKeyFlag1);

        // 특정 값 존재 여부 -> containsValue(); -> boolean
        boolean serchValueFlag1 = strMap1.containsValue("김삼");
        System.out.println("Value 존재 여부 : " + serchValueFlag1);

        // Map의 엔트리로부터 Set을 생성 - 제네릭 사용
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();     //비어있는 Set 생성
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();  // Map의 element를 Set에 삽입
        System.out.println(entrySet1);
        System.out.println(entrySet2);
        System.out.println(entrySet2.size());   // 5가 출력된다는 점에서 'key값 = value값' 이 하나의 element로 잡힌다.

        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
//        List<Map.Entry<String, String>> entryList2 = strMap1.entrySet();       // Map -> List 대입이 불가는하다는걸 볼 수 있는 예시
        // Map에서 List로의 형변환을 하고 싶다면 Set을 경유해야한다.
        entryList1.addAll(entrySet2);
        System.out.println(entryList1);
        //그러면 sort가능

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();          // key의 자료형과 Set의 제네릭 자료형이 같아야한다
        System.out.println(keySet);
        // Value Set 출력
//        Set<String> valueSet = strMap1.values();        //오류 발생 예시 -> 필요한 타입 Set / 제공된 타입 Collection
//        이상에서ㅏ 문제가 발생하는 이유는 key는 어짜피 중복을 허용하지 않기 때문에 Set으로 형변환이 가능하지만
        // 복수의 key에서 동일한 value가 존재할 수 있기 때문에 Set으로 생성이 불가능
        Collection<String> values = strMap1.values();
        System.out.println(values);         // Value만 출력할 때 .sort() 할 때 처럼 Collections가 아니라 Collection이다
    }

}
