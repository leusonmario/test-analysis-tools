/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 01 18:57:48 GMT 2019
 */

package fitnesse.testsystems.slim.tables;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fitnesse.testsystems.slim.HtmlTable;
import fitnesse.testsystems.slim.SlimTestContext;
import fitnesse.testsystems.slim.SlimTestContextImpl;
import fitnesse.testsystems.slim.Table;
import fitnesse.testsystems.slim.tables.ImportTable;
import fitnesse.testsystems.slim.tables.OrderedQueryTable;
import fitnesse.testsystems.slim.tables.SlimTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.testsystems.slim.tables.SubsetQueryTable;
import java.util.Locale;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.htmlparser.lexer.Lexer;
import org.htmlparser.scanners.ScriptScanner;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactory_ESTest extends SlimTableFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable((Table) null, "", (SlimTestContext) null);
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
      TableTag tableTag0 = new TableTag();
      ScriptScanner scriptScanner0 = new ScriptScanner();
      Lexer lexer0 = new Lexer("JScript.Encode");
      Locale locale0 = Locale.PRC;
      NodeList nodeList0 = tableTag0.searchFor("", true, locale0);
      scriptScanner0.scan(tableTag0, lexer0, nodeList0);
      HtmlTable htmlTable0 = new HtmlTable(tableTag0);
      SlimTestContextImpl slimTestContextImpl0 = new SlimTestContextImpl();
      // Undeclared exception!
      try { 
        slimTableFactory0.makeSlimTable(htmlTable0, (String) null, slimTestContextImpl0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      slimTableFactory0.addTableType("sh.exe", class0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Class<ImportTable> class0 = ImportTable.class;
      // Undeclared exception!
      try { 
        slimTableFactory0.addTableType("query:", class0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // A table type named 'query:' already exists
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      Map<String, Class<? extends SlimTable>> map0 = slimTableFactory0.getTableTypes();
      assertEquals(11, map0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      SlimTableFactory slimTableFactory1 = slimTableFactory0.copy();
      assertNotSame(slimTableFactory1, slimTableFactory0);
  }
}
