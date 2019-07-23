/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 22 20:38:55 GMT 2019
 */

package quickdt.experiments;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OutOfTimeCrossValidatorRunner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "quickdt.experiments.OutOfTimeCrossValidatorRunner"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OutOfTimeCrossValidatorRunner_ESTest_scaffolding.class.getClassLoader() ,
      "quickdt.predictiveModels.decisionTree.tree.Branch",
      "quickdt.crossValidation.OutOfTimeCrossValidator",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "quickdt.predictiveModels.calibratedPredictiveModel.CalibratedPredictiveModel",
      "quickdt.crossValidation.WeightedAUCCrossValLoss$AUCData",
      "quickdt.predictiveModels.decisionTree.tree.Leaf",
      "com.google.common.collect.Collections2",
      "quickdt.crossValidation.DateTimeExtractor",
      "quickdt.predictiveModels.featureEngineering.AttributesEnricher",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer$CrossValidationCorrection",
      "quickdt.predictiveModels.randomForest.RandomForest",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "quickdt.predictiveModels.calibratedPredictiveModel.PAVCalibrator",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "quickdt.crossValidation.StationaryCrossValidator$DataSplit",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy",
      "quickdt.crossValidation.CrossValLoss",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "com.google.common.collect.SortedMapDifference",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "com.thoughtworks.xstream.persistence.PersistenceStrategy",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "com.google.common.base.Predicate",
      "quickdt.predictiveModels.decisionTree.TreeBuilder",
      "quickdt.data.HashMapAttributes",
      "com.google.common.base.Joiner",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "quickdt.crossValidation.StationaryCrossValidator",
      "quickdt.predictiveModels.PredictiveModel",
      "quickdt.predictiveModels.downsamplingPredictiveModel.DownsamplingPredictiveModel",
      "quickdt.predictiveModels.featureEngineering.FeatureEngineeredPredictiveModel",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "quickdt.experiments.TrainingDataGenerator2",
      "quickdt.data.AbstractInstance",
      "quickdt.predictiveModels.calibratedPredictiveModel.Calibrator",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "quickdt.predictiveModels.randomForest.RandomForestBuilder",
      "com.google.common.base.Joiner$MapJoiner",
      "quickdt.crossValidation.NonWeightedAUCCrossValLoss",
      "com.google.common.collect.MapDifference",
      "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy$XmlMapEntriesIterator",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "quickdt.predictiveModels.decisionTree.tree.UpdatableLeaf",
      "quickdt.predictiveModels.calibratedPredictiveModel.PAVCalibrator$Observation",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "quickdt.predictiveModels.UpdatablePredictiveModelBuilder",
      "com.google.common.base.Joiner$1",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "com.google.common.base.Joiner$2",
      "quickdt.predictiveModels.PredictiveModelWithDataBuilder",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "quickdt.crossValidation.CrossValidator",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "quickdt.crossValidation.MSECrossValLoss",
      "com.google.common.collect.BiMap",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "com.google.common.collect.Maps$1",
      "quickdt.crossValidation.WeightedAUCCrossValLoss$AUCPoint",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "quickdt.data.Instance",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "quickdt.predictiveModels.PredictiveModelBuilder",
      "quickdt.data.Attributes",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "quickdt.predictiveModels.decisionTree.Tree",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "com.google.common.collect.Lists$1",
      "quickdt.predictiveModels.splitOnAttributePredictiveModel.SplitOnAttributePM",
      "quickdt.experiments.OutOfTimeCrossValidatorRunner",
      "org.apache.commons.io.IOCase",
      "com.google.common.collect.Multiset",
      "quickdt.crossValidation.WeightedAUCCrossValLoss",
      "quickdt.crossValidation.OnlineCrossValLoss",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "com.google.common.collect.ImmutableList",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "com.google.common.collect.Maps",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "quickdt.predictiveModels.decisionTree.Scorer",
      "com.google.common.collect.Maps$EntryTransformer",
      "quickdt.predictiveModels.decisionTree.tree.Node",
      "com.thoughtworks.xstream.persistence.AbstractFilePersistenceStrategy$ValidFilenameFilter",
      "quickdt.crossValidation.RMSECrossValLoss",
      "quickdt.crossValidation.LogCrossValLoss",
      "org.apache.commons.io.filefilter.CanWriteFileFilter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OutOfTimeCrossValidatorRunner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "quickdt.experiments.OutOfTimeCrossValidatorRunner",
      "quickdt.predictiveModels.decisionTree.TreeBuilder",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer$CrossValidationCorrection",
      "quickdt.predictiveModels.randomForest.RandomForestBuilder",
      "quickdt.experiments.TrainingDataGenerator2",
      "com.google.common.collect.Lists",
      "quickdt.data.HashMapAttributes",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "quickdt.data.AbstractInstance",
      "quickdt.data.Instance"
    );
  }
}
