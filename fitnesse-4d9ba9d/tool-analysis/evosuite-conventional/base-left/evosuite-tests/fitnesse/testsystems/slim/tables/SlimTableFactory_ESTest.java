/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 18:50:24 GMT 2019
 */

package fitnesse.testsystems.slim.tables;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fitnesse.testsystems.slim.SlimTestContextImpl;
import fitnesse.testsystems.slim.Table;
import fitnesse.testsystems.slim.tables.DecisionTable;
import fitnesse.testsystems.slim.tables.ScriptTable;
import fitnesse.testsystems.slim.tables.SlimTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.testsystems.slim.tables.SubsetQueryTable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactory_ESTest extends SlimTableFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable((Table) null, "H8?-$[j", slimTestContextImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<SubsetQueryTable> class0 = SubsetQueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType((String) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<DecisionTable> class0 = DecisionTable.class;
      slimTableFactory0.addTableType("u%*m]lE*,", class0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<ScriptTable> class0 = ScriptTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType("ordered query:", class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // A table type named 'ordered query:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Map<String, Class<? extends SlimTable>> map0 = slimTableFactory0.getTableTypes();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      assertNotSame(slimTableFactory0, slimTableFactory1);
  }
}
