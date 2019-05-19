import org.junit.*;

import static org.junit.Assert.*;

public class FindHenryTest {

    FindHenry rp;
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
        rp=new FindHenry();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        rp=null;

        System.out.println("Inside After");

    }

    /*only to search for a string "Harry" if it presennt return a boolean value true*/

    @Test
    public void  replaceHarry_GivenaStringContaingHarry_ReturnBooleanTrue()
    {
        assertEquals("Is Harry here?true",rp.Repacestr("This is Harry"));


    }

    /*only to search for a string "Harry" if it  not presennt return a boolean value false*/

    @Test
    public void  replaceHarry_GivenaStringNotContaingHarry_ReturnBooleanFalse()
    {

        assertEquals("Is Harry here?false",rp.Repacestr("This is Henry"));

    }

}