package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림?? 데이터가 흐르는 느낌?!
        // 스트림 생성
        //Arrays.stram
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"Python", "Java", "Javascript", "C", "C#", "C++"};
        Stream<String> langStream = Arrays.stream(langs);
        //Collection.stream()
        // List<String> langList = new ArrayList<>();
        // langList = Arrays.asList("Python", "Java", "Javascript", "C", "C#", "C++");
        System.out.println();
        //Stream<String> langListStram = langList.stream();

        //Stram.Of
        Stream<String> langListOfStream = Stream.of("Python", "Java", "Javascript", "C", "C#", "C++");


        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip , ....
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch...

        // 90점 이상인 점수만 출력
        System.out.println("90점 이상인 점수만 출력");
        IntStream stream = Arrays.stream(scores);
        System.out.println(stream);
        stream.filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        System.out.println("90점 이상인 사람의 수");
        // 90점 이상인 사람의 수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("---------------------------------------------------------");
        System.out.println("90점 이상인 사람의 수의 합");
        // 90점 이상인 사람의 수의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("---------------------------------------------------------");

        // 90점 이상인 사람들의 정렬(낮은 순)

        System.out.println("90점 이상인 사람들의 정렬(낮은 순)");
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(x -> System.out.println(x));


        System.out.println("---------------------------------------------------------");
        // C로 시작하는 프로그램 언어 찾기
        System.out.println("C로 시작하는 프로그램 언어 찾기");
        Arrays.stream(langs).filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        // Java라는 글자를 포함하는 글자만 찾기
        System.out.println("Java라는 글자를 포함하는 글자만 찾기");
        Arrays.stream(langs).filter(x -> x.contains("Java")).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        // 글자 길이가 4글자 이하인 언어만 찾기
        System.out.println("글자 길이가 4글자 이하인 언어만 찾기");
        Arrays.stream(langs).filter(x -> x.length() <= 4).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        // 글자 길이가 4글자 이하인 언어만 찾기(정렬추가)
        System.out.println("글자 길이가 4글자 이하인 언어만 찾기(정렬추가)");
        // langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        // 글자가 길이가 4글자 이하 언어 중에 c라는 글자를 포함하는 언어
        System.out.println("글자가 길이가 4글자 이하 언어 중에 c라는 글자를 포함하는 언어");
        // langList.stream().filter(x -> x.length() <= 4 && x.contains("C")).sorted().forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        // 4글자 이하의 언어 중에서 C라는 글자를 다 포함하는지 여부
        System.out.println("4글자 이하의 언어 중에서 C라는 글자를 포함하는 글자가 하나라도 있는지 여부");
        // boolean allMatch = langList.stream().filter(x -> x.length() <= 4).allMatch(x -> x.contains("C"));
        // System.out.println(allMatch);
        System.out.println("---------------------------------------------------------");
        // 4글자 이하의 언어 중에서 C라는 글자를 하나라도 포함하고 있는지 여부
        System.out.println("4글자 이하의 언어 중에서 C라는 글자를 포함하는 글자가 하나라도 있는지 여부");
        //boolean anyMatch = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("C"));
        //System.out.println(anyMatch);
        // System.out.println("---------------------------------------------------------");
        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요)라는 글자를 함게 출력
        System.out.println("4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요)라는 글자를 함게 출력");
        //langList.stream()
        //         .filter(x -> x.length() <= 4 && x.contains("C"))
        //          .map(x -> x + " (어려워요)")
        //         .forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        // C라는 글자를 포함하는 언어를 소문자로 출력
        // System.out.println("C라는 글자를 포함하는 언어를 소문자로 출력");
        // langList.stream().filter(x -> x.contains("C"))
        //       .map(x -> x.toLowerCase())
        //        .forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        // C 라는 글자를 포함하는 언어를 소문자로 변경하여 리스트로 저장
        //System.out.println("C 라는 글자를 포함하는 언어를 소문자로 변경하여 리스트로 저장");
        // List<String> listMap = langList.stream().filter(x -> x.contains("C"))
        //        .map(x -> x.toLowerCase())
        //        .collect(Collectors.toList());

        //System.out.println(listMap);
        System.out.println("---------------------------------------------------------");

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("Python", "Java", "Javascript", "C", "C#", "C++");
        Stream<String> langListStram = langList.stream();
        List<String> listMap1 = langList.stream().filter(y -> y.contains("C"))
                .map(x -> x.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(listMap1);

    }
}
