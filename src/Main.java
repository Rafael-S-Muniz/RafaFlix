public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to RafaFlix");
        Movie movie1 = new Movie();
        movie1.name = "Top Gun: Maverick";
        movie1.genre = "Action";
        movie1.releaseYear = 2022;
        movie1.ratingCounts = 0;
        movie1.rate = 0;
        movie1.avaliation(8);
        movie1.avaliation(5.7);
        movie1.avaliation(9.3);

        if (movie1.media() == 0) {
            System.out.println("There is no avaliations yet.");
        }
        movie1.showMovieDescription();

    }
}