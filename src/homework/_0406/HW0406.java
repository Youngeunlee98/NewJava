package homework._0406;

import homework._0406.clazz.HistoricPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class HW0406 {
    /*
    --------------------스트림--------------------
    1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.

    2. HistoricPerson이란 클래스를 만들고
    String name; String achievement; String country; 를 멤버변수로 만들고
    getter/setter 메소드를 생성합니다.
    getPersonInfo(String achievement); 매개변수로 받아온 업적에 해당하는 역사적 인물의
    정보를 리턴하는 기능을 만들고
    메인메소드에서 (이도, 한글, 조선), (이순신, 임진왜란, 조선), (담덕, 세력확장, 고구려)
    (장영실, 측우기, 조선), (이성계, 조선건국, 조선), (을지문덕, 살수대첩, 고구려),
    (이승만, 초대대통령, 대한민국), (고주몽, 고려건국, 고려),
    (김구, 독립운동, 대한민국), (제갈공명, 책략가, 촉)
    데이터를 갖는 List<HistoricPerson>를 만들어서 스트림으로 변환 후 사용자가 입력한 업적
    하나만 갖는 스트림을 생성하고 출력하세요.

    3. 2번에서 만든 List를 스트림으로 변환하고 성이 '이'씨인 인물만 갖는 스트림을 만들고 출력하세요.

    4. HistoricPerson에 getSameCountryPerson(String country)를 만들고
        2번에서 만든 List를 스트림으로 변환하고
        사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력하세요.

    5. 2번에서 만든 List를 스트림으로 변환하고 성이 두자 이상인 인물의 정보를
    스트림으로 만들어서 출력하세요.(을지문덕, 제갈공명)
     */

    public static void main(String[] args) {
        //1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여
        // 문자열의 길이가 5이상인 문자열만 출력하세요.
        Scanner sc = new Scanner(System.in);
        List<String>strList = new ArrayList<>();
        for (int i = 0; i <= 3 ; i++) {
            System.out.println("문자열을 입력해 주세요: ");
            String str = sc.next();
            strList.add(str); // 10개 문자열 저장하기
        }
        Stream<String> strStream = strList.stream(); // 스트림으로 저장

        //문자열 길이가 5이상 문자열만 거르자
        Stream<String> fiveStream = strStream.filter(a -> a.length()>=5);
        //출력
        fiveStream.forEach(a -> System.out.println("문자열 길이 5 이상: " + a));


        //2.
        System.out.println("---------2번----------");
        List<HistoricPerson> personList = new ArrayList<>();
        //(이도, 한글, 조선), (이순신, 임진왜란, 조선), (담덕, 세력확장, 고구려)
        //    (장영실, 측우기, 조선), (이성계, 조선건국, 조선), (을지문덕, 살수대첩, 고구려),
        //    (이승만, 초대대통령, 대한민국), (고주몽, 고려건국, 고려),
        //   (김구, 독립운동, 대한민국), (제갈공명, 책략가, 촉)
        personList.add(new HistoricPerson("이도", "한글", "조선"));
        personList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
        personList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
        personList.add(new HistoricPerson("장영실", "측우기", "조선"));
        personList.add(new HistoricPerson("이성계", "조선건국", "조선"));
        personList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
        personList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
        personList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
        personList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
        personList.add(new HistoricPerson("제갈공명", "책략가", "촉"));

        //스트림으로 변환하기
        Stream<HistoricPerson> hStream = personList.stream();
        System.out.println("업적을 입력하세요: ");
        String input = sc.next();

        Stream<HistoricPerson> achievStream = hStream.
                            filter(a -> a.getAchievement().equals(input));
        achievStream.forEach(a -> System.out.println(a));

        //3. 2번에서 만든 List를 스트림으로 변환하고 성이 '이'씨인 인물만 갖는 스트림을 만들고 출력하세요.
//
//        personList.add(new HistoricPerson("이도", "한글", "조선"));
//        personList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
//        personList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
//        personList.add(new HistoricPerson("장영실", "측우기", "조선"));
//        personList.add(new HistoricPerson("이성계", "조선건국", "조선"));
//        personList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
//        personList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
//        personList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
//        personList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
//        personList.add(new HistoricPerson("제갈공명", "책략가", "촉"));

        System.out.println("-------성이 이씨인 사람 출력----------");
        Stream<HistoricPerson> lastNameStream = personList.stream();
        lastNameStream.filter(b -> b.getName().startsWith("이")).forEach(b ->
                System.out.println(b));

        //4. 사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력
//        personList.add(new HistoricPerson("이도", "한글", "조선"));
//        personList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
//        personList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
//        personList.add(new HistoricPerson("장영실", "측우기", "조선"));
//        personList.add(new HistoricPerson("이성계", "조선건국", "조선"));
//        personList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
//        personList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
//        personList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
//        personList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
//        personList.add(new HistoricPerson("제갈공명", "책략가", "촉"));

        Stream<HistoricPerson> countryStream = personList.stream();
        System.out.println("국가를 입력하세요: ");
        String input2 = sc.next();

        Stream<HistoricPerson> country2Stream = countryStream.
                filter(c -> c.getCountry().equals(input2));
        country2Stream.forEach(c -> System.out.println(c));

        System.out.println("------------마지막-----------");
        // 성이 두자 이상인 인물의 정보를
        //    스트림으로 만들어서 출력하세요.(을지문덕, 제갈공명)
//        personList.add(new HistoricPerson("이도", "한글", "조선"));
//        personList.add(new HistoricPerson("이순신", "임진왜란", "조선"));
//        personList.add(new HistoricPerson("담덕", "세력확장", "고구려"));
//        personList.add(new HistoricPerson("장영실", "측우기", "조선"));
//        personList.add(new HistoricPerson("이성계", "조선건국", "조선"));
//        personList.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
//        personList.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
//        personList.add(new HistoricPerson("고주몽", "고려건국", "고려"));
//        personList.add(new HistoricPerson("김구", "독립운동", "대한민국"));
//        personList.add(new HistoricPerson("제갈공명", "책략가", "촉"));

        Stream<HistoricPerson> twonameStream = personList.stream();
        System.out.println("성이 두자 이상인  인물을 출력합니다.......");

        Stream<HistoricPerson> names = twonameStream.filter(d -> d.getName().length() >3);
        names.forEach(d-> System.out.println(d));

    }

}
