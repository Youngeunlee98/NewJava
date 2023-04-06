package chap_15_usefulClass;

public class _01_object {
    public static class Example implements Cloneable{
        public Object clone(){

            //clone쓰려면 implements Cloneable

            Object obj = null;
            try{
                //
                obj = super.clone();
            }catch(CloneNotSupportedException ce){
                System.out.println(ce.getMessage());
            }
            return obj;
        }

    }

    public static void main(String[] args) {

        Example ex1 = new Example();
        Example ex2 = (Example)ex1.clone();

        if(ex1.equals(ex2)){
            System.out.println("같은 객체입니다.");
        }else {
            System.out.println("다른 객체입니다.");
        }
        // 객체의 얇은 복사
        ex2 = ex1;
        if(ex1.equals(ex2)){
            System.out.println("같은 객체입니다.");
        }else {
            System.out.println("다른 객체입니다.");
        }
    }
}
