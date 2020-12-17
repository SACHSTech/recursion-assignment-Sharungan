package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
      // make assertion statement(s)
      // assertEquals(EXPECTEDVALUE, TESTVALUE);
      // assertTrue(TESTBOOLEAN);
      assertEquals(2, Recursion.count7(717));
    }
    public void Test2(){
      assertEquals(1, Recursion.count7(7));
    }
    public void Test3(){
      assertEquals(0, Recursion.count7(123));
    }
    public void Test4(){
      assertEquals("xxre",Recursion.endX("rexx"));
    }
    public void Test5(){
      assertEquals("xxhixx",Recursion.endX("hixxxx"));
    }
    public void Test6(){
      assertEquals("xhixhix",Recursion.endX("hihixxx"));
  }
}
