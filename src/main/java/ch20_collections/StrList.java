package ch20_collections;

import java.util.*;

public class StrList {
    public static void main(String[] args) {
        // 비어있는 List 생성 방법
        List<String> strList1 = new ArrayList<>();
        // 배열과의 차이점도 볼 필요가 있다.
        String[] strArray1 = new String[2]; // 배열은 인덱스 넘버가 고정되어있지만 , 리스트는 없음.
        // 배열에 element를 넣는 방법
        strArray1[0] = "김영";
        // List에 element를 넣는 방법  -> method를 통해서 element를 넣어야함
        strList1.add("Java");
        strList1.add("python");
        strList1.add("C#");
        strList1.add("JavaScript");
        strList1.add("Kotlin");

        // 출력
        System.out.println(strArray1); // 참조자료형이라서 주소값이 출력
        System.out.println(Arrays.toString(strArray1));     // 배열은 출력하기 위해 static method를 경유해야함
        System.out.println(strList1);

        // 특정 element의 포함 여부 -> contains() 메서드를 사용 -> return boolean
        String searchElem1 = "python";
        boolean contains1 = strList1.contains(searchElem1); //elem이란 표현은 element의 축약어로 자주 쓰임
        System.out.println(searchElem1 + "의 포함 여부 : " +contains1);

        String searchElem2 = "Jav";
        boolean contains2 = strList1.contains(searchElem2);
        System.out.println(searchElem2 + "의 포함 여부 : " +contains2);

        String email = "a@test.com";
        boolean contains3 = email.contains("@");
        System.out.println("@의 포함여부 : " + contains3);
        // String 의 경우는 char들이 '순서대로' 나열된 것이기 때문에 char 하나가 포함된 것을 contains() 메서드를 통해 부분 검색이 가능
        // searchElem2의 경우(즉 , List의 element)는 '완전히' 일치하는지를 확인하기 때문에 "python"포함 여부는 true / "py"
        // 포함 여부는 false 가 출력

        // 특정 element의 삭제 -> remove()
        String removeElem1 = "Kotlin";
        boolean removed1 = strList1.remove(removeElem1);
        System.out.println(removeElem1 + "의 삭제 여부 : " + removed1);
        System.out.println(strList1);

        // 마찬가지로 .remove() 역시 element 전체가 일치하는지를 확인하기 때문에 element의 일부만 가지고 삭제하는것이 불가능하다
        //(일부로 element 전체 삭제 불가능 )
        // 또한 removeElem2 = "py"로 했을 때 sout(strList1)의 결과값 중 element로 "py"만 삭제하고 "thon"만 남는것이 불가능

        String removeElem2 = "py";
        boolean removed2 = strList1.remove(removeElem2);
        System.out.println(removed2 + " 의 삭제 여부 : " + removed2);
        System.out.println(strList1);

        // List의 정렬 -> 배열과 동일
        Collections.sort(strList1);         // 마찬가지로 원본 배열을 다 바꾼다 (index가 바뀜)
        System.out.println("정렬된 List : " + strList1);

        // 역순 정렬
        Collections.sort(strList1, Collections.reverseOrder());
        System.out.println("역순 정렬된 List : " + strList1);

        // 배열과 유사하게 element들을 다 뽑을 수 있음.

        //python 언어 java 언어 javaScript 언어  C#언어로 출력될 수 있도록 작성

        //일반 for문 사용
//        for (int i = 0; i < strList1.size(); i++) {
//            System.out.println(strList1.get(i) + "언어");
//        }
        // 이상의 코드에서 알 수 있는 점은 배열과는 달리 한계값을 출력하기 위해서 리스트명.size() 를 사용
        // 출력할 때도 리스트명.get(i) 를 썻다는 점 / 배열의 경우는 배열명.length 배열명[i]를 사용햇음.


        // 향상된 for문 사용
        for (String elem : strList1) {
            System.out.println(elem + "언어");
        }
    }
}

