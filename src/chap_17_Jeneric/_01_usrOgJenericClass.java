package chap_17_Jeneric;

import chap_17_Jeneric.clazz.BoardFile;
import chap_17_Jeneric.clazz.FreeBoard;
import chap_17_Jeneric.clazz.NoticeBoard;

public class _01_usrOgJenericClass {
    public static void main(String[] args) {
        //자유게시판 게시글에대한 첨부파일
        BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>();
        //아래 방식우로도 선언 할 수 있고
        fBoardFile.setT(new FreeBoard()); // t 변수에 새로생성된 객체를 넣을 수 있다.하지만 이러면 보드넘버 사용X
        fBoardFile.getT().setfBoardNo(1);
        fBoardFile.getT().setfBoardTitle("test");
        fBoardFile.getT().setfBoardContent("test 입니다. ");

        fBoardFile.setBoardNo(
                fBoardFile.getT().getfBoardNo()
                //자유게시판 넘버를 꺼내서 첨부파일에다가 게시글 번호를 넣어줄 수 있음
        );

        fBoardFile.setType(
                fBoardFile.getT().getClass().getSimpleName().equals("FreeBoard") ? 1: 2
                // 클래스명이 freeboard랑 동일하면 1로 아니면 2로! (삼항연산)
        );

        //이렇게도 가능/ 두가지 방법 중 아무거나 사용해도 무관
        /*
        FreeBoard fboard = new FreeBoard();
        fboard.setfBoardNo(1);
        fboard.setfBoardTitle("test");
        fboard.setfBoardContent("test 입니다. ");
        fBoardFile.setT(fboard);
        */

        //공지사항에 대한 첨부파일
        BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
        nBoardFile.setT(new NoticeBoard());
        nBoardFile.getT().setnBoardNo(2);
        nBoardFile.getT().setnBoardTitle("test2");
        nBoardFile.getT().setnBoardContent("test2 입니다.");

        nBoardFile.setBoardNo(
                nBoardFile.getT().getnBoardNo()
        );

        nBoardFile.setType(
                nBoardFile.getT().getClass().getSimpleName().equals("NoticeBoard") ? 1 : 2
        );






    }
}
