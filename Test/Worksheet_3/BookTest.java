package Worksheet_3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book bk;
    private final static String author = "author";
    private final static String title = "title";

    @Before
    public void setUp() throws Exception {
        bk = new Book("author", "title");
    }

    @Test
    public void getAuthorName() throws Exception {
        assertEquals(bk.getAuthorName(), author);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(bk.getTitle(), title);
    }


}