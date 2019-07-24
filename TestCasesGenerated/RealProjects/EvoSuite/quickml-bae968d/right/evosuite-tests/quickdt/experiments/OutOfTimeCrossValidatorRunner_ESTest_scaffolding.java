/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 24 20:25:53 GMT 2019
 */

package quickdt.experiments;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OutOfTimeCrossValidatorRunner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

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
    java.lang.System.setProperty("user.dir", "/home/paulo/Documentos/PHD/Testes2.0/test-analysis-tools/TestCasesGenerated/RealProjects/EvoSuite/quickml-bae968d/right"); 
    java.lang.System.setProperty("user.home", "/home/paulo"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "paulo"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OutOfTimeCrossValidatorRunner_ESTest_scaffolding.class.getClassLoader() ,
      "quickdt.predictiveModels.decisionTree.tree.Branch",
      "quickdt.crossValidation.OutOfTimeCrossValidator",
      "org.joda.time.DateTimeZone",
      "org.joda.time.tz.DateTimeZoneBuilder$RuleSet",
      "com.google.common.collect.ImmutableMultimap$Itr",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "quickdt.predictiveModels.decisionTree.tree.Leaf",
      "quickdt.crossValidation.DateTimeExtractor",
      "org.joda.time.tz.DateTimeZoneBuilder$Transition",
      "org.joda.time.field.AbstractPartialFieldProperty",
      "quickdt.crossValidation.StationaryCrossValidator$DataSplit",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.ImmutableMultimap$Values",
      "org.javatuples.Septet",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology$YearInfo",
      "org.joda.time.LocalDate$Property",
      "org.joda.time.field.UnsupportedDurationField",
      "com.google.common.collect.ByFunctionOrdering",
      "org.javatuples.Pair",
      "org.joda.time.DateMidnight$Property",
      "com.google.common.collect.AbstractMapEntry",
      "org.joda.time.ReadWritableInterval",
      "com.google.common.collect.ImmutableEnumMap$1",
      "com.google.common.collect.EmptyImmutableBiMap",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.google.common.base.Predicate",
      "org.joda.time.format.PeriodFormatterBuilder",
      "com.google.common.collect.ImmutableEnumMap$2",
      "org.joda.time.format.DateTimePrinter",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.base.BaseLocal",
      "quickdt.predictiveModels.randomForest.RandomForestBuilder$1",
      "quickdt.predictiveModels.decisionTree.TreeBuilder",
      "com.google.common.collect.ImmutableMapEntry$TerminalEntry",
      "org.joda.time.format.PeriodFormatterBuilder$FieldFormatter",
      "quickdt.data.HashMapAttributes",
      "org.joda.time.field.DividedDateTimeField",
      "com.google.common.base.Joiner",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "com.google.common.collect.NullsFirstOrdering",
      "org.joda.time.base.BaseInterval",
      "org.joda.time.Duration",
      "org.joda.time.format.PeriodFormatter",
      "com.google.common.collect.Lists$Partition",
      "org.joda.time.Interval",
      "com.google.common.collect.Lists",
      "quickdt.experiments.TrainingDataGenerator2",
      "org.joda.time.base.AbstractInstant",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.format.DateTimeParserBucket",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableSortedSet",
      "org.javatuples.Decade",
      "com.google.common.base.Absent",
      "org.javatuples.Octet",
      "org.joda.time.ReadWritablePeriod",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1$1",
      "quickdt.predictiveModels.randomForest.RandomForestBuilder",
      "com.google.common.base.Joiner$MapJoiner",
      "org.joda.time.LocalDateTime",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.base.Equivalence$Equals",
      "org.joda.time.tz.FixedDateTimeZone",
      "quickdt.predictiveModels.decisionTree.tree.ClassificationCounter",
      "org.joda.time.format.PeriodPrinter",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.chrono.LimitChronology$LimitException",
      "com.google.common.base.Equivalence$Wrapper",
      "com.google.common.base.Preconditions",
      "org.joda.time.base.BaseDuration",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "org.joda.time.field.DecoratedDateTimeField",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "org.joda.time.YearMonthDay",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "org.joda.time.format.DateTimeParser",
      "com.google.common.collect.AbstractNavigableMap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "org.joda.time.chrono.GJChronology$CutoverField",
      "com.google.common.collect.ImmutableMultiset$EntrySet$1",
      "org.joda.time.LocalTime$Property",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.DateTime$Property",
      "quickdt.crossValidation.TestDateTimeExtractor",
      "org.javatuples.Ennead",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.FieldUtils",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.BiMap",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "org.joda.time.field.SkipDateTimeField",
      "com.google.common.collect.ImmutableMapEntry",
      "org.joda.time.base.AbstractPeriod",
      "com.google.common.collect.ImmutableSortedAsList",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.IllegalFieldValueException",
      "com.google.common.collect.ImmutableMapValues$1",
      "quickdt.data.Instance",
      "com.google.common.collect.ImmutableEnumMap$2$1",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.ReadablePeriod",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "org.joda.time.chrono.GregorianChronology",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.Maps$FilteredEntryBiMap",
      "com.google.common.collect.RegularImmutableBiMap$Inverse",
      "com.google.common.collect.Lists$1",
      "org.joda.time.chrono.GJChronology$LinkedDurationField",
      "com.google.common.collect.RegularImmutableMap$NonTerminalMapEntry",
      "org.joda.time.Minutes",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "com.google.common.base.Equivalence$Identity",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BasePartial",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.base.AbstractDuration",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "quickdt.predictiveModels.decisionTree.tree.Node$LeafDepthStats",
      "com.google.common.collect.AbstractMultimap",
      "org.joda.time.base.AbstractInterval",
      "org.joda.time.Hours",
      "org.joda.time.LocalTime",
      "com.google.common.base.Supplier",
      "org.joda.time.base.BasePeriod",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "com.google.common.collect.EmptyImmutableSet",
      "quickdt.crossValidation.OutOfTimeCrossValidator$1",
      "com.google.common.collect.Maps$ImprovedAbstractMap",
      "org.joda.time.TimeOfDay$Property",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "org.joda.time.TimeOfDay",
      "org.joda.time.format.ISOPeriodFormat",
      "com.google.common.collect.Maps$FilteredEntrySortedMap",
      "org.joda.time.chrono.CopticChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DateTimeUtils$FixedMillisProvider",
      "org.joda.time.tz.DateTimeZoneBuilder$OfYear",
      "org.joda.time.ReadableDuration",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.DurationField",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.DateTime",
      "com.google.common.collect.ImmutableMap$Builder",
      "org.joda.time.format.PeriodFormatterBuilder$SimpleAffix",
      "org.javatuples.Quartet",
      "quickdt.predictiveModels.decisionTree.Scorer",
      "com.google.common.collect.Maps$EntryTransformer",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "com.google.common.collect.Ordering",
      "org.joda.time.Instant",
      "org.joda.time.format.PeriodFormatterBuilder$Separator",
      "org.joda.time.chrono.LimitChronology$LimitDurationField",
      "com.google.common.collect.NaturalOrdering",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BuddhistChronology",
      "com.google.common.collect.AllEqualOrdering",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "com.google.common.base.FunctionalEquivalence",
      "org.joda.time.tz.DateTimeZoneBuilder$Recurrence",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.DateTimeUtils$OffsetMillisProvider",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "com.google.common.collect.RegularImmutableList",
      "org.joda.time.Seconds",
      "org.joda.time.field.RemainderDateTimeField",
      "com.google.common.base.Optional",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer$CrossValidationCorrection",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "quickdt.predictiveModels.randomForest.RandomForest",
      "org.joda.time.DateTimeFieldType",
      "com.google.common.collect.RegularImmutableBiMap$NonTerminalBiMapEntry",
      "org.javatuples.valueintf.IValue4",
      "org.javatuples.valueintf.IValue3",
      "org.joda.time.MutableDateTime$Property",
      "com.google.common.collect.ImmutableMapKeySet",
      "org.javatuples.valueintf.IValue2",
      "org.javatuples.valueintf.IValue1",
      "org.javatuples.valueintf.IValue0",
      "quickdt.crossValidation.CrossValLoss",
      "org.joda.time.ReadableInterval",
      "org.joda.time.chrono.LimitChronology$LimitDateTimeField",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.javatuples.Sextet",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.field.SkipUndoDateTimeField",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.ImmutableListMultimap",
      "org.joda.time.field.DelegatedDateTimeField",
      "com.google.common.collect.ImmutableMultimap$1",
      "org.joda.time.chrono.BasicChronology",
      "com.google.common.collect.Maps$AbstractFilteredMap",
      "com.google.common.base.Present",
      "org.javatuples.valueintf.IValue9",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.javatuples.valueintf.IValue8",
      "org.javatuples.valueintf.IValue7",
      "org.javatuples.valueintf.IValue6",
      "com.google.common.collect.ImmutableMultimap$2",
      "org.javatuples.valueintf.IValue5",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableAsList",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.Maps$FilteredEntryMap",
      "com.google.common.collect.SingletonImmutableSet",
      "org.joda.time.PeriodType",
      "quickdt.crossValidation.StationaryCrossValidator",
      "org.joda.time.field.MillisDurationField",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.ImmutableMapEntrySet",
      "quickdt.predictiveModels.PredictiveModel",
      "org.joda.time.chrono.GJChronology",
      "com.google.common.collect.ImmutableMultiset",
      "quickdt.data.AbstractInstance",
      "org.joda.time.LocalDateTime$Property",
      "com.google.common.collect.UsingToStringOrdering",
      "org.joda.time.chrono.BasicFixedMonthChronology",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "org.joda.time.YearMonthDay$Property",
      "org.joda.time.field.UnsupportedDateTimeField",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "com.google.common.collect.ObjectArrays",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.MutablePeriod",
      "quickdt.crossValidation.NonWeightedAUCCrossValLoss",
      "org.joda.time.MutableDateTime",
      "com.google.common.collect.ImmutableList$1",
      "org.joda.time.tz.CachedDateTimeZone",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet",
      "org.joda.time.ReadableDateTime",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "org.joda.time.format.PeriodFormatterBuilder$Literal",
      "org.joda.time.format.PeriodParser",
      "org.javatuples.Unit",
      "com.google.common.collect.UnmodifiableIterator",
      "org.joda.time.DateMidnight",
      "quickdt.predictiveModels.decisionTree.tree.UpdatableLeaf",
      "com.google.common.collect.Maps$FilteredEntryNavigableMap",
      "quickdt.predictiveModels.UpdatablePredictiveModelBuilder",
      "com.twitter.common.stats.ReservoirSampler",
      "com.google.common.collect.ImmutableMapKeySet$1",
      "com.google.common.collect.EmptyImmutableSortedSet",
      "quickdt.crossValidation.CrossValidator",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "org.javatuples.Triplet",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.tz.DateTimeZoneBuilder$Rule",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.joda.time.Days",
      "com.google.common.collect.SingletonImmutableList",
      "org.joda.time.chrono.BasicSingleEraDateTimeField",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableMap",
      "org.joda.time.chrono.LimitChronology",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Maps$1",
      "org.joda.time.ReadableInstant",
      "org.joda.time.base.BaseSingleFieldPeriod",
      "com.google.common.collect.Multiset$Entry",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.tz.Provider",
      "quickdt.predictiveModels.PredictiveModelBuilder",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "quickdt.data.Attributes",
      "com.google.common.collect.ExplicitOrdering",
      "org.joda.time.DurationFieldType",
      "org.joda.time.MutableInterval",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.tz.NameProvider",
      "quickdt.predictiveModels.decisionTree.Tree",
      "com.google.common.collect.ImmutableList$Builder",
      "quickdt.experiments.OutOfTimeCrossValidatorRunner",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.CompoundOrdering",
      "org.joda.time.chrono.AssembledChronology",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.tz.ZoneInfoProvider",
      "com.google.common.collect.RegularImmutableBiMap$1",
      "com.google.common.collect.ImmutableMultiset$1",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.JulianChronology",
      "org.javatuples.Tuple",
      "org.joda.time.Period",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.common.base.Equivalence",
      "org.joda.time.Weeks",
      "org.joda.time.Chronology",
      "org.joda.time.format.PeriodFormatterBuilder$Composite",
      "org.joda.time.field.AbstractReadableInstantFieldProperty",
      "org.joda.time.format.PeriodFormatterBuilder$PeriodFieldAffix",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.Maps",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.SetMultimap",
      "org.joda.time.LocalDate",
      "org.joda.time.format.DateTimeParserBucket$SavedField",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "quickdt.predictiveModels.decisionTree.tree.Node",
      "org.javatuples.Quintet",
      "org.joda.time.ReadablePartial",
      "org.joda.time.chrono.GJChronology$ImpreciseCutoverField",
      "com.google.common.collect.RegularImmutableSortedSet",
      "org.joda.time.field.BaseDurationField"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OutOfTimeCrossValidatorRunner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "quickdt.experiments.OutOfTimeCrossValidatorRunner",
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
      "quickdt.data.Instance",
      "quickdt.predictiveModels.decisionTree.TreeBuilder",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer",
      "quickdt.predictiveModels.decisionTree.scorers.MSEScorer$CrossValidationCorrection",
      "quickdt.predictiveModels.randomForest.RandomForestBuilder",
      "quickdt.crossValidation.CrossValidator",
      "quickdt.crossValidation.OutOfTimeCrossValidator",
      "quickdt.crossValidation.NonWeightedAUCCrossValLoss",
      "quickdt.crossValidation.TestDateTimeExtractor",
      "org.joda.time.base.AbstractPeriod",
      "org.joda.time.base.BasePeriod",
      "org.joda.time.DateTimeUtils$MillisProvider",
      "org.joda.time.DateTimeUtils$SystemMillisProvider",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.PeriodType",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.Chronology",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.DurationField",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.DateTimeField",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.tz.DateTimeZoneBuilder",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.chrono.AssembledChronology$Fields",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.Period",
      "quickdt.crossValidation.OutOfTimeCrossValidator$1",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.DateTime",
      "com.google.common.primitives.Ints",
      "org.joda.time.tz.CachedDateTimeZone$Info",
      "org.joda.time.field.FieldUtils",
      "quickdt.predictiveModels.randomForest.RandomForestBuilder$1",
      "quickdt.predictiveModels.decisionTree.Tree",
      "com.google.common.collect.Iterables",
      "quickdt.predictiveModels.randomForest.RandomForest"
    );
  }
}
