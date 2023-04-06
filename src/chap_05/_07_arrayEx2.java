package chap_05;

public class _07_arrayEx2 {
    public static void main(String[] args) {

        char[] chArr = {'B', 'c', 'T', 'p', 'P', 'i'};
        char[] convertArr = new char[6];

        //소문자->대문자 / 대문자->소문자로 변경 후 convertArr에 저장

        System.out.println("----대소문자 변경 전-----");
        System.out.println(chArr[0]);
        System.out.println(chArr[1]);
        System.out.println(chArr[2]);
        System.out.println(chArr[3]);
        System.out.println(chArr[4]);
        System.out.println(chArr[5]);

        System.out.println("----대소문자 바꾸기-----");
        //대문자 -> 65~90/ 소문자->97~122
        for (int i = 0; i < chArr.length; i++) {

            if(chArr[i] >= 'A' && chArr[i]<= 'Z'){
                convertArr[i] = (char)( chArr[i] + 32);
            }else{
                convertArr[i] = (char)( chArr[i] - 32);

            }
            System.out.println(convertArr[i]);
        }


    }
}
