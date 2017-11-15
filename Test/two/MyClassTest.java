package two;

import org.junit.*;

import static org.junit.Assert.*;

public class MyClassTest {
    private MyClass mc;

    @Before
    public void setUp(){
        mc = new MyClass();
        System.err.println("Before");
    }

    @After
    public void tearDown(){
        mc = null;
        System.err.println("After");
    }

    @BeforeClass
    public static void init(){
        System.err.println("Before tests");
    }

    @AfterClass
    public static void finish(){
        System.err.println("After tests");
    }

    @Test
    public void concatenate() throws Exception {
        System.err.println("tests 1");
        assertEquals(mc.concatenate("q","q"), "qq");
    }
    @Test
    public void conatenateFails() throws Exception {
        System.err.println("tests 2");
        assertNotEquals(mc.concatenate("q","q"), "qqq");

    }
}