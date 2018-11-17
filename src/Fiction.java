public class Fiction implements Book {
    private String description;
    private int pages;

    public Fiction() {
        description = "Lord of the Rings";
        pages = 1008;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + pages + " pages.");
    }
}