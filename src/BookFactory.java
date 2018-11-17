public class BookFactory {
    public Book getBook(BookType bookType) {
        switch (bookType) {
            case FICTION: return new Fiction();
            case BIOGRAPHY: return new Biography();
            case GRAPHICNOVEL: return new GraphicNovel();
            default: return null;
        }
    }
}