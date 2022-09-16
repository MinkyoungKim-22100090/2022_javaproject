import java.util.Scanner;

public class WordManager{

    Scanner s= new Scanner(System.in);
    WordCRUD wordCRUD;

    public int selectMenu() {
        System.out.println("""
                *** 영단어 마스터 ***
                ************
                1. 모든 단어 보기
                2. 수준별 단어 보기\s
                3. 단어 검색
                4. 단어 추가
                5. 단어 수정
                6. 단어 삭제
                7. 파일 저장
                0. 나가기
                ************
                => 원하는 메뉴? """);
        //System.out.println();
        return s.nextInt();
    }

    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public void start(){
       wordCRUD.loadFile();
        while (true) {
            int menu=selectMenu();
            if(menu==0) {
                System.out.println("종료되었습니다.");
                break;
            }
            if(menu==1) {//list 보여주기
                wordCRUD.listAll();
            }
            if(menu==2) {//create
                wordCRUD.searchlevel();
            }
            if(menu==3) {//create
                wordCRUD.searchWord();
            }
            if(menu==4) {//create
                wordCRUD.addItem();
            }
            if(menu==5){ //update
                wordCRUD.updateItem();
            }
            if(menu==6) { //delete
                wordCRUD.deleteItem();
            }
            if(menu==7) { //delete
                wordCRUD.saveFile();
            }

        }
    }
}