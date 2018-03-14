package test;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseTraversers;
import main.Assignment2_2;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Assignment2Test {

    @Test

    public void shouldHaveCorrectIndex() {

        double e = 0.04;

        Assignment2_2 assignment2_2 = new Assignment2_2(e);

        assertEquals(4, assignment2_2.getIndex());

    }

    }
