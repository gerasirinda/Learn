package test;

import main.Assignment2;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class Assignment2Test {
//@Before
//public void setup(){
//    double e=0.25;
//}
    @Test
    public void shouldHaveCorrectIndex(){
        double e=0.25;
        Assignment2 assignment2 = new Assignment2(e);
       assertEquals(2,assignment2.getIndex());
    }
@Test
    public void shouldHaveCorrectSequenceLength(){
        double e=0.025;
    Assignment2 assignment2 = new Assignment2(e);
    assertEquals(6,assignment2.getItemCount());
}
}
