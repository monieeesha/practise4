import org.junit.*;

import static org.junit.Assert.*;

public class FindStringTest {


    FindString tp;
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
        tp=new FindString();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        tp=null;

        System.out.println("Inside After");

    }

    /* Find a particular string and return the start and End index of that word*/
    @Test
    public void  sort_Givenastring_returnStartendIndex()
    {

        assertArrayEquals(new String[]{ "found at:4-6","found at:10-12","found at:27-29"}, tp.MatchString("She sells seashells by the seashore","se"));
    }
    @Test
    public void  sort1_Givenastring_returnStartendIndex()
    {

        assertArrayEquals(new String[]{}, tp.MatchString("file is a file good file is ","f0"));
    }

}