package homework._01_0314;

public class _01_advance {
    public static void main(String[] args) {

        /*
        1. 조건문만 삼항 조건 연산자를 이용하여 String str = "dBEfIZ"; 를 이용하여 ajEfcC 출력하세요.
         */
        String str = "dBEfIZ";
        String capStr = "";
       /* for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            char capStr = ch >=
        }

         =((char)i > 32) ?  i-- : i++ ;
        */
        for(int i = 0; i < str.length(); i ++){
            char ch = str.charAt(i);

            char capCh = ch >= 'A' && ch <= 'Z'
                    ?
                    (char)((int)ch + 32)
                    :
                    (char)((int)ch - 32) ;
            capStr = capCh + capStr;
        }
        System.out.println(capStr);




    }
}
