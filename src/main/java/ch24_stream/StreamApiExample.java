package ch24_stream;

import java.util.Arrays;
import java.util.List;

// Stream API에 달려있는 주요 메서드 예제 설명
public class StreamApiExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사");
        //filter()
        List<String> namesWithKim = names.stream().filter(name -> name.startsWith("김"))
                .toList();      // to~~ 메서드가 실행되었다는 말은 , 이전의 자료형이 List가 아니였으며 ,
                                // toList로 인해 List 자료형이 되었음
    // filter 는 그 자체로만 한번 쓰이기보다는 합쳐서 쓰임
        // filter / map / sorted / collect
        List<String> englishNames = Arrays.asList("alice", "anya", "bacon", "camel", "pascal", "yor", "spy", "family");
        List<String> result = englishNames.stream()
                // stream() 과 .toList 사이에 다양한 메서드를 사용할수 있음
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase)              // 이상의 결과값으로 이름이 "a"로시작하는 이름들을 대문자로 변경시켜줌
                .sorted()                                       // 정렬 의미 배열의 sort가 아님
                .toList();                                      // List 자료형으로 변경

        System.out.println(englishNames);
        System.out.println(result);


        // count()
        int count1 = englishNames.size();   // element의 전체 개수를 세는것만 가능.
        System.out.println(count1);
        long count2 = englishNames.stream().filter(name -> name.length() > 3).count();

        System.out.println(count2);
        // 33번 라인을 기존 방식대로 작성한다고 가정했을 때 일반 for문 , 향상된 for문 중 element들을 뽑아낼 때 사용해야 하는걸 결정해야함
        int count3 = 0;
        for (int i = 0; i < englishNames.size(); i++) {
            // 그리고 각 element의 String 길이가 3초과인지 확인하는 조건문을 작성해야함
            if (englishNames.get(i).length() > 3) {
                count3++;
            }
        }
        System.out.println("-----------------");
        System.out.println(count3);

        System.out.println(names);
        System.out.println(namesWithKim);

    }
}
