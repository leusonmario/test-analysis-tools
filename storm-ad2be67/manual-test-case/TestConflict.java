package org.apache.storm.kafka.spout;

import org.apache.storm.kafka.spout.builders.SingleTopicKafkaSpoutConfiguration;
import org.apache.storm.shade.org.apache.commons.lang.StringUtils;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestConflict {
    @Test
    public void testToString(){

        //KafkaSpoutConfig conf = SingleTopicKafkaSpoutConfiguration.getKafkaSpoutConfig(getKafkaSpoutStreams(), 1234); // base and left commit
        KafkaSpoutConfig<String, String> conf = KafkaSpoutConfig.builder("localhost:1234", "topic").build(); //merge commit
        int countMaxRetries = StringUtils.countMatches(conf.toString(), "maxRetries=");
        int countSubscription = StringUtils.countMatches(conf.toString(), "subscription=");
        System.out.println(conf.toString());
        assertEquals(0, countSubscription);
        assertEquals(1, countMaxRetries);
    }

    /*
    * There are two ways to create the objects used by the test case
    * However, the main routine is preserved despite the different objects.
    * The first approach is required for base and left commit.
    * The second one is required by the merge commit.
    * */
}
