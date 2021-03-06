package lib2017.model;

import java.io.Serializable;

public class MyBook implements Serializable {

    private BookId id;

    public MyBook() {
    }
    private String title;
    private String author;

    public MyBook(int id, String author, String title) {
        this.id = new BookId(id);
        this.title = title;
        this.author = author;
    }

    public BookId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    /**
     * @param id the id to set
     */
    public void setId(BookId id) {
        this.id = id;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

}
