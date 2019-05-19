import org.junit.*;

import static org.junit.Assert.*;

public class ReverseStringTest {


    ReverseString fp;
    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        fp=new ReverseString();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        fp=null;

        System.out.println("Inside After");

    }
    /*reverse Each word in a string*/
    @Test
    public void  reverse_Givenastring_ReverseEachWord()
    {

       assertEquals("a kciuq nworb xof spmuj revo eht yzal god",fp.Reversethestring("a quick brown fox jumps over the lazy dog"));

    }
    @Test
    public void reverse_Givenastring_NotReverseEachWord()
    {


        assertNotEquals("i ma ahsinom morf mbi fsd batch",fp.Reversethestring("i am monisha from ibm fsd batch"));

    }

}