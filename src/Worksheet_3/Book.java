package Worksheet_3;

/**
 *
 * Create a class for books. Books have authors and titles.
 * The class should implement getters for both author name and title,
 * but these must be set at construction time and never be modified afterwards.
 * (Reminder: An object whose fields cannot be changed after construction is called an immutable object.)
 *
 */
public class Book {

    private String authorName;
    private String title;

    /**
     *
     * @param authorNamem
     * @param title
     */
    Book (String authorNamem, String title){
        this.authorName = authorNamem;
        this.title = title;
    }

    public String getAuthorName(){
        return authorName;
    }

    public String getTitle(){
        return title;
    }


}
