/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 08 20:56:47 GMT 2019
 */

package com.zaxxer.hikari.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConcurrentBag_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.zaxxer.hikari.util.ConcurrentBag"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConcurrentBag_ESTest_scaffolding.class.getClassLoader() ,
      "com.codahale.metrics.MetricRegistry$MetricBuilder",
      "shaded.org.apache.commons.io.filefilter.WildcardFileFilter",
      "shaded.org.apache.commons.io.filefilter.FalseFileFilter",
      "com.codahale.metrics.MetricRegistryListener",
      "com.zaxxer.hikari.pool.PoolBase$NopMetricsTrackerDelegate",
      "aQute.lib.env.Selector$Filter",
      "com.codahale.metrics.MetricSet",
      "com.codahale.metrics.CachedGauge",
      "com.codahale.metrics.Reservoir",
      "com.codahale.metrics.DerivativeGauge",
      "shaded.org.apache.commons.io.filefilter.AndFileFilter",
      "com.zaxxer.hikari.util.ConcurrentBag$1",
      "com.zaxxer.hikari.pool.HikariPool$5",
      "com.zaxxer.hikari.util.QueuedSequenceSynchronizer",
      "com.codahale.metrics.WeightedSnapshot",
      "com.codahale.metrics.WeightedSnapshot$WeightedSample",
      "com.codahale.metrics.MetricFilter",
      "com.codahale.metrics.InstrumentedExecutorService$InstrumentedCallable",
      "com.zaxxer.hikari.pool.HikariProxyConnection",
      "shaded.org.apache.commons.io.filefilter.DirectoryFileFilter",
      "shaded.org.apache.commons.io.filefilter.AgeFileFilter",
      "com.codahale.metrics.Metric",
      "com.codahale.metrics.RatioGauge",
      "shaded.org.apache.commons.io.filefilter.SizeFileFilter",
      "com.codahale.metrics.Striped64",
      "com.zaxxer.hikari.HikariDataSource",
      "shaded.org.apache.commons.io.filefilter.CanWriteFileFilter",
      "com.codahale.metrics.Sampling",
      "com.codahale.metrics.Timer",
      "com.codahale.metrics.Clock$CpuTimeClock",
      "shaded.org.apache.commons.io.IOCase",
      "shaded.org.apache.commons.io.filefilter.CanReadFileFilter",
      "com.zaxxer.hikari.pool.HikariPool",
      "com.zaxxer.hikari.HikariConfigMXBean",
      "com.codahale.metrics.MetricRegistryListener$Base",
      "aQute.bnd.osgi.Instruction$Filter",
      "com.zaxxer.hikari.pool.HikariPool$PoolInitializationException",
      "com.codahale.metrics.JvmAttributeGaugeSet",
      "com.codahale.metrics.LongAdder",
      "com.codahale.metrics.JmxAttributeGauge",
      "com.zaxxer.hikari.metrics.PoolStats",
      "com.codahale.metrics.UniformReservoir",
      "com.zaxxer.hikari.util.ClockSource",
      "shaded.org.apache.commons.io.filefilter.FileFileFilter",
      "com.zaxxer.hikari.metrics.dropwizard.CodahaleMetricsTrackerFactory",
      "com.codahale.metrics.MetricRegistry",
      "com.zaxxer.hikari.pool.PoolBase",
      "shaded.org.apache.commons.io.filefilter.AbstractFileFilter",
      "com.zaxxer.hikari.pool.PoolEntry",
      "shaded.org.apache.commons.io.filefilter.WildcardFilter",
      "com.codahale.metrics.UniformSnapshot",
      "shaded.org.apache.commons.io.filefilter.EmptyFileFilter",
      "com.zaxxer.hikari.util.FastList",
      "com.codahale.metrics.Timer$1",
      "com.codahale.metrics.Counting",
      "com.codahale.metrics.Clock$UserTimeClock",
      "com.zaxxer.hikari.metrics.dropwizard.CodaHaleMetricsTracker",
      "shaded.org.apache.commons.io.filefilter.SuffixFileFilter",
      "com.codahale.metrics.Counter",
      "com.codahale.metrics.Metered",
      "com.zaxxer.hikari.util.ConcurrentBag",
      "shaded.org.codehaus.plexus.util.cli.CommandLineCallable",
      "shaded.org.apache.http.impl.client.HttpRequestTaskCallable",
      "com.codahale.metrics.EWMA",
      "com.zaxxer.hikari.pool.ProxyLeakTask",
      "com.zaxxer.hikari.util.ConcurrentBag$IBagStateListener",
      "com.zaxxer.hikari.metrics.MetricsTrackerFactory",
      "shaded.org.apache.commons.io.filefilter.NotFileFilter",
      "aQute.lib.env.Selector",
      "com.codahale.metrics.Snapshot",
      "shaded.org.apache.commons.io.filefilter.HiddenFileFilter",
      "shaded.org.apache.commons.io.filefilter.NameFileFilter",
      "com.codahale.metrics.Gauge",
      "com.codahale.metrics.SlidingTimeWindowReservoir",
      "com.codahale.metrics.InstrumentedScheduledExecutorService$InstrumentedCallable",
      "com.codahale.metrics.Histogram",
      "com.codahale.metrics.InstrumentedThreadFactory",
      "com.zaxxer.hikari.pool.PoolBase$MetricsTrackerDelegate",
      "shaded.org.apache.commons.io.filefilter.ConditionalFileFilter",
      "com.zaxxer.hikari.util.ConcurrentBag$IConcurrentBagEntry",
      "com.codahale.metrics.Meter",
      "shaded.org.apache.commons.io.filefilter.DelegateFileFilter",
      "com.codahale.metrics.SlidingWindowReservoir",
      "com.zaxxer.hikari.util.SuspendResumeLock",
      "shaded.org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "com.codahale.metrics.Timer$Context",
      "shaded.org.apache.commons.io.filefilter.RegexFileFilter",
      "com.codahale.metrics.Clock",
      "aQute.bnd.osgi.Instruction",
      "com.codahale.metrics.ScheduledReporter$NamedThreadFactory",
      "com.zaxxer.hikari.metrics.MetricsTracker",
      "com.zaxxer.hikari.pool.ProxyConnection",
      "com.codahale.metrics.ExponentiallyDecayingReservoir",
      "com.zaxxer.hikari.HikariConfig",
      "shaded.org.apache.commons.io.filefilter.IOFileFilter",
      "shaded.org.apache.commons.io.filefilter.PrefixFileFilter",
      "shaded.org.apache.commons.io.filefilter.TrueFileFilter",
      "shaded.org.apache.commons.io.filefilter.OrFileFilter",
      "com.zaxxer.hikari.HikariPoolMXBean",
      "com.codahale.metrics.JmxReporter$JmxListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConcurrentBag_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.zaxxer.hikari.util.ConcurrentBag",
      "com.zaxxer.hikari.util.ConcurrentBag$1"
    );
  }
}
