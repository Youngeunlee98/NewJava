package chap_99;

public class _03_countkorean {
    public static void main(String[] args) {
        String str = "A가B나C다D라마바사";
        //문자 하나씩 꺼내서 한글 판별 변수
        char ch;
        //한글 개수 셀 변수
        int kCnt = 0;

        for (int i=0; i < str.length(); i++){
            ch = str.charAt(i);
            if (ch >= 44032 && ch <= 55203){
                kCnt ++;
                //kCnt += 1;
                //kCnt = kCnt +1;
            }
        }
        System.out.println("한글의 개수는 " + kCnt + "개 입니다.");


    }
}
