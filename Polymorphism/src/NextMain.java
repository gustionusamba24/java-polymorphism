public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Movie.Adventure jaws = Movie.getMovie("A", "Jaws").new Adventure("Jaws");
        jaws.watchMovie();

        Movie.Comedy airplane = (Movie.Comedy) Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        Object comedy = Movie.getMovie("C", "Warkop DKI");
        Movie.Comedy comedyMovie = (Movie.Comedy) comedy;
        comedyMovie.watchComedy();

        var mrbean = Movie.getMovie("C", "Mr. Bean");
        mrbean.watchMovie();
    }
}
