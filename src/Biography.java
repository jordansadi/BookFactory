public class Biography implements Book {
    private String description;
    private int pages;

    public Biography() {
        description = "Audacity of Hope";
        pages = 362;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + pages + " pages.");
    }
}