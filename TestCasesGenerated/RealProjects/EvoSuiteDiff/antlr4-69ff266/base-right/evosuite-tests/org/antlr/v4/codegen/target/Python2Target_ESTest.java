/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 17:29:25 GMT 2019
 */

package org.antlr.v4.codegen.target;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Set;
import org.antlr.v4.codegen.CodeGenerator;
import org.antlr.v4.codegen.target.Python2Target;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Python2Target_ESTest extends Python2Target_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Python2Target python2Target0 = new Python2Target((CodeGenerator) null);
      Set<String> set0 = python2Target0.getBadWords();
      assertEquals(85, set0.size()); // (Inspector) Original Value: 85 | Regression Value: 84
  }
}
