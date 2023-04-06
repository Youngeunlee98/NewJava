package chap_99;

public class _02_holyShit {
    public static void main(String[] args) {


        /*
        char capCh = ch >= 'A' && ch <= 'Z'
                    ?
                    (char)((int)ch + 32) //true
                    :
                    (char)((int)ch - 32) ;//false;
            capStr = capCh + capStr;
         */


        String str = "AbcDeF";
        String capStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //첫 번째 ch는 A이다.

            char convertCh;

            if (ch >= 'A' && ch <= 'Z') {
                if (ch >= 'A') {
                    convertCh = ((char) ((int) ch + 32));
                } else {
                    convertCh = (char) ((int) ch - 32);
                }
            }
            capStr = str.charAt(i) + capStr;
        }
        System.out.println(capStr);
    }
}
