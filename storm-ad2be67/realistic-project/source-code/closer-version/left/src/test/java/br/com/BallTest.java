package br.com;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BallTest {

    @Test
    public void testToString(){
        Ball ball = new Ball(1,1,"firsPoll", "testeEvo","testeEvo","testeEvo","testeEvo","testeEvo","testeEvo",1);
        System.out.println(ball.toString().getClass().getSimpleName());
        int countMaxRetries = StringUtils.countMatches(ball.toString(), "maxRetries=");
        assertEquals(0, countMaxRetries);
    }

    @Test
    public void test0()  throws Throwable  {
        // EXCEPTION DIFF:
        // The original version did not exhibit this exception:
        //     java.lang.IllegalArgumentException : The constructor public br.com.Ball(long,int,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,long) is not a member of type class br.com.Ball
        Ball ball0 = new Ball(0L, 29, "A!p`qDB.s5x=r", "A!p`qDB.s5x=r", "", ", retryService=", "", "", ", retryService=", 2526L);
    }
}
