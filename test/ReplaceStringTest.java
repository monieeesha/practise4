import org.junit.*;

import static org.junit.Assert.*;

public class ReplaceStringTest {

    ReplaceString sp;
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
        sp=new ReplaceString();

        System.out.println("Inside Before");
    }

    @After
    public void tearDown()
    {
        //arrange
        sp=null;

        System.out.println("Inside After");

    }
    /*replace a character d with f and l with t*/
    @Test
    public void replacethechar_Givenastring_ReplaceTwoParticularCharacters()
    {

        assertEquals("faity fry",sp.replace("daily dry"));

    }
    @Test
    public void replacethechar_Givenastring_ReplaceWrongTwoCharacters()
    {


        assertNotEquals("famty fry",sp.replace("daily dry"));
    }

}