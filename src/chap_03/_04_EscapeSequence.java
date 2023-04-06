package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character...)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭의 역할 줄 간격을 맞춰줌.
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t7000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Files\\Java");

        // \" : 문장 내 끈따옴표
        // 단비가 "야옹" 이라고 했어요
        System.out.println("단비가\"야옹\"이라고 했어요");

        // \' : 문장 내 작은 따옴표
        //작은따옴표 같은 경우에는 굳이 \'를 안써도 되지만 char 변수 경우에는 작은따옴표 필요시 반드시 사용해야함.
        // 단비가 '뭥 봐?' 라는 표정을 지었어요
        System.out.println("단비가\'뭘 봐?\'라는 표정을 지었어요");

    }
}
