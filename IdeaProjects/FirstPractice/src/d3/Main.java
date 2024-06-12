package d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 170);
        Movie lotr = new Movie("Lord of the Rings", 360);
        Movie madMax = new Movie("Mad Max");



        System.out.println(harryPotter);
        System.out.println(lotr);
        System.out.println(madMax);
        System.out.println(harryPotter.IS_GOOD);
        harryPotter.play();
        Movie.displayAlert();


        HorrorMovie scream = new HorrorMovie("Scream", 80, false);
        System.out.println(scream.getTitle() + " " + scream.isReallyScary() );
        scream.play();
    }
}
