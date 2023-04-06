package chap_17_Jeneric.clazz;

import java.util.List;

public class BoardFile<T> {
    //<T> 는 확장성
    // T == FreeBoard 면 boardNo == fBoardNo
    private int boardNo; // 어떤 게시글에 첨부되는지 알기위해서는 게시글넘버가 필히 필요
    private int type;
    private String fileNm;
    private T t; // 확장성을 위해


    public int getBoardNo() {
        return boardNo;
    }

    public int getType() {
        return type;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getFileNm() {
        return fileNm;
    }

    public void setFileNm(String fileNm) {
        this.fileNm = fileNm;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }
}
