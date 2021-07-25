package courses_Languagues_0;

import ec.edu.epn.courses_Languagues.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class I_ListTeacherTest {

    @Test
    public void given_two_String_when_editedFileTxt_then_ok() {
        I_ListTeacher lt = Mockito.mock(I_ListTeacher.class);
        Mockito.when(lt.editedFileTxt("ListaProfesores.txt","Cachipuendo Catucuamba")).thenReturn(true);
        assertEquals(true,lt.editedFileTxt("ListaProfesores.txt","Cachipuendo Catucuamba"));
    }
}