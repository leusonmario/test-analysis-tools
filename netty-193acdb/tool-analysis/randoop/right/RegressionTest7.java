import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass5 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.Channel channel16 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = null;
        try {
            java.lang.Object obj18 = lengthFieldBasedFrameDecoder14.decodeB(channelHandlerContext15, channel16, channelBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.Channel channel24 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer25 = null;
        try {
            java.lang.Object obj26 = lengthFieldBasedFrameDecoder16.decodeB(channelHandlerContext23, channel24, channelBuffer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.writeComplete(channelHandlerContext17, writeCompletionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelUnbound(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder6.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder23.exceptionCaught(channelHandlerContext24, exceptionEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.messageReceived(channelHandlerContext12, messageEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder11.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) ' ', (int) 'a', (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelOpen(channelHandlerContext23, channelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelConnected(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext16, writeCompletionEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder19.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass23 = lengthFieldBasedFrameDecoder19.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder19.handleUpstream(channelHandlerContext24, channelEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 0, (int) (short) -1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelConnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder21.childChannelOpen(channelHandlerContext24, childChannelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) ' ', 0, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.MessageEvent messageEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder21.messageReceived(channelHandlerContext24, messageEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder9.exceptionCaught(channelHandlerContext15, exceptionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent6 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext5, channelStateEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        try {
            java.lang.Object obj20 = lengthFieldBasedFrameDecoder13.decodeB(channelHandlerContext17, channel18, channelBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder18.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.Channel channel21 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = null;
        try {
            java.lang.Object obj23 = lengthFieldBasedFrameDecoder18.decodeB(channelHandlerContext20, channel21, channelBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) -1, (int) ' ', (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 10, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder11.decodeB(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelClosed(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) (short) 1, (int) (short) 0, (int) 'a');
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelUnbound(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.MessageEvent messageEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext22, messageEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.childChannelClosed(channelHandlerContext17, childChannelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.MessageEvent messageEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.messageReceived(channelHandlerContext22, messageEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.exceptionCaught(channelHandlerContext17, exceptionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext15, writeCompletionEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.exceptionCaught(channelHandlerContext17, exceptionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (10) must be equal to or greater than lengthFieldOffset (35) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelConnected(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder8.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder8.channelUnbound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 100, 10, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.childChannelClosed(channelHandlerContext19, childChannelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 10, (int) (short) 1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) '#', 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelClosed(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder15.writeComplete(channelHandlerContext20, writeCompletionEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder22.writeComplete(channelHandlerContext23, writeCompletionEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.childChannelOpen(channelHandlerContext19, childChannelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, 1, (int) (byte) 10, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.Channel channel14 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        try {
            java.lang.Object obj16 = lengthFieldBasedFrameDecoder12.decodeB(channelHandlerContext13, channel14, channelBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder14.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelDisconnected(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelInterestChanged(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) 'a', (int) (short) 1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.childChannelClosed(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder17.handleUpstream(channelHandlerContext19, channelEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass7 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.writeComplete(channelHandlerContext19, writeCompletionEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder14.getClass();
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder14.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelConnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder18.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelBound(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelDisconnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelInterestChanged(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelClosed(channelHandlerContext21, childChannelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 10, (int) (byte) -1, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelClosed(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) -1, (int) 'a', (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelClosed(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelInterestChanged(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder11.handleUpstream(channelHandlerContext16, channelEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.exceptionCaught(channelHandlerContext17, exceptionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelClosed(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.Channel channel15 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        try {
            java.lang.Object obj17 = lengthFieldBasedFrameDecoder13.decodeB(channelHandlerContext14, channel15, channelBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.channelDisconnected(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder19.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder22.channelUnbound(channelHandlerContext23, channelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        try {
            java.lang.Object obj13 = lengthFieldBasedFrameDecoder9.decodeB(channelHandlerContext10, channel11, channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.Channel channel23 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = null;
        try {
            java.lang.Object obj25 = lengthFieldBasedFrameDecoder17.decodeB(channelHandlerContext22, channel23, channelBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder11.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelOpen(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder19.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder19.handleUpstream(channelHandlerContext21, channelEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelClosed(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.writeComplete(channelHandlerContext18, writeCompletionEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) -1, 0, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder20.channelInterestChanged(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.writeComplete(channelHandlerContext14, writeCompletionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelDisconnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.MessageEvent messageEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder19.messageReceived(channelHandlerContext20, messageEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder21.channelOpen(channelHandlerContext24, channelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext23, channelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelDisconnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder24 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        org.jboss.netty.channel.Channel channel26 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = null;
        try {
            java.lang.Object obj28 = lengthFieldBasedFrameDecoder24.decodeB(channelHandlerContext25, channel26, channelBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder24);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.handleUpstream(channelHandlerContext12, channelEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 1, (-1), (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.MessageEvent messageEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.messageReceived(channelHandlerContext19, messageEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.Channel channel25 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = null;
        try {
            java.lang.Object obj27 = lengthFieldBasedFrameDecoder23.decodeB(channelHandlerContext24, channel25, channelBuffer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder18.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelConnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder8.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder18.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelDisconnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 0, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.Channel channel5 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer6 = null;
        try {
            java.lang.Object obj7 = lengthFieldBasedFrameDecoder3.decodeB(channelHandlerContext4, channel5, channelBuffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder18.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelDisconnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 10, (int) (byte) 10, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.MessageEvent messageEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.messageReceived(channelHandlerContext22, messageEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        try {
            java.lang.Object obj13 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext10, channel11, channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '#', (int) (byte) 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelClosed(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelDisconnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelOpen(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder20.channelClosed(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        try {
            java.lang.Object obj20 = lengthFieldBasedFrameDecoder16.decodeB(channelHandlerContext17, channel18, channelBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext23, channelEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.Channel channel23 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = null;
        try {
            java.lang.Object obj25 = lengthFieldBasedFrameDecoder15.decodeB(channelHandlerContext22, channel23, channelBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder8.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.childChannelOpen(channelHandlerContext18, childChannelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder19.getClass();
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder19.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelUnbound(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder11.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (short) -1, 10, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.Channel channel20 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = null;
        try {
            java.lang.Object obj22 = lengthFieldBasedFrameDecoder5.decodeB(channelHandlerContext19, channel20, channelBuffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelDisconnected(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelConnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder8.decodeB(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelClosed(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 1, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelUnbound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder20.channelBound(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelClosed(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder19.exceptionCaught(channelHandlerContext24, exceptionEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 1, 10, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder17.writeComplete(channelHandlerContext21, writeCompletionEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.Channel channel21 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = null;
        try {
            java.lang.Object obj23 = lengthFieldBasedFrameDecoder5.decodeB(channelHandlerContext20, channel21, channelBuffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext23, channelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelOpen(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelBound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        try {
            java.lang.Object obj13 = lengthFieldBasedFrameDecoder9.decodeB(channelHandlerContext10, channel11, channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 1, (int) 'a', (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder11.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelDisconnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelClosed(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder20.channelClosed(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.writeComplete(channelHandlerContext19, writeCompletionEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder21.childChannelClosed(channelHandlerContext24, childChannelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder21.channelClosed(channelHandlerContext24, channelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelBound(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelConnected(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 10, (int) (short) 100, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.childChannelClosed(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext17, childChannelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelUnbound(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelOpen(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder17.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, (int) (short) 10, (int) ' ', (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder11.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.handleUpstream(channelHandlerContext15, channelEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelOpen(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelClosed(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.Channel channel15 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        try {
            java.lang.Object obj17 = lengthFieldBasedFrameDecoder10.decodeB(channelHandlerContext14, channel15, channelBuffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelOpen(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 0, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.Channel channel17 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer18 = null;
        try {
            java.lang.Object obj19 = lengthFieldBasedFrameDecoder15.decodeB(channelHandlerContext16, channel17, channelBuffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.childChannelOpen(channelHandlerContext18, childChannelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.Channel channel23 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer24 = null;
        try {
            java.lang.Object obj25 = lengthFieldBasedFrameDecoder5.decodeB(channelHandlerContext22, channel23, channelBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (byte) 1, (int) (short) 1, (int) ' ', (int) (byte) 10);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext6, exceptionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder24 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent26 = null;
        try {
            lengthFieldBasedFrameDecoder24.exceptionCaught(channelHandlerContext25, exceptionEvent26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder24);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelUnbound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder23.channelInterestChanged(channelHandlerContext24, channelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder21.exceptionCaught(channelHandlerContext24, exceptionEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder12.writeComplete(channelHandlerContext17, writeCompletionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder15.exceptionCaught(channelHandlerContext22, exceptionEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder8.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext18, childChannelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext16, exceptionEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelOpen(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) 1, 10, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder20.channelInterestChanged(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder13.childChannelOpen(channelHandlerContext18, childChannelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder20.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder20.childChannelClosed(channelHandlerContext22, childChannelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) 'a', 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder21.writeComplete(channelHandlerContext24, writeCompletionEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.exceptionCaught(channelHandlerContext17, exceptionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelInterestChanged(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelBound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelOpen(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder24 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent26 = null;
        try {
            lengthFieldBasedFrameDecoder24.channelClosed(channelHandlerContext25, channelStateEvent26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder24);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder20.channelClosed(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext4, writeCompletionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelConnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.MessageEvent messageEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext18, messageEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder23.exceptionCaught(channelHandlerContext24, exceptionEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder20.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder22.handleUpstream(channelHandlerContext23, channelEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, (int) (short) 1, (int) (short) 1, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder13.writeComplete(channelHandlerContext19, writeCompletionEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.MessageEvent messageEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.messageReceived(channelHandlerContext15, messageEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.MessageEvent messageEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder13.messageReceived(channelHandlerContext20, messageEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext23, channelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelOpen(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.handleUpstream(channelHandlerContext18, channelEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelOpen(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.MessageEvent messageEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext14, messageEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelClosed(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass7 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 100, (int) (short) 0, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (32) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (byte) 1, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext7, childChannelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder23.writeComplete(channelHandlerContext24, writeCompletionEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelClosed(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder14.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelUnbound(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.exceptionCaught(channelHandlerContext11, exceptionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelConnected(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder9.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.MessageEvent messageEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder13.messageReceived(channelHandlerContext21, messageEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (short) -1, (int) (byte) 0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) (short) 1, (int) (short) 0, (int) 'a');
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 0, 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext13, writeCompletionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder19.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelConnected(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) -1, (int) (short) 10, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelInterestChanged(channelHandlerContext19, channelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.MessageEvent messageEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder10.messageReceived(channelHandlerContext16, messageEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (short) 10, 0, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelBound(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder11.decodeB(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelBound(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (byte) 1, 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.handleUpstream(channelHandlerContext16, channelEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, (int) (byte) 1, (int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.childChannelOpen(channelHandlerContext17, childChannelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelClosed(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelClosed(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelClosed(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder20.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder20.childChannelOpen(channelHandlerContext22, childChannelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.channelInterestChanged(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.Channel channel14 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        try {
            java.lang.Object obj16 = lengthFieldBasedFrameDecoder12.decodeB(channelHandlerContext13, channel14, channelBuffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext8, exceptionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (-1), (int) '#', (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 10, 100, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass24 = lengthFieldBasedFrameDecoder23.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        org.jboss.netty.channel.Channel channel26 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer27 = null;
        try {
            java.lang.Object obj28 = lengthFieldBasedFrameDecoder23.decodeB(channelHandlerContext25, channel26, channelBuffer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelDisconnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.writeComplete(channelHandlerContext14, writeCompletionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        try {
            java.lang.Object obj11 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext8, channel9, channelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelOpen(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder10.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder8.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelOpen(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelOpen(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass7 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.MessageEvent messageEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.messageReceived(channelHandlerContext17, messageEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelOpen(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext7, writeCompletionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', 10, (int) (byte) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (byte) 0, (int) (short) 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelBound(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        try {
            java.lang.Object obj20 = lengthFieldBasedFrameDecoder14.decodeB(channelHandlerContext17, channel18, channelBuffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        try {
            java.lang.Object obj13 = lengthFieldBasedFrameDecoder9.decodeB(channelHandlerContext10, channel11, channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, 100, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder20.childChannelOpen(channelHandlerContext21, childChannelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.MessageEvent messageEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder9.messageReceived(channelHandlerContext14, messageEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (short) 100, (int) 'a', (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) (short) 1, (int) (short) 0, (int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder13.childChannelOpen(channelHandlerContext18, childChannelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.childChannelOpen(channelHandlerContext19, childChannelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder14.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelClosed(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.childChannelOpen(channelHandlerContext18, childChannelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder18.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder18.childChannelClosed(channelHandlerContext20, childChannelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.writeComplete(channelHandlerContext22, writeCompletionEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.childChannelClosed(channelHandlerContext14, childChannelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder17.writeComplete(channelHandlerContext22, writeCompletionEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.MessageEvent messageEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext16, messageEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 10, (int) (byte) 10, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelConnected(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.handleUpstream(channelHandlerContext17, channelEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 0, 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 10, (int) (byte) 100, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelClosed(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder12.handleUpstream(channelHandlerContext17, channelEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelConnected(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelInterestChanged(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', 10, (int) (byte) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (byte) 1, (int) (short) 10, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.handleUpstream(channelHandlerContext15, channelEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass21 = lengthFieldBasedFrameDecoder20.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder20.channelClosed(channelHandlerContext22, channelStateEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.MessageEvent messageEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder16.messageReceived(channelHandlerContext19, messageEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelConnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder19.exceptionCaught(channelHandlerContext20, exceptionEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.childChannelOpen(channelHandlerContext17, childChannelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass19 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext23, childChannelStateEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelInterestChanged(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.Channel channel16 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = null;
        try {
            java.lang.Object obj18 = lengthFieldBasedFrameDecoder13.decodeB(channelHandlerContext15, channel16, channelBuffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) -1, (int) (byte) 100, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.childChannelOpen(channelHandlerContext17, childChannelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder15.writeComplete(channelHandlerContext17, writeCompletionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelInterestChanged(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent25 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelOpen(channelHandlerContext24, channelStateEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder25 = lengthFieldBasedFrameDecoder23.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder27 = lengthFieldBasedFrameDecoder23.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        org.jboss.netty.channel.Channel channel29 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer30 = null;
        try {
            java.lang.Object obj31 = lengthFieldBasedFrameDecoder27.decodeB(channelHandlerContext28, channel29, channelBuffer30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder25);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder27);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelOpen(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.handleUpstream(channelHandlerContext14, channelEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder6 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder6.channelUnbound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder6);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.childChannelClosed(channelHandlerContext19, childChannelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelConnected(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.exceptionCaught(channelHandlerContext14, exceptionEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelInterestChanged(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.MessageEvent messageEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.messageReceived(channelHandlerContext22, messageEvent23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (byte) 10, (int) (byte) 1, (int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.writeComplete(channelHandlerContext18, writeCompletionEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelConnected(channelHandlerContext17, channelStateEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) (short) 1, (int) (short) 0, (int) 'a');
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 1, (int) (byte) 1, (int) '4', 100);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext6, writeCompletionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelConnected(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelOpen(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) '#', 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelDisconnected(channelHandlerContext20, channelStateEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext21, channelStateEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelInterestChanged(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.MessageEvent messageEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder19.messageReceived(channelHandlerContext20, messageEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder13.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder20 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder22 = lengthFieldBasedFrameDecoder20.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder22.writeComplete(channelHandlerContext23, writeCompletionEvent24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.writeComplete(channelHandlerContext16, writeCompletionEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelOpen(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder18 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext19, childChannelStateEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder16.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder21 = lengthFieldBasedFrameDecoder19.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder23 = lengthFieldBasedFrameDecoder21.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.Channel channel25 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = null;
        try {
            java.lang.Object obj27 = lengthFieldBasedFrameDecoder23.decodeB(channelHandlerContext24, channel25, channelBuffer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder21);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder23);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelInterestChanged(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder11.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder11.childChannelOpen(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder19 = lengthFieldBasedFrameDecoder17.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder19.writeComplete(channelHandlerContext20, writeCompletionEvent21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelBound(channelHandlerContext18, channelStateEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelConnected(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelClosed(channelHandlerContext14, channelStateEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelInterestChanged(channelHandlerContext16, channelStateEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext13, channelEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

