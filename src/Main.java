public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to RafaFlix");
        Movie movie1 = new Movie();
        movie1.name = "Top Gun: Maverick";
        movie1.genre = "Action";
        movie1.releaseYear = 2022;
        movie1.averageRate = (7.2 + 6.9 + 9 + 8.2) / 4;
        movie1.ratingCounts = 4;

        if (movie1.releaseYear < 2022) {
            movie1.includedInPlan = true;
        }


        System.out.println("Movie: " + movie1.name);
        System.out.println("The release of this movie was in: " + movie1.releaseYear);
        System.out.println("Movie rate: " + movie1.averageRate);
        System.out.println("This film is included at the plan?: " + movie1.includedInPlan);

    }
}