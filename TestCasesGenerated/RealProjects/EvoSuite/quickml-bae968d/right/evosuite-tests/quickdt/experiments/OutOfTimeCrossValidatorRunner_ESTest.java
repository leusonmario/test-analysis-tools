/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 20:25:53 GMT 2019
 */

package quickdt.experiments;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import quickdt.experiments.OutOfTimeCrossValidatorRunner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OutOfTimeCrossValidatorRunner_ESTest extends OutOfTimeCrossValidatorRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      OutOfTimeCrossValidatorRunner.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OutOfTimeCrossValidatorRunner outOfTimeCrossValidatorRunner0 = new OutOfTimeCrossValidatorRunner();
  }
}
