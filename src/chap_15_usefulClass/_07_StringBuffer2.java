package chap_15_usefulClass;

public class _07_StringBuffer2 {
    public static void main(String[] args) {

            StringBuffer sb1 = new StringBuffer(100);
            StringBuffer sb2 = new StringBuffer("bitcamp");

            sb1.append("naverCloud");

            //capacity() 와 length의 차이점
            System.out.println(sb1.capacity()); //지정한 100이 나옴
            System.out.println(sb1.length());  // 담겨있는 문자열의 길이를 리턴하므로 10

            //delete 와 insert
            StringBuffer sb3 = sb2.delete(3,7); //startindex~endindex 부분 삭제
            System.out.println(sb3); // bit

            sb3 = sb3.insert(3, "camp"); // 3번째부터 다시 camp 추가
            System.out.println(sb3);

            //reverse()
            sb1 = sb1.reverse(); // 거꾸로
            System.out.println(sb1);

            //setCharAt()
            sb3.setCharAt(3, 'C'); // 3번째 글자를 C로 바꿈
            System.out.println(sb3);

            //setLength()
            sb3.setLength(10); //  원래는 길이 7 인데
            System.out.println(sb3); // 기존보다 기니까 공백이 생긴다.

    }
}
