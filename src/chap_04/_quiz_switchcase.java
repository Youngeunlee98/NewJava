package chap_04;

public class _quiz_switchcase {

    public static void main(String[] args) {

        //학점 안내

        String grade = "B";


        switch (grade){
            case "A":
                System.out.println("A학점 입니다.");
                break;
            case  "B":
                System.out.println("B학점 입니다.");
                break;
            case  "C":
                System.out.println("C학점 입니다");
                break;
            default:
                System.out.println("낙제입니다.");
                break;
        }
        System.out.println("감사합니다.");


        //음료수 이름을 입력하면 가격을 조회해주는 프로그램


    }
}
