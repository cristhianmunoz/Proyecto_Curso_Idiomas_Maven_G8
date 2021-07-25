package courses_Languagues_0;

import ec.edu.epn.courses_Languagues.*;
import org.junit.*;

import static org.junit.Assert.*;

public class List_StudentsTest {
    List_Students lista= null;
    Student result=null;
    Student expected=null;

    @BeforeClass
    public static void setUpClass(){
    }

    @Before
    public void setUp() {
        lista= new List_Students();
        expected= new Student ("Cristhian", "Munoz", 1707996318);
        lista.add_Student(expected,"1_List_Students.txt");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void given_IDStudent_when_unsubscribe_then_okay() {
        result= lista.unsubscribe_Student("1707996318","1_List_Students.txt");
        assertEquals(expected.getId(), result.getId());

    }

    /*@Test (expected = NullPointerException.class  )
    public void given_IDStudent_when_unsubscribe_then_exception() {
        result= lista.unsubscribe_Student("1707996318","1_List_Students.txt");
        assertEquals(expected.getId(), result.getId());
    }*/

    @Test (timeout = 110)
    public void given_IDStudent_when_unsubscribe_then_timeout() {
        result= lista.unsubscribe_Student("1707996318","1_List_Students.txt");
        assertEquals(expected.getId(), result.getId());

    }

    @Test (timeout= 100)
    public void given_Student_when_add_then_tiemout() {
        lista.add_Student(expected,"1_List_Students.txt");

    }
}