package MovieSearch;

import be7.model.MovieDTO;

import java.util.Scanner;

public class MovieProcessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MovieOperations mop = new MovieOperations();

        while (true) {
            System.out.println("======== 장르별 영화 검색 프로그램(그룹 이름) ===========");
            System.out.println("" + "1.영화입력(I)" + "\t" + "2.영화출력(P)" + "\t" + "3.영화검색(S)" + "\t" + "4.종료(E)");
            System.out.println("=================================================");

            System.out.print("메뉴입력 : ");
            String menuInput = scan.nextLine();

            if (menuInput.equals("-1")){
                System.out.println("프로그램 종료");
                break;
            }

            switch (menuInput.toUpperCase()) {
                case "I":
                    mop.movieInformation();
                    break;
                case "P":
                    mop.moviePrint(MovieOperations.movieList);
                    break;
                case "S":
                    mop.movieSearch(MovieOperations.movieList);
                    break;
                case "E":
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    continue;
            }
        }
    }
}
