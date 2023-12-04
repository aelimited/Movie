package MovieSearch;

import be7.model.MovieDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieOperations {
    static List<MovieDTO> movieList = new ArrayList<>();

    // 영화 정보 입력받기
    public static List<MovieDTO> movieInformation() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("영화제목 (종료하려면 '-1' 입력) : ");
            String title = scan.nextLine();

            if (title.equals("-1")) {
                break;
            }

            System.out.print("주인공 : ");
            String major = scan.nextLine();

            System.out.print("상영시간 : ");
            int runningTime = scan.nextInt();
            scan.nextLine(); // 줄바꿈 위에 nextLine 호출

            System.out.print("평점 : ");
            float rating = scan.nextFloat();
            scan.nextLine(); // 줄바꿈 위에 nextLine 호출

            System.out.print("장르(1-드라마, 2-액션, 3-호러) : ");
            int genre = scan.nextInt();
            scan.nextLine();

            movieList.add(new MovieDTO(title, major, runningTime, rating, genre));
        }
        return movieList;
    }

    // 평점을 기준으로 내림차순 정렬
    public static void moviePrint(List<MovieDTO> movies) {
        for (int i = 0; i < movies.size() - 1; i++) {
            for (int j = i + 1; j < movies.size(); j++) {
                if (movies.get(i).getRating() < movies.get(j).getRating()) {
                    MovieDTO tmp = movies.get(i);
                    movies.set(i, movies.get(j));
                    movies.set(j, tmp);
                }
            }
        }
        System.out.println("========= 영화 정보 : 평점기준 내림차순 =========");
        for (MovieDTO data : movies) {
            System.out.println(data.toString());
        }
    }

    // 장르 검색 메서드
    public static void movieSearch(List<MovieDTO> movies) {
        //dto 내에 있는 장르 값과 비교하여 출력
        System.out.print("검색할 장르를 입력하세요. (1, 2, 3 중 하나) : ");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for (MovieDTO movie : movies) {
            if (movie.getGenre() == i) System.out.println(movie);
        }
    }
}
