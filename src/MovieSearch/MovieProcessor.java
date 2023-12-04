package MovieSearch;
import be7.model.MovieDTO;
import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {

        System.out.println("======== 장르별 영화 검색 프로그램(그룹 이름) ===========");
        System.out.println(""+"1.영화입력(I)"+"\t"+"2.영화출력(P)"+"\t"+"3.영화검색(S)"+"\t"+"4.종료(E)");
        System.out.println("=================================================");

        //String MSearch = "S";
        //String Mend = "E";

        Scanner scan = new Scanner(System.in);
        //loops:
        System.out.print("메뉴입력 : ");
        String MInput = scan.nextLine();

        MovieOperations mop = new MovieOperations();

        //while()
        if (MInput.equalsIgnoreCase("I")) {
            mop.MovieInformation();
        }

        if (MInput.equalsIgnoreCase("P")) {
            mop.MovieInformation();
            mop.MoviePrint();
        }

        if (MInput.equalsIgnoreCase("S")){
            mop.MovieInformation();
            mop.MovieSearch();
        }


        //문자열 비교 equalsIgnoreCase 이거나 equals




    }
}
