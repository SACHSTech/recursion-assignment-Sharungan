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
    /**
     * An initial test
     */
    @Test
    public void Test2(){
      assertEquals(1, Recursion.count7(7));
    }
    /**
     * An initial test
     */
    @Test
    public void Test3(){
      assertEquals(0, Recursion.count7(123));
    }
    /**
     * An initial test
     */
    @Test
    public void Test4(){
      assertEquals("rexx",Recursion.endX("xxre"));
    }
    /**
     * An initial test
     */
    @Test
    public void Test5(){
      assertEquals("hixxxx",Recursion.endX("xxhixx"));
    }
    /**
     * An initial test
     */
    @Test
    public void Test6(){
      assertEquals("hihixxx",Recursion.endX("xhixhix"));
  }
}
