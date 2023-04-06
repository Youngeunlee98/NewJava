package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        //이중 반복문

        //예제: 별(*) 로 사각형을 만들기.
        /*

         *****
         *****
         *****
         *****
         *****

         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======2======");
        //별 왼쪽 삼각형 만들기

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======3======");
        //별 오른쪽 삼각형 만들기


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===========3-1=============");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j <= 0; j--) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.println(" ");
                }
            }System.out.println("");

        }

            System.out.println("=======4========");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i >= j) {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }


            System.out.println("+++++++++5++++++=++++");

            /*




             *****
             ****
             ***
             **
             *


             */

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i <= j) {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }




        }
    }
