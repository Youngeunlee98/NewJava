package homework._0405;

import chap_07.Car.Car;
import homework._0405.clazz.Card;
import homework._0405.clazz.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hw {
    /*
    1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다.
     intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.(방법1 사용)

2. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
    List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)
  를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

3. 2번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.

4. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
    영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.

5. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서
    문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
-----------------------------------------
6번 ~ 13번까지 한 문제

6. 클래스 Card를 만들고 String cardName; int validYear; 멤버변수를 생성하고 getter/setter 및 유효기간을 연장하는 void validEnlong을 만듭니다.

7. 함수형 인터페이스인 CardVali를 생성하고 추상메소드로 void enlong(int year);를 선언합니다.

8. 6번에서 만든 validEnlong에서 연장할 유효기간과 CardVali를 매개변수로 받아서
현재 유효기간 + 매개변수로 받아온 유효기간으로 변경해주고
     함수형 인터페이스 CardVali의 enlong을 호출합니다.

9. 메인메소드에서 Card의 List를 생성하고 {"a", 3}, {"b", 1}, {"c", 0}, {"d", 1}, {"e", 2}, {"f", 5} 같은 데이터를 저장합니다.

10. cardList를 스트림으로 변경하고 유효기간이 1년 이하인 카드들만 저장된 스트림을 만듭니다.

11. 위에서 만든 스트림에서 validEnlong호출해서 3년씩 연장된 새로운 스트림을 만들고 "3년 연장되었습니다"라는 문구를 출력하세요.

12. 연장된 카드들의 정보를 "c카드의 유효기간은 3년입니다."라고 출력하세요.

13. 위에서 스트림을 사용한 것을 체이닝 기법으로 변경하세요.


     */

    //1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다.
    // intList를 Stream으로 만들어서
    // 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.(방법1 사용)

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            intList.add(random.nextInt(10) + 1);
        }

        Stream<Integer> intStream = intList.stream();   //바로리턴됨
        Stream<Integer> mulStream = intStream.map(num -> num * 3);
        mulStream.forEach(System.out::println);

        System.out.println("-------------2번-------------");

        //2. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
        //List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산,  86),
        // (4, 정도전, 97), (5, 이순신, 95)
        //  를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "홍길동", 100));
        studentList.add(new Student(2, "임꺽정", 75));
        studentList.add(new Student(3, "장길산", 86));
        studentList.add(new Student(4, "정도전", 97));
        studentList.add(new Student(5, "이순신", 95));

        Stream<Student>stuStream = studentList.stream();

        stuStream.filter(sl -> sl.getScore() >= 95)
                .forEach(cl ->
                        System.out.println("95점 이상인 학생: " + cl.getsName()));

        System.out.println("----------3---------");
        //3. 2번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
        studentList.stream().filter(sg -> sg.getScore() >= 90)
                .map(sg ->{
                    sg.setGrade("A+");
                    return sg;
                })
                .forEach(sg ->
                        System.out.println(sg.tostring()));



        //4. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고
        // 스트림을 이용해서 영문자가 소문자면 대문자로
        // 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
        System.out.println("----------4---------");
        Scanner sc = new Scanner(System.in);

        List<Character>charList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("영문자를 입력하세요 : ");
            char c = sc.next().charAt(0);
            charList.add(c); // 리스트에 차곡차곡.....
        }

        // 대소문자 변환 스트림 생성
        List<Character> convertList = charList.stream()
                .map(c -> Character.isUpperCase(c)
                        ? Character.toLowerCase(c) : Character.toUpperCase(c))
                .collect(Collectors.toList()); //삼항연산자 사용 쌉가능함.

        System.out.println("대문자는 소문자로, 소문자는 대문자로 : " + convertList);

        //5.사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 스트림을 이용해서
        //문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.
        System.out.println("----------5---------");
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("문자열을 입력하세요 : ");
            String str = sc.next();
            strList.add(str); // 여기도 차곡차곡.....
        }

        //영문자 뽑기 시작

        List<String> changestr = strList.stream()
                .filter(str -> str.matches(".*[a-zA-Z]+.*"))  //정규식
                .collect(Collectors.toList());//리스트로 변환
        System.out.println("입력한 문자열 중 영문자 포함 ->> " + changestr);

        System.out.println("------------9--------------");


        //메인메소드에서 Card의 List를 생성하고 {"a", 3}, {"b", 1},
        // {"c", 0}, {"d", 1}, {"e", 2}, {"f", 5} 같은 데이터를 저장합니다.
        System.out.println("(---[데이터 저장중]---)");

        List<Card> cardList = new ArrayList<>();

        cardList.add(new Card("a",3));
        cardList.add(new Card("b",1));
        cardList.add(new Card("c",0));
        cardList.add(new Card("d",1));
        cardList.add(new Card("e",2));
        cardList.add(new Card("f",5));

        System.out.println("------------10~11------------");
        //cardList를 스트림으로 변경하고 유효기간이 1년 이하인 카드들만 저장된 스트림을 만듭니다.
        //위에서 만든 스트림에서 validEnlong호출해서 3년씩 연장된 새로운 스트림을 만들고
        // "3년 연장되었습니다"라는 문구를 출력하세요.

        Stream<Card> twoStream = cardList.stream()
                .filter(card -> card.getValidYear() <= 1);
        twoStream
                .forEach(card ->card.validEnlong(
                        3,year -> {
                            System.out.println(year + " 년 연장되었습니다.");
                            System.out.println(card.toString()); // 12번 문제
                        }));







    }

}
