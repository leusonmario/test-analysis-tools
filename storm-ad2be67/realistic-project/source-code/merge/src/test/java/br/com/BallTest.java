package br.com;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BallTest {

    @Test
    public void testToString(){
        Ball ball = new Ball(1,1,1, "testeEvo","testeEvo","testeEvo","testeEvo","testeEvo","testeEvo","testeEvo","testeEvo","testeEvo");
        System.out.println(ball.getFinalString().getClass().getSimpleName());
        int countMaxRetries = StringUtils.countMatches(ball.getFinalString(), "maxRetries=");
        assertEquals(0, countMaxRetries);
    }
}
