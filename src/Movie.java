public class Movie {
    String name;
    String genre;
    int releaseYear;
    boolean includedInPlan;
    double rate;
    double ratingCounts;
    double durationInMinutes;

    void avaliation(double avaliation) {
        rate += avaliation;
        ratingCounts++;
    }

    double media() {
        if (ratingCounts > 0) {
            return rate / ratingCounts;
        } else {
            return 0;
        }
    }

    void showMovieDescription() {
        System.out.println("The movie title is: " + name);
        System.out.println("The movie was released at the year of: " + releaseYear);
        System.out.println("The average rate of the movie is: " + media());
    }


}
