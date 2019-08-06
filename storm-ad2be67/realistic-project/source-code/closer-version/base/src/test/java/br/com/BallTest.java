package br.com;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BallTest {


    @Test
    public void testToString(){
        Ball ball = new Ball(1,1,1, "testeEvo","testeEvo","testeEvo","testeEvo","testeEvo","testeEvo","testeEvo",1);
        System.out.println(ball.toString().getClass().getSimpleName());
        int countMaxRetries = StringUtils.countMatches(ball.toString(), "maxRetries=");
        assertEquals(1, countMaxRetries);
    }

    /*
    @Test
    public void test1()  throws Throwable  {
        Ball ball0 = new Ball(1L, 2158, 2012, (String) null, (String) null, (String) null, "(N-N+i", "(N-N+i", (String) null, (String) null, "", (String) null);
        String string0 = ball0.toString();
        assertEquals("KafkaSpoutConfig{kafkaProps=(N-N+i, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=null, offsetCommitPeriodMs=1, maxUncommittedOffsets=2012, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=(N-N+i, topics=, topicWildcardPattern=null}", string0); // (Primitive) Original Value: KafkaSpoutConfig{kafkaProps=(N-N+i, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=null, offsetCommitPeriodMs=1, maxUncommittedOffsets=2012, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=(N-N+i, topics=, topicWildcardPattern=null} | Regression Value: KafkaSpoutConfig{kafkaProps=(N-N+i, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=null, offsetCommitPeriodMs=1, maxRetries=2158, maxUncommittedOffsets=2012, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=(N-N+i, topics=, topicWildcardPattern=null}
    }*/

    @Test
    public void test0()  throws Throwable  {
        // EXCEPTION DIFF:
        // The original version did not exhibit this exception:
        //     java.lang.IllegalArgumentException : The constructor public br.com.Ball(long,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,long) is not a member of type class br.com.Ball
        Ball ball0 = new Ball(0L, 29, "A!p`qDB.s5x=r", "A!p`qDB.s5x=r", "", ", retryService=", "", "", ", retryService=", 2526L);
    }
}
