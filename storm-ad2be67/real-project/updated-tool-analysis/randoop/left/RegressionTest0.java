import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.BOOTSTRAP_SERVERS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "bootstrap.servers" + "'", str0.equals("bootstrap.servers"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 200L + "'", long0 == 200L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.GROUP_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "group.id" + "'", str0.equals("group.id"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000000 + "'", int0 == 10000000);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutTuplesBuilder2 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.ExceptionInInitializerError; message: null");
        } catch (java.lang.ExceptionInInitializerError e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.KEY_DESERIALIZER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "key.deserializer" + "'", str0.equals("key.deserializer"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.ENABLE_AUTO_COMMIT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "enable.auto.commit" + "'", str0.equals("enable.auto.commit"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.VALUE_DESERIALIZER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "value.deserializer" + "'", str0.equals("value.deserializer"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30000L + "'", long0 == 30000L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.AUTO_COMMIT_INTERVAL_MS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "auto.commit.interval.ms" + "'", str0.equals("auto.commit.interval.ms"));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.CharSequence> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Object> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.Type> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Object> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.String> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.CharSequence> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.GenericDeclaration> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Object> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.io.Serializable> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.CharSequence> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.AnnotatedElement> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.io.Serializable> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.io.Serializable> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.Type> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.String> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.Type> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Object> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.String> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.Type> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.io.Serializable> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass2 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass3 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass4 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass5 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass6 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass7 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass8 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass9 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass10 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass11 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass12 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass13 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass14 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass15 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass16 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass17 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass18 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass19 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass20 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass21 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass22 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass23 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass24 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass25 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass26 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass27 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass28 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass29 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass30 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass31 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass32 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass33 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass34 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass35 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass36 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass37 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass38 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass39 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass40 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass41 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass42 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass43 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass44 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass45 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass46 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass47 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass48 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass49 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass50 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass51 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass52 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass53 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass54 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass55 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass56 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass57 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass58 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass59 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass60 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass61 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass62 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass63 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass64 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass65 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass66 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass67 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass68 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass69 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass70 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass71 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass72 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass73 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass74 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass75 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass76 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass77 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass78 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass79 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass80 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass81 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass82 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass83 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass84 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass85 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass86 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass87 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass88 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass89 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass90 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass91 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass92 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass93 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass94 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass95 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass96 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass97 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass98 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass99 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass2 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass3 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass4 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass5 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass6 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass7 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass8 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass9 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass10 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass11 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass12 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass13 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass14 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass15 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass16 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass17 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass18 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass19 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass20 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass21 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass22 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass23 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass24 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass25 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass26 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass27 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass28 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass29 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass30 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass31 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass32 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass33 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass34 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass35 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass36 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass37 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass38 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass39 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass40 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass41 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass42 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass43 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass44 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass45 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass46 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass47 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass48 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass49 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass50 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass51 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass52 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass53 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass54 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass55 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass56 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass57 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass58 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass59 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass60 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass61 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass62 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass63 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass64 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass65 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass66 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass67 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass68 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass69 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass70 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass71 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass72 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass73 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass74 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass75 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass76 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass77 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass78 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass79 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass80 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass81 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass82 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass83 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass84 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass85 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass86 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass87 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass88 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass89 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass90 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass91 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass92 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass93 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass94 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass95 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass96 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass97 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass98 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass99 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass2 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass3 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass4 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass5 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass6 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass7 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass8 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass9 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass10 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass11 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass12 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass13 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass14 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass15 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass16 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass17 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass18 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass19 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass20 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass21 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass22 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass23 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass24 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass25 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass26 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass27 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass28 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass29 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass30 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass31 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass32 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass33 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass34 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass35 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass36 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass37 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass38 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass39 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass40 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass41 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass42 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass43 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass44 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass45 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass46 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass47 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass48 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass49 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass50 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass51 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass52 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass53 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass54 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass55 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass56 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass57 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass58 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass59 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass60 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass61 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass62 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass63 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass64 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass65 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass66 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass67 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass68 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass69 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass70 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass71 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass72 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass73 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass74 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass75 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass76 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass77 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass78 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass79 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass80 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass81 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass82 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass83 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass84 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass85 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass86 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass87 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass88 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass89 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass90 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass91 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass92 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass93 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass94 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass95 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass96 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass97 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass98 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass99 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Class<?> wildcardClass7 = obj0.getClass();
        java.lang.Class<?> wildcardClass8 = obj0.getClass();
        java.lang.Class<?> wildcardClass9 = obj0.getClass();
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        java.lang.Class<?> wildcardClass11 = obj0.getClass();
        java.lang.Class<?> wildcardClass12 = obj0.getClass();
        java.lang.Class<?> wildcardClass13 = obj0.getClass();
        java.lang.Class<?> wildcardClass14 = obj0.getClass();
        java.lang.Class<?> wildcardClass15 = obj0.getClass();
        java.lang.Class<?> wildcardClass16 = obj0.getClass();
        java.lang.Class<?> wildcardClass17 = obj0.getClass();
        java.lang.Class<?> wildcardClass18 = obj0.getClass();
        java.lang.Class<?> wildcardClass19 = obj0.getClass();
        java.lang.Class<?> wildcardClass20 = obj0.getClass();
        java.lang.Class<?> wildcardClass21 = obj0.getClass();
        java.lang.Class<?> wildcardClass22 = obj0.getClass();
        java.lang.Class<?> wildcardClass23 = obj0.getClass();
        java.lang.Class<?> wildcardClass24 = obj0.getClass();
        java.lang.Class<?> wildcardClass25 = obj0.getClass();
        java.lang.Class<?> wildcardClass26 = obj0.getClass();
        java.lang.Class<?> wildcardClass27 = obj0.getClass();
        java.lang.Class<?> wildcardClass28 = obj0.getClass();
        java.lang.Class<?> wildcardClass29 = obj0.getClass();
        java.lang.Class<?> wildcardClass30 = obj0.getClass();
        java.lang.Class<?> wildcardClass31 = obj0.getClass();
        java.lang.Class<?> wildcardClass32 = obj0.getClass();
        java.lang.Class<?> wildcardClass33 = obj0.getClass();
        java.lang.Class<?> wildcardClass34 = obj0.getClass();
        java.lang.Class<?> wildcardClass35 = obj0.getClass();
        java.lang.Class<?> wildcardClass36 = obj0.getClass();
        java.lang.Class<?> wildcardClass37 = obj0.getClass();
        java.lang.Class<?> wildcardClass38 = obj0.getClass();
        java.lang.Class<?> wildcardClass39 = obj0.getClass();
        java.lang.Class<?> wildcardClass40 = obj0.getClass();
        java.lang.Class<?> wildcardClass41 = obj0.getClass();
        java.lang.Class<?> wildcardClass42 = obj0.getClass();
        java.lang.Class<?> wildcardClass43 = obj0.getClass();
        java.lang.Class<?> wildcardClass44 = obj0.getClass();
        java.lang.Class<?> wildcardClass45 = obj0.getClass();
        java.lang.Class<?> wildcardClass46 = obj0.getClass();
        java.lang.Class<?> wildcardClass47 = obj0.getClass();
        java.lang.Class<?> wildcardClass48 = obj0.getClass();
        java.lang.Class<?> wildcardClass49 = obj0.getClass();
        java.lang.Class<?> wildcardClass50 = obj0.getClass();
        java.lang.Class<?> wildcardClass51 = obj0.getClass();
        java.lang.Class<?> wildcardClass52 = obj0.getClass();
        java.lang.Class<?> wildcardClass53 = obj0.getClass();
        java.lang.Class<?> wildcardClass54 = obj0.getClass();
        java.lang.Class<?> wildcardClass55 = obj0.getClass();
        java.lang.Class<?> wildcardClass56 = obj0.getClass();
        java.lang.Class<?> wildcardClass57 = obj0.getClass();
        java.lang.Class<?> wildcardClass58 = obj0.getClass();
        java.lang.Class<?> wildcardClass59 = obj0.getClass();
        java.lang.Class<?> wildcardClass60 = obj0.getClass();
        java.lang.Class<?> wildcardClass61 = obj0.getClass();
        java.lang.Class<?> wildcardClass62 = obj0.getClass();
        java.lang.Class<?> wildcardClass63 = obj0.getClass();
        java.lang.Class<?> wildcardClass64 = obj0.getClass();
        java.lang.Class<?> wildcardClass65 = obj0.getClass();
        java.lang.Class<?> wildcardClass66 = obj0.getClass();
        java.lang.Class<?> wildcardClass67 = obj0.getClass();
        java.lang.Class<?> wildcardClass68 = obj0.getClass();
        java.lang.Class<?> wildcardClass69 = obj0.getClass();
        java.lang.Class<?> wildcardClass70 = obj0.getClass();
        java.lang.Class<?> wildcardClass71 = obj0.getClass();
        java.lang.Class<?> wildcardClass72 = obj0.getClass();
        java.lang.Class<?> wildcardClass73 = obj0.getClass();
        java.lang.Class<?> wildcardClass74 = obj0.getClass();
        java.lang.Class<?> wildcardClass75 = obj0.getClass();
        java.lang.Class<?> wildcardClass76 = obj0.getClass();
        java.lang.Class<?> wildcardClass77 = obj0.getClass();
        java.lang.Class<?> wildcardClass78 = obj0.getClass();
        java.lang.Class<?> wildcardClass79 = obj0.getClass();
        java.lang.Class<?> wildcardClass80 = obj0.getClass();
        java.lang.Class<?> wildcardClass81 = obj0.getClass();
        java.lang.Class<?> wildcardClass82 = obj0.getClass();
        java.lang.Class<?> wildcardClass83 = obj0.getClass();
        java.lang.Class<?> wildcardClass84 = obj0.getClass();
        java.lang.Class<?> wildcardClass85 = obj0.getClass();
        java.lang.Class<?> wildcardClass86 = obj0.getClass();
        java.lang.Class<?> wildcardClass87 = obj0.getClass();
        java.lang.Class<?> wildcardClass88 = obj0.getClass();
        java.lang.Class<?> wildcardClass89 = obj0.getClass();
        java.lang.Class<?> wildcardClass90 = obj0.getClass();
        java.lang.Class<?> wildcardClass91 = obj0.getClass();
        java.lang.Class<?> wildcardClass92 = obj0.getClass();
        java.lang.Class<?> wildcardClass93 = obj0.getClass();
        java.lang.Class<?> wildcardClass94 = obj0.getClass();
        java.lang.Class<?> wildcardClass95 = obj0.getClass();
        java.lang.Class<?> wildcardClass96 = obj0.getClass();
        java.lang.Class<?> wildcardClass97 = obj0.getClass();
        java.lang.Class<?> wildcardClass98 = obj0.getClass();
        java.lang.Class<?> wildcardClass99 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass2 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass3 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass4 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass5 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass6 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass7 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass8 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass9 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass10 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass11 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass12 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass13 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass14 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass15 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass16 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass17 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass18 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass19 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass20 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass21 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass22 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass23 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass24 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass25 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass26 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass27 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass28 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass29 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass30 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass31 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass32 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass33 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass34 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass35 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass36 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass37 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass38 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass39 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass40 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass41 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass42 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass43 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass44 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass45 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass46 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass47 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass48 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass49 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass50 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass51 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass52 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass53 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass54 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass55 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass56 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass57 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass58 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass59 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass60 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass61 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass62 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass63 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass64 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass65 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass66 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass67 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass68 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass69 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass70 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass71 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass72 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass73 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass74 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass75 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass76 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass77 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass78 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass79 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass80 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass81 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass82 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass83 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass84 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass85 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass86 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass87 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass88 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass89 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass90 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass91 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass92 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass93 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass94 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass95 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass96 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass97 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass98 = firstPollOffsetStrategy0.getClass();
        java.lang.Class<?> wildcardClass99 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }
}

