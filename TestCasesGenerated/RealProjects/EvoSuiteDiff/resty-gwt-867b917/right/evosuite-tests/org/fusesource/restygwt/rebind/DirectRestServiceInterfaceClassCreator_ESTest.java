/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 22 15:14:18 GMT 2019
 */

package org.fusesource.restygwt.rebind;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.xml.transform.ErrorListener;
import org.apache.xalan.templates.StylesheetRoot;
import org.apache.xalan.transformer.TransformerImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirectRestServiceInterfaceClassCreator_ESTest extends DirectRestServiceInterfaceClassCreator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StylesheetRoot stylesheetRoot0 = new StylesheetRoot((ErrorListener) null);
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.ClassCastException : org.apache.xml.dtm.ref.DTMManagerDefault cannot be cast to org.apache.xml.dtm.DTMManager
      TransformerImpl transformerImpl0 = new TransformerImpl(stylesheetRoot0);
  }
}
