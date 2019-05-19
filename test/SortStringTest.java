import org.junit.*;

import static org.junit.Assert.*;

public class SortStringTest {

     SortString tp;
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
        tp=new SortString();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        tp=null;

        System.out.println("Inside After");

    }

    /*Returns a array of string in a alphabetically sorted order*/
    @Test
    public void  sort_GivenString_SortEachWordInaString()
    {

        assertArrayEquals(new String[]{ "better","food", "good", "life"}, tp.Extract("good food better life"));
    }

    /*return a Empty array of string when no string is passed*/
    @Test
    public void  sort_GivenEmptyString_ReturnEmptyString()
    {

        assertArrayEquals(new String[]{}, tp.Extract(""));
    }





}