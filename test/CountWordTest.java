import org.junit.*;

import static org.junit.Assert.*;

public class CountWordTest {


    CountWord fp;

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
        fp=new CountWord();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        fp=null;

        System.out.println("Inside After");

    }
    /*count the number of occurence of given word in n a string*/

    @Test
    public  void  checkcount_GivenCharacter_ReturnCount()
    {


        assertEquals(10,fp.Calculatecount("java again java again java","a"));

    }
    /*count the number of occurence of given word in n a string if that word is not present resturn count as zero*/

    @Test
    public  void  checkcount_GivenCharacter_ReturnZeroCount()
    {


        assertEquals(0,fp.Calculatecount("java again java again java","k"));

    }


}