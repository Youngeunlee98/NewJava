package chap18_enum.eunms;

public enum SubwayMap {
    Gangnam("강남"){
        @Override
        public void subLine() {
            System.out.println(this.getSubStation() + "역은 2호선 입니다.");
        }
    },
    Sadang("사당"){
        public void subLine() {
            System.out.println(this.getSubStation() + "역은 2호선입니다.");
        }
    },
    Yeoksam("역삼"){
        public void subLine() {
            System.out.println(this.getSubStation() + "역은 2호선입니다.");
        }
    },
    Beomgye("범계"){
        public void subLine() {
            System.out.println(this.getSubStation() + "역은 4호선입니다.");
        }
    },
    Isu("이수"){
        public void subLine() {
            System.out.println(this.getSubStation() + "역은 4호선입니다.");
        }
    },
    Seoul("서울"){
        public void subLine() {
            System.out.println(this.getSubStation() + "역은 1,4호선입니다.");
        }
    };


    private String subStation;

    SubwayMap(String subStation){
        this.subStation = subStation;
    }
    public String getSubStation(){
        return subStation;
    }

    public abstract void subLine();



}
