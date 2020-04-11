
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
    private Student georgie;

    @Before
    public void setUp(){
        georgie = new Student("georgie",1234567);
    }

    @Test
    public void TestIfStudentCanBeCreated(){
        assertNotNull(georgie);
    }

    @Test
    public void TestIfStudentHasAName(){
        assertNotNull("georgie",georgie.getName());
    }

    @Test
    public void TestIfStudentHasAnID(){
        assertEquals(1234567,georgie.getID());
    }

    @Test
    public void TestIfStudentHasGrades(){
        assertNotNull(georgie.getGrades());
    }

    @Test
    public void TestIfGradesCanBeAdded(){
        georgie.addGrade(100);
        assertEquals("[100]",georgie.getGrades().toString());
    }

    public void TestIfGradesAreAveraged(){
        georgie.addGrade(96);
        georgie.addGrade(75);
        assertEquals("90.33",Double.toString(georgie.getAverage()));
    }
}
