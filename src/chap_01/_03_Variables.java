package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "공주"; //String name = "공주" 라고 해도 무방함.
        int hour = 15;

        System.out.println(name + "님, 배송이 곧 시작됩니다." + hour +"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 99.8; //double은 상대적으로 정밀한 데이터 값을 나타냄
        char grade = 'A'; //한 글자인 char은 작은 따옴표로 적음
        name = "이영은";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true; //true false는 따옴표 없이 적음
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14F; //float은 소수점 포함 실수값,정밀데이터는 넣을수 없음/뒤에 F를 넣으면 됨.
        //float은 소수점 밑에 6자리까지는 표시되지만 이하 자리수는 표현못함.
        System.out.println(d);
        System.out.println(f);

        //int에 수용가능하지 않은 정수범위일 경우 long을 써야하는데 long으로 바꾼 후에 숫자 끝에 소문자 또는 대문자 L을 넣어주면 됨.
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
