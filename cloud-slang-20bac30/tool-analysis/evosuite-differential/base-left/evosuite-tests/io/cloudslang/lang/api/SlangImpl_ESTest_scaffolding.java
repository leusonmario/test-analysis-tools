/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 08 17:33:47 GMT 2019
 */

package io.cloudslang.lang.api;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SlangImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.cloudslang.lang.api.SlangImpl"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
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
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/home/paulo/Documentos/PHD/Testes2.0/test-analysis-tools/TestCasesGenerated/RealProjects/EvoSuiteDiff/cloudslang-20bac30"); 
    java.lang.System.setProperty("user.home", "/home/paulo"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "paulo"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SlangImpl_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.io.LineIterator",
      "io.cloudslang.lang.compiler.SlangCompiler",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderTokenizer",
      "io.cloudslang.lang.runtime.env.ReturnValues",
      "org.springframework.beans.factory.annotation.Autowired",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.python.google.common.io.PatternFilenameFilter",
      "org.apache.commons.lang3.tuple.Pair",
      "org.apache.commons.lang3.builder.IDKey",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.apache.log4j.Level",
      "org.apache.commons.lang3.builder.HashCodeBuilder",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "io.cloudslang.score.api.TriggeringProperties",
      "org.apache.commons.io.output.ByteArrayOutputStream",
      "ch.lambdaj.function.closure.ClosureResult",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "org.apache.log4j.spi.Filter",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "org.apache.commons.io.IOUtils",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "org.apache.log4j.CategoryKey",
      "io.cloudslang.score.api.ExecutionPlan",
      "org.apache.log4j.Layout",
      "ch.lambdaj.group.GroupItem",
      "io.cloudslang.lang.compiler.SlangSource",
      "org.apache.commons.lang.Validate",
      "ch.lambdaj.util.NotUniqueItemException",
      "ch.lambdaj.function.matcher.HasArgumentWithValue$BooleanMatcher",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.hamcrest.core.IsNot",
      "ch.lambdaj.group.GroupCondition",
      "io.cloudslang.score.events.EventBus",
      "io.cloudslang.lang.entities.CompilationArtifact",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "ch.lambdaj.function.matcher.AndMatcher",
      "org.apache.log4j.Hierarchy",
      "org.hamcrest.BaseMatcher",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "org.apache.commons.io.output.StringBuilderWriter",
      "ch.lambdaj.function.matcher.HasArgumentWithValue",
      "io.cloudslang.lang.compiler.modeller.model.Executable",
      "ch.lambdaj.function.closure.InvokableConstructor",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderReader",
      "org.apache.commons.lang3.builder.EqualsBuilder",
      "org.apache.commons.io.Charsets",
      "ch.lambdaj.Lambda",
      "org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.RootLogger",
      "io.cloudslang.score.api.Score",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.commons.io.FileUtils",
      "ch.lambdaj.function.closure.InvokableMethod",
      "org.apache.log4j.spi.RendererSupport",
      "ch.lambdaj.function.closure.DelayedClosure",
      "io.cloudslang.lang.entities.bindings.InOutParam",
      "org.apache.commons.lang3.Validate",
      "org.apache.commons.lang.builder.EqualsBuilder",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "org.hamcrest.Matcher",
      "org.apache.commons.io.output.NullOutputStream",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.commons.lang3.exception.CloneFailedException",
      "org.apache.log4j.helpers.OptionConverter",
      "io.cloudslang.score.api.ControlActionMetadata",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.hamcrest.core.IsNull",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "ch.lambdaj.function.aggregate.PairAggregator",
      "org.python.core.packagecache.PathPackageManager$PackageExistsFileFilter",
      "org.apache.log4j.or.ObjectRenderer",
      "ch.lambdaj.function.aggregate.Aggregator",
      "io.cloudslang.lang.runtime.env.Context",
      "org.apache.log4j.Logger",
      "ch.lambdaj.function.aggregate.Sum",
      "ch.lambdaj.function.aggregate.Chooser",
      "ch.lambdaj.function.closure.WrongClosureInvocationException",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "ch.lambdaj.function.closure.Closure",
      "io.cloudslang.score.events.ScoreEventListener",
      "io.cloudslang.score.events.ScoreEvent",
      "io.cloudslang.lang.api.SlangImpl",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "ch.lambdaj.function.convert.Converter",
      "ch.lambdaj.function.argument.Argument",
      "io.cloudslang.lang.runtime.env.ParentFlowData",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "ch.lambdaj.function.matcher.OrMatcher",
      "io.cloudslang.lang.entities.bindings.Input",
      "ch.lambdaj.function.aggregate.Min",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "ch.lambdaj.group.ArgumentGroupCondition",
      "io.cloudslang.lang.runtime.env.ExecutionPath",
      "org.apache.commons.io.FileExistsException",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "org.apache.log4j.spi.Configurator",
      "org.apache.log4j.or.DefaultRenderer",
      "org.hamcrest.SelfDescribing",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "org.apache.commons.io.FilenameUtils",
      "org.apache.commons.lang3.text.StrBuilder",
      "ch.lambdaj.function.aggregate.Max",
      "ch.lambdaj.function.closure.AbstractClosure",
      "org.apache.log4j.spi.LocationInfo",
      "org.apache.commons.lang3.text.StrTokenizer",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "org.apache.commons.io.IOCase",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "ch.lambdaj.function.aggregate.Concat",
      "org.apache.commons.lang.builder.HashCodeBuilder",
      "org.apache.log4j.PropertyConfigurator",
      "io.cloudslang.score.api.ExecutionStep",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.log4j.spi.ThrowableRenderer",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "org.apache.commons.lang3.text.StrMatcher",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "org.apache.log4j.Appender",
      "ch.lambdaj.function.closure.Invokable",
      "org.apache.commons.lang3.ObjectUtils",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.hamcrest.Description",
      "org.apache.log4j.spi.HierarchyEventListener",
      "org.apache.commons.io.input.ClosedInputStream",
      "io.cloudslang.lang.runtime.env.ContextStack",
      "io.cloudslang.lang.runtime.env.ParentFlowStack",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.hamcrest.Matchers",
      "org.apache.log4j.spi.LoggingEvent",
      "ch.lambdaj.group.Group",
      "org.apache.commons.lang3.tuple.ImmutablePair",
      "ch.lambdaj.function.matcher.LambdaJMatcher",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.log4j.Priority",
      "io.cloudslang.lang.api.Slang",
      "ch.lambdaj.function.aggregate.InitializedPairAggregator",
      "org.apache.commons.lang3.builder.Builder",
      "ch.lambdaj.function.closure.Closure1",
      "ch.lambdaj.function.closure.Closure0",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "ch.lambdaj.function.closure.Closure4",
      "org.apache.commons.io.filefilter.CanWriteFileFilter",
      "io.cloudslang.lang.runtime.env.RunEnvironment",
      "ch.lambdaj.function.closure.Closure3",
      "ch.lambdaj.function.closure.Closure2"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("io.cloudslang.lang.compiler.SlangCompiler", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.cloudslang.score.api.Score", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.cloudslang.score.events.EventBus", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("io.cloudslang.score.events.ScoreEventListener", false, SlangImpl_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SlangImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "io.cloudslang.lang.api.SlangImpl",
      "org.apache.commons.lang.Validate",
      "io.cloudslang.score.api.ExecutionPlan",
      "io.cloudslang.score.api.TriggeringProperties",
      "io.cloudslang.lang.entities.CompilationArtifact",
      "io.cloudslang.lang.runtime.env.RunEnvironment",
      "io.cloudslang.lang.runtime.env.ContextStack",
      "io.cloudslang.lang.runtime.env.ParentFlowStack",
      "io.cloudslang.lang.runtime.env.ExecutionPath",
      "io.cloudslang.lang.compiler.SlangSource",
      "io.cloudslang.score.api.ExecutionStep",
      "org.apache.commons.lang3.Validate",
      "org.hamcrest.Matchers",
      "org.hamcrest.BaseMatcher",
      "org.hamcrest.core.IsNull",
      "org.hamcrest.core.IsNot",
      "ch.lambdaj.function.aggregate.PairAggregator",
      "ch.lambdaj.function.aggregate.InitializedPairAggregator",
      "ch.lambdaj.function.aggregate.Sum",
      "ch.lambdaj.function.aggregate.Chooser",
      "ch.lambdaj.function.aggregate.Min",
      "ch.lambdaj.function.aggregate.Max",
      "ch.lambdaj.function.aggregate.Concat",
      "ch.lambdaj.Lambda",
      "org.apache.commons.lang3.builder.HashCodeBuilder",
      "org.apache.commons.io.FileUtils",
      "org.apache.commons.io.output.StringBuilderWriter",
      "org.apache.commons.io.IOUtils",
      "org.apache.commons.lang3.builder.EqualsBuilder",
      "org.apache.commons.io.Charsets",
      "org.apache.commons.lang.builder.EqualsBuilder",
      "io.cloudslang.score.api.ControlActionMetadata",
      "io.cloudslang.lang.entities.bindings.InOutParam",
      "io.cloudslang.lang.entities.bindings.Input",
      "org.apache.commons.lang3.builder.IDKey",
      "org.apache.commons.lang3.tuple.Pair",
      "org.apache.commons.lang3.tuple.ImmutablePair",
      "org.apache.commons.lang3.ArrayUtils",
      "org.apache.commons.lang3.ObjectUtils$Null",
      "org.apache.commons.lang3.ObjectUtils",
      "org.apache.commons.lang.builder.HashCodeBuilder"
    );
  }
}
