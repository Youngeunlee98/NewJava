package chap_15_usefulClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _14_regex02 {
    public static void main(String[] args) {
        //[a-zA-Z0-9]{20} a~z, A~Z,0~9의 조합 8~20 자리
        //[.문자] : .뒤에 문자를 하나이상 포함
        //@[a-zA-Z0-9.-] .하나 이상을 포함하는 a~z, A~Z,0~9의 조합
        //\.[a-zA-Z]{2,} a~z, A~Z의 조합, 두자리 ㅅ이상 제한 없음.
        String pattern = "[a-zA-Z0-9]{20}+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        String email = "제 이메일 주소는 aaa12345@b-bb.ccc";

        Pattern pt = Pattern.compile(pattern);
        Matcher m = pt.matcher(email);



        //find() : pattera과 일치하는 경우 true /false
        while(m.find()){
            System.out.println("이에링 주소: " + m.group());
        }

        /*if(m.matches()){
            System.out.println("올바른 형식입니다.");
        }else {
            System.out.println("잘못된 형식입니다.");
        }
        */

    }
}
