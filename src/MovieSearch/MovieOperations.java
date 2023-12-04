package MovieSearch;
import be7.model.BookDTO;
import be7.model.MovieDTO;
import java.util.Scanner;

public class MovieOperations {
    static MovieDTO[] moviedto = new MovieDTO[3];

    public static void MovieInformation(){
        // 아무 주석이나 달아봅니다.
        Scanner scan = new Scanner(System.in);
        //MovieDTO를 입력받아 배열로 출력
        for(int i=0; i<moviedto.length; i++) {
          //  if (MInput.equalsIgnoreCase("-1")) break;
            System.out.print("영화제목 : ");
            String title = scan.nextLine();
            if (title.equalsIgnoreCase("-1")) break;

            System.out.print("주인공 : ");
            String major = scan.nextLine();
            if (major.equalsIgnoreCase("-1")) break;

            System.out.print("상영시간 : ");
            int runningTime = scan.nextInt();

            System.out.print("평점 : ");
            float rating = scan.nextFloat();

            System.out.print("장르(1-드라마, 2-액션, 3-호러) : ");
            int genre = scan.nextInt();

            scan.nextLine();
            moviedto[i] = new MovieDTO(title,major,runningTime,rating,genre);
        }
        System.out.println("========= 영화 정보 내용 ==========");
        for(int i=0; i<moviedto.length; i++) {
            System.out.println(moviedto[i].toString());
        }
    }

    // 평점을 기준으로 내림차순 정렬
    public static void MoviePrint(){
      //  moviedto[0] = new MovieDTO("기생충","김기택",123,2.6F,1);
      //  moviedto[1] = new MovieDTO("올드보이","오대수",120,3.3F,2);
      //  moviedto[2] = new MovieDTO("괴물","박강두",113,7.6F,3);

        for(int i=0;i<moviedto.length;i++){
            for(int j=i+1;j<moviedto.length;j++){
                if(moviedto[i].getRating()<moviedto[j].getRating()){
                   MovieDTO tmp = moviedto[i];
                    moviedto[i] = moviedto[j];
                    moviedto[j] = tmp;
                }
            }
        }
        System.out.println("========= 영화 평점기준 내림차순 =========");
        for (MovieDTO data : moviedto) {
            System.out.println(data);
        }
    }

    public static void MovieSearch(){
        //dto 내에 있는 장르 값과 비교하여 출력
        Scanner scan =new Scanner(System.in);
        int i=scan.nextInt();
        System.out.println(i);
        //moviedto.getgener();
    }
}