package courses_Languagues_0;

import ec.edu.epn.courses_Languagues.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith( value= Parameterized.class)
public class List_StudentsParametersTest {
    List_Students lista= null;
    private Student student= null;
    private  String path=null;

    @Before
    public  void setUp(){
        lista= new List_Students();
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{new Student("David","Aulestia",1729425901), "1_List_Students.txt" });
        objects.add(new Object[]{new Student("Santiago","Parker",1730425901), "2_List_Students.txt" });
        objects.add(new Object[]{new Student("Pedro","Osborn",1731425901), "1_List_Students.txt" });
        objects.add(new Object[]{new Student("Juan","Jean",1732425901), "2_List_Students.txt" });
        objects.add(new Object[]{new Student("Ezequiel","Azcazubi",1756425901), "1_List_Students.txt" });
        objects.add(new Object[]{new Student("Nehemias","Pachay",1757425908), "1_List_Students.txt" });
        objects.add(new Object[]{new Student("Nehemias","Pachay",1757425901), "1_List_Students.txt" });
        objects.add(new Object[]{new Student("Nehemias","Pachay",1757425), "2_List_Students.txt" });
        objects.add(new Object[]{new Student("Nehemias","Pachay",17574259), "1_List_Students.txt" });
        return objects;
    }

    public List_StudentsParametersTest(Student student, String path){
        this.student=student;
        this.path=path;
    }

    @Test
    public void given_parameters_when_add_then_ok(){
        assertTrue(lista.add_Student(student,path));

    }




}