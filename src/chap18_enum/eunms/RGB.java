package chap18_enum.eunms;

public enum RGB {
    //상수명 Red("red" ,255 ,0, 0) Green("green" ,0 ,255, 0) Blue("blue" ,0 ,0, 255)
    Red("Red", 255, 0, 0){
        public void makeWhite() {
            String[] color = {"red", "green", "blue"};

            int index = 0;

            for(String s : color) {
                if(!s.equals(this.getColor())) {
                    if(index == 0) {
                        System.out.print(s + ", ");
                    } else {
                        System.out.print(s + " ");
                    }
                    index++;
                }
            }

            System.out.println("색상이 부족합니다.");
        }
    },
    Green("Green", 0, 255, 0){
        public void makeWhite() {
        String[] color = {"red", "green", "blue"};

        int index = 0;

        for(String s : color) {
            if(!s.equals(this.getColor())) {
                if(index == 0) {
                    System.out.print(s + ", ");
                } else {
                    System.out.print(s + " ");
                }
                index++;
            }
        }

        System.out.println("색상이 부족합니다.");
    }
    },
    Blue("Blue", 0, 0, 255){
        public void makeWhite(){
            String[] color = {"red", "green", "blue"};

            int index = 0;

            for(String s : color) {
                if(!s.equals(this.getColor())) {
                    if(index == 0) {
                        System.out.print(s + ", ");
                    } else {
                        System.out.print(s + " ");
                    }
                    index++;
                }
            }

            System.out.println("색상이 부족합니다.");
        }
    };

        private int c1;
        private int c2;
        private int c3;
        private String color;

        public int getC2 () {
        return c2;
    }

        public String getColor () {
        return color;
    }

        public int getC1 () {
        return c1;
    }

        public int getC3 () {
        return c3;
    }


        RGB(String color, int c1, int c2, int c3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.color = color;
    }
    public abstract void makeWhite();

    }
