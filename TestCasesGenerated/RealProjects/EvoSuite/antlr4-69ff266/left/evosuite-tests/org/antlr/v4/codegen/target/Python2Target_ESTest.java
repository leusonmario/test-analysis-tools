/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 17:54:17 GMT 2019
 */

package org.antlr.v4.codegen.target;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.Set;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.v4.codegen.CodeGenerator;
import org.antlr.v4.codegen.target.Python2Target;
import org.antlr.v4.tool.ast.AltAST;
import org.antlr.v4.tool.ast.GrammarAST;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.stringtemplate.v4.STGroup;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Python2Target_ESTest extends Python2Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Python2Target.PythonStringRenderer python2Target_PythonStringRenderer0 = new Python2Target.PythonStringRenderer();
      Locale locale0 = new Locale("", "org.antlr.v4.runtime.InterpreterRuleContext");
      String string0 = python2Target_PythonStringRenderer0.toString((Object) "", "", locale0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      // Undeclared exception!
      try { 
        python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode((GrammarAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.antlr.v4.codegen.target.Python2Target", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      python2Target0.addBadWords();
      Set<String> set0 = python2Target0.getBadWords();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      Set<String> set0 = python2Target0.getBadWords();
      assertEquals(85, set0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      String string0 = python2Target0.getVersion();
      assertEquals("4.5.2.1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CommonToken commonToken0 = (CommonToken)Token.SKIP_TOKEN;
      AltAST altAST0 = new AltAST(commonToken0);
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      boolean boolean0 = python2Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(altAST0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      STGroup sTGroup0 = python2Target0.getTemplates();
      assertFalse(sTGroup0.iterateAcrossValues);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      boolean boolean0 = python2Target0.supportsOverloadedMethods();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      STGroup sTGroup0 = python2Target0.loadTemplates();
      assertFalse(STGroup.trackCreationEvents);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      boolean boolean0 = python2Target0.wantsBaseVisitor();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      boolean boolean0 = python2Target0.wantsBaseListener();
      assertFalse(boolean0);
  }
}
