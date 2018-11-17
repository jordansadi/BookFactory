public class GraphicNovel implements Book {
    private String description;
    private int pages;

    public GraphicNovel() {
        description = "The Adventure Zone: Here There be Gerblins";
        pages = 256;
    }

    @Override
    public void displayBook() {
        System.out.println(description + " is " + pages + " pages.");
    }
}