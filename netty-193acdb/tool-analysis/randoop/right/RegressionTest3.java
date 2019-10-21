import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
            lengthFieldBasedFrameDecoder15.channelUnbound(channelHandlerContext16, channelStateEvent17);
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.messageReceived(channelHandlerContext13, messageEvent14);
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
            lengthFieldBasedFrameDecoder16.channelUnbound(channelHandlerContext17, channelStateEvent18);
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelConnected(channelHandlerContext16, channelStateEvent17);
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        org.jboss.netty.channel.Channel channel21 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer22 = null;
        try {
            java.lang.Object obj23 = lengthFieldBasedFrameDecoder17.decodeB(channelHandlerContext20, channel21, channelBuffer22);
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.jboss.netty.channel.MessageEvent messageEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder13.messageReceived(channelHandlerContext18, messageEvent19);
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelUnbound(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext16, channelStateEvent17);
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.Channel channel7 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = null;
        try {
            java.lang.Object obj9 = lengthFieldBasedFrameDecoder5.decodeB(channelHandlerContext6, channel7, channelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass7 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        try {
            java.lang.Object obj11 = lengthFieldBasedFrameDecoder5.decodeB(channelHandlerContext8, channel9, channelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.handleUpstream(channelHandlerContext17, channelEvent18);
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) ' ', (int) 'a', (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) (short) 1, (int) (short) 0, (int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext6, channelEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
            lengthFieldBasedFrameDecoder16.childChannelClosed(channelHandlerContext17, childChannelStateEvent18);
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, 0, 10, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.MessageEvent messageEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder16.messageReceived(channelHandlerContext18, messageEvent19);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext16, channelStateEvent17);
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
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.exceptionCaught(channelHandlerContext10, exceptionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelUnbound(channelHandlerContext13, channelStateEvent14);
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext20, channelStateEvent21);
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder10.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelDisconnected(channelHandlerContext12, channelStateEvent13);
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
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
            lengthFieldBasedFrameDecoder12.channelBound(channelHandlerContext15, channelStateEvent16);
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
            lengthFieldBasedFrameDecoder13.channelDisconnected(channelHandlerContext19, channelStateEvent20);
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
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext19, channelStateEvent20);
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
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext16, childChannelStateEvent17);
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (short) 1, (int) (short) 10, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (97) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
            lengthFieldBasedFrameDecoder16.channelConnected(channelHandlerContext17, channelStateEvent18);
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) '#', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext4, writeCompletionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext19, writeCompletionEvent20);
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
            lengthFieldBasedFrameDecoder18.channelClosed(channelHandlerContext19, channelStateEvent20);
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelBound(channelHandlerContext13, channelStateEvent14);
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
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
            lengthFieldBasedFrameDecoder18.channelInterestChanged(channelHandlerContext20, channelStateEvent21);
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
            lengthFieldBasedFrameDecoder21.channelInterestChanged(channelHandlerContext22, channelStateEvent23);
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
            lengthFieldBasedFrameDecoder12.childChannelClosed(channelHandlerContext17, childChannelStateEvent18);
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.exceptionCaught(channelHandlerContext15, exceptionEvent16);
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
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
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext14, writeCompletionEvent15);
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext20, channelStateEvent21);
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
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelDisconnected(channelHandlerContext14, channelStateEvent15);
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
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, (int) (short) 1, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass7 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelConnected(channelHandlerContext18, channelStateEvent19);
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
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
            lengthFieldBasedFrameDecoder21.channelConnected(channelHandlerContext22, channelStateEvent23);
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelInterestChanged(channelHandlerContext18, channelStateEvent19);
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
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelClosed(channelHandlerContext15, channelStateEvent16);
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext8, writeCompletionEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (short) 100, (-1), (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
            lengthFieldBasedFrameDecoder17.channelUnbound(channelHandlerContext19, channelStateEvent20);
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
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (byte) 1, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelUnbound(channelHandlerContext16, channelStateEvent17);
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 0, 0, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 100, (int) (byte) 0, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) 10, (int) (byte) 1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (10) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder9.handleUpstream(channelHandlerContext16, channelEvent17);
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
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) -1, 1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.MessageEvent messageEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext6, messageEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
            lengthFieldBasedFrameDecoder21.channelUnbound(channelHandlerContext22, channelStateEvent23);
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.MessageEvent messageEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.messageReceived(channelHandlerContext14, messageEvent15);
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelUnbound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelUnbound(channelHandlerContext14, channelStateEvent15);
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (1) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder10.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder8.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.messageReceived(channelHandlerContext12, messageEvent13);
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
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder12.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.MessageEvent messageEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder12.messageReceived(channelHandlerContext14, messageEvent15);
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
            lengthFieldBasedFrameDecoder13.channelBound(channelHandlerContext19, channelStateEvent20);
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
            lengthFieldBasedFrameDecoder12.channelInterestChanged(channelHandlerContext16, channelStateEvent17);
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
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.MessageEvent messageEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.messageReceived(channelHandlerContext13, messageEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
            lengthFieldBasedFrameDecoder12.channelUnbound(channelHandlerContext17, channelStateEvent18);
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
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (short) 100, (int) (byte) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
            lengthFieldBasedFrameDecoder19.channelBound(channelHandlerContext20, channelStateEvent21);
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
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
            lengthFieldBasedFrameDecoder15.channelConnected(channelHandlerContext20, channelStateEvent21);
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.Channel channel16 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = null;
        try {
            java.lang.Object obj18 = lengthFieldBasedFrameDecoder9.decodeB(channelHandlerContext15, channel16, channelBuffer17);
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
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass5 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext6, writeCompletionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext11, writeCompletionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext9, channelEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.Channel channel16 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer17 = null;
        try {
            java.lang.Object obj18 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext15, channel16, channelBuffer17);
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
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass5 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelInterestChanged(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelBound(channelHandlerContext12, channelStateEvent13);
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
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext14, childChannelStateEvent15);
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder8.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.childChannelOpen(channelHandlerContext12, childChannelStateEvent13);
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
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelDisconnected(channelHandlerContext16, channelStateEvent17);
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelClosed(channelHandlerContext21, channelStateEvent22);
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
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext4, exceptionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelBound(channelHandlerContext13, channelStateEvent14);
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
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
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
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelConnected(channelHandlerContext13, channelStateEvent14);
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
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
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext15, channelStateEvent16);
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
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelDisconnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext8, childChannelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext12, channelEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder9.decodeB(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder13.writeComplete(channelHandlerContext17, writeCompletionEvent18);
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext14, childChannelStateEvent15);
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, 10, (int) (short) 1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (10) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext17, channelStateEvent18);
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext18, channelStateEvent19);
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelInterestChanged(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
            lengthFieldBasedFrameDecoder18.channelClosed(channelHandlerContext20, channelStateEvent21);
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
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext18, exceptionEvent19);
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
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, (int) (short) 1, (int) (short) 1, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 1, (-1), (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext14, channelStateEvent15);
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        try {
            java.lang.Object obj13 = lengthFieldBasedFrameDecoder8.decodeB(channelHandlerContext10, channel11, channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelUnbound(channelHandlerContext7, channelStateEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        try {
            java.lang.Object obj20 = lengthFieldBasedFrameDecoder12.decodeB(channelHandlerContext17, channel18, channelBuffer19);
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (byte) 0, (int) 'a', (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder9.writeComplete(channelHandlerContext14, writeCompletionEvent15);
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelConnected(channelHandlerContext18, channelStateEvent19);
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
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder16.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
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
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext20, childChannelStateEvent21);
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
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.handleUpstream(channelHandlerContext15, channelEvent16);
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
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder8.channelBound(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelOpen(channelHandlerContext16, channelStateEvent17);
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
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (short) 1, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext4, channelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext20, childChannelStateEvent21);
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass7 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.channelClosed(channelHandlerContext22, channelStateEvent23);
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
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder13.writeComplete(channelHandlerContext17, writeCompletionEvent18);
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
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext15, channelStateEvent16);
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
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 1, 100, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder8.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass5 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.MessageEvent messageEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext6, messageEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder13.exceptionCaught(channelHandlerContext17, exceptionEvent18);
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelOpen(channelHandlerContext21, channelStateEvent22);
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelBound(channelHandlerContext20, channelStateEvent21);
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
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext6, exceptionEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) '4', (int) (byte) 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (byte) 100, 0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
            lengthFieldBasedFrameDecoder13.channelDisconnected(channelHandlerContext16, channelStateEvent17);
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
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        org.jboss.netty.channel.ExceptionEvent exceptionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder17.exceptionCaught(channelHandlerContext19, exceptionEvent20);
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 0, 10, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 100, (int) (byte) 0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, 0, (int) (short) 1, (int) (short) 0, (int) 'a');
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder11.exceptionCaught(channelHandlerContext16, exceptionEvent17);
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
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
            lengthFieldBasedFrameDecoder12.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
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
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelConnected(channelHandlerContext13, channelStateEvent14);
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
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelUnbound(channelHandlerContext16, channelStateEvent17);
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
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelUnbound(channelHandlerContext15, channelStateEvent16);
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
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) ' ', (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
            lengthFieldBasedFrameDecoder9.channelBound(channelHandlerContext16, channelStateEvent17);
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.writeComplete(channelHandlerContext19, writeCompletionEvent20);
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
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder3.decodeB(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelUnbound(channelHandlerContext17, channelStateEvent18);
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) (short) 100, 0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.Channel channel11 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer12 = null;
        try {
            java.lang.Object obj13 = lengthFieldBasedFrameDecoder5.decodeB(channelHandlerContext10, channel11, channelBuffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (-1), 0, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
            lengthFieldBasedFrameDecoder14.channelConnected(channelHandlerContext17, channelStateEvent18);
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
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.handleUpstream(channelHandlerContext18, channelEvent19);
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
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
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
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
            lengthFieldBasedFrameDecoder15.channelUnbound(channelHandlerContext16, channelStateEvent17);
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
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.exceptionCaught(channelHandlerContext18, exceptionEvent19);
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
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelBound(channelHandlerContext18, channelStateEvent19);
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
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelConnected(channelHandlerContext19, channelStateEvent20);
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelInterestChanged(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelOpen(channelHandlerContext22, channelStateEvent23);
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
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
            lengthFieldBasedFrameDecoder19.channelBound(channelHandlerContext22, channelStateEvent23);
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelDisconnected(channelHandlerContext18, channelStateEvent19);
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
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 0, (int) (byte) 10, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 10");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext15, writeCompletionEvent16);
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
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '4', (int) (short) 1, (int) (byte) 100, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext20, channelStateEvent21);
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
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        org.jboss.netty.channel.Channel channel19 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = null;
        try {
            java.lang.Object obj21 = lengthFieldBasedFrameDecoder17.decodeB(channelHandlerContext18, channel19, channelBuffer20);
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
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.MessageEvent messageEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder17.messageReceived(channelHandlerContext22, messageEvent23);
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
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.Channel channel19 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = null;
        try {
            java.lang.Object obj21 = lengthFieldBasedFrameDecoder17.decodeB(channelHandlerContext18, channel19, channelBuffer20);
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
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext15, exceptionEvent16);
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
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext12, channelEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
            lengthFieldBasedFrameDecoder11.childChannelClosed(channelHandlerContext15, childChannelStateEvent16);
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) 100, (int) (short) -1, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
            lengthFieldBasedFrameDecoder21.channelDisconnected(channelHandlerContext22, channelStateEvent23);
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
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.writeComplete(channelHandlerContext15, writeCompletionEvent16);
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
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelBound(channelHandlerContext18, channelStateEvent19);
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
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', 0, 0, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass7 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext8, channelEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelDisconnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.handleUpstream(channelHandlerContext12, channelEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.childChannelClosed(channelHandlerContext17, childChannelStateEvent18);
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
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
            lengthFieldBasedFrameDecoder17.channelClosed(channelHandlerContext20, channelStateEvent21);
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
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
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
            lengthFieldBasedFrameDecoder20.channelConnected(channelHandlerContext21, channelStateEvent22);
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
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder19.channelUnbound(channelHandlerContext21, channelStateEvent22);
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
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder12.handleUpstream(channelHandlerContext15, channelEvent16);
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
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, (int) ' ', (int) (short) 0, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.writeComplete(channelHandlerContext13, writeCompletionEvent14);
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
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder21.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder21.handleUpstream(channelHandlerContext23, channelEvent24);
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
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext10, channelEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.Channel channel10 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer11 = null;
        try {
            java.lang.Object obj12 = lengthFieldBasedFrameDecoder8.decodeB(channelHandlerContext9, channel10, channelBuffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelUnbound(channelHandlerContext18, channelStateEvent19);
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
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext7, exceptionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, (int) (short) 1, (int) (short) 1, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelClosed(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass17 = lengthFieldBasedFrameDecoder16.getClass();
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder16.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelOpen(channelHandlerContext19, channelStateEvent20);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, (int) (byte) 100, (int) (short) 100, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelDisconnected(channelHandlerContext17, channelStateEvent18);
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
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.Channel channel13 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer14 = null;
        try {
            java.lang.Object obj15 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext12, channel13, channelBuffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
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
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder5.exceptionCaught(channelHandlerContext9, exceptionEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((-1), (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.exceptionCaught(channelHandlerContext13, exceptionEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelUnbound(channelHandlerContext19, channelStateEvent20);
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
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, 10, 0, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelOpen(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext15, channelStateEvent16);
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
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelClosed(channelHandlerContext12, channelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
            lengthFieldBasedFrameDecoder17.childChannelClosed(channelHandlerContext18, childChannelStateEvent19);
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
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
            lengthFieldBasedFrameDecoder22.channelDisconnected(channelHandlerContext23, channelStateEvent24);
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
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.Channel channel14 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer15 = null;
        try {
            java.lang.Object obj16 = lengthFieldBasedFrameDecoder7.decodeB(channelHandlerContext13, channel14, channelBuffer15);
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
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder17.childChannelOpen(channelHandlerContext22, childChannelStateEvent23);
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
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.writeComplete(channelHandlerContext12, writeCompletionEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelBound(channelHandlerContext18, channelStateEvent19);
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
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.MessageEvent messageEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext11, messageEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext14, writeCompletionEvent15);
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
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.channelDisconnected(channelHandlerContext19, channelStateEvent20);
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
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelDisconnected(channelHandlerContext15, channelStateEvent16);
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
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder9.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder9.exceptionCaught(channelHandlerContext13, exceptionEvent14);
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
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder8.childChannelOpen(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.childChannelOpen(channelHandlerContext22, childChannelStateEvent23);
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelConnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (short) 1, (int) 'a', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
            lengthFieldBasedFrameDecoder18.channelBound(channelHandlerContext19, channelStateEvent20);
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
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
            lengthFieldBasedFrameDecoder14.channelInterestChanged(channelHandlerContext15, channelStateEvent16);
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
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder8.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder8.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelUnbound(channelHandlerContext12, channelStateEvent13);
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder10.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (short) 1);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent5 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelOpen(channelHandlerContext4, childChannelStateEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
            lengthFieldBasedFrameDecoder16.channelClosed(channelHandlerContext22, channelStateEvent23);
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
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (1) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        org.jboss.netty.channel.ExceptionEvent exceptionEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder19.exceptionCaught(channelHandlerContext23, exceptionEvent24);
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
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.writeComplete(channelHandlerContext10, writeCompletionEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) -1, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
            lengthFieldBasedFrameDecoder19.channelOpen(channelHandlerContext23, channelStateEvent24);
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
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelUnbound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 100, (int) 'a', 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
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
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelDisconnected(channelHandlerContext15, channelStateEvent16);
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
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (byte) 1, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext15, channelEvent16);
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
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelDisconnected(channelHandlerContext14, channelStateEvent15);
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
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.childChannelOpen(channelHandlerContext17, childChannelStateEvent18);
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
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder16 = lengthFieldBasedFrameDecoder14.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder16.channelDisconnected(channelHandlerContext17, channelStateEvent18);
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
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.MessageEvent messageEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder13.messageReceived(channelHandlerContext16, messageEvent17);
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
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
            lengthFieldBasedFrameDecoder9.channelConnected(channelHandlerContext16, channelStateEvent17);
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
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 10, 0, (int) (short) 1, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent8 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext7, channelEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
            lengthFieldBasedFrameDecoder18.channelBound(channelHandlerContext19, channelStateEvent20);
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
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder17.childChannelClosed(channelHandlerContext20, childChannelStateEvent21);
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
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.MessageEvent messageEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext15, messageEvent16);
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
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.MessageEvent messageEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder11.messageReceived(channelHandlerContext12, messageEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelBound(channelHandlerContext17, channelStateEvent18);
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
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.Channel channel12 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer13 = null;
        try {
            java.lang.Object obj14 = lengthFieldBasedFrameDecoder9.decodeB(channelHandlerContext11, channel12, channelBuffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder18);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder20);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelClosed(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
            lengthFieldBasedFrameDecoder17.channelBound(channelHandlerContext20, channelStateEvent21);
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, 0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.handleUpstream(channelHandlerContext6, channelEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelConnected(channelHandlerContext6, channelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass5 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.Channel channel7 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer8 = null;
        try {
            java.lang.Object obj9 = lengthFieldBasedFrameDecoder3.decodeB(channelHandlerContext6, channel7, channelBuffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.jboss.netty.channel.Channel channel25 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer26 = null;
        try {
            java.lang.Object obj27 = lengthFieldBasedFrameDecoder21.decodeB(channelHandlerContext24, channel25, channelBuffer26);
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
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext19, channelStateEvent20);
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
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) '4', (int) (byte) -1, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder13.channelBound(channelHandlerContext16, channelStateEvent17);
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
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
            lengthFieldBasedFrameDecoder18.channelDisconnected(channelHandlerContext19, channelStateEvent20);
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
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
            lengthFieldBasedFrameDecoder12.channelDisconnected(channelHandlerContext15, channelStateEvent16);
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
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder17.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.Channel channel20 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer21 = null;
        try {
            java.lang.Object obj22 = lengthFieldBasedFrameDecoder17.decodeB(channelHandlerContext19, channel20, channelBuffer21);
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
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
            lengthFieldBasedFrameDecoder19.channelConnected(channelHandlerContext23, channelStateEvent24);
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
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        org.jboss.netty.channel.ExceptionEvent exceptionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder18.exceptionCaught(channelHandlerContext19, exceptionEvent20);
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
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelClosed(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent9 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelUnbound(channelHandlerContext8, channelStateEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder21.channelClosed(channelHandlerContext22, channelStateEvent23);
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
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelOpen(channelHandlerContext15, childChannelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 0, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        org.jboss.netty.channel.MessageEvent messageEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder17.messageReceived(channelHandlerContext20, messageEvent21);
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
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelClosed(channelHandlerContext13, childChannelStateEvent14);
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
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        org.jboss.netty.channel.Channel channel19 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer20 = null;
        try {
            java.lang.Object obj21 = lengthFieldBasedFrameDecoder3.decodeB(channelHandlerContext18, channel19, channelBuffer20);
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
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent21 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelUnbound(channelHandlerContext20, channelStateEvent21);
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
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext15, channelEvent16);
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
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent13 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext12, childChannelStateEvent13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder5.writeComplete(channelHandlerContext19, writeCompletionEvent20);
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
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.MessageEvent messageEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.messageReceived(channelHandlerContext10, messageEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
            lengthFieldBasedFrameDecoder19.channelDisconnected(channelHandlerContext20, channelStateEvent21);
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
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.childChannelClosed(channelHandlerContext11, childChannelStateEvent12);
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder12.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.channelDisconnected(channelHandlerContext15, channelStateEvent16);
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.channelUnbound(channelHandlerContext13, channelStateEvent14);
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
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelClosed(channelHandlerContext16, channelStateEvent17);
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
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        java.lang.Class<?> wildcardClass20 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent22 = null;
        try {
            lengthFieldBasedFrameDecoder15.channelUnbound(channelHandlerContext21, channelStateEvent22);
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext16, channelStateEvent17);
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
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 97");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, 0, (int) (byte) 10, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent19 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelUnbound(channelHandlerContext18, channelStateEvent19);
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
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.childChannelClosed(channelHandlerContext15, childChannelStateEvent16);
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
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.Channel channel15 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer16 = null;
        try {
            java.lang.Object obj17 = lengthFieldBasedFrameDecoder3.decodeB(channelHandlerContext14, channel15, channelBuffer16);
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
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 100, 10, (int) '4', 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 52");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent15 = null;
        try {
            lengthFieldBasedFrameDecoder13.childChannelOpen(channelHandlerContext14, childChannelStateEvent15);
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, (int) (short) 10, (int) (byte) -1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 10, 1, 0, (int) (short) 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.childChannelOpen(channelHandlerContext13, childChannelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 35");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder9.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 0, (int) '4', (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialBytesToStrip must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelUnbound(channelHandlerContext17, channelStateEvent18);
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelOpen(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, (int) (short) 10, (int) (byte) 100, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent6 = null;
        try {
            lengthFieldBasedFrameDecoder3.writeComplete(channelHandlerContext5, writeCompletionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (byte) 100, (int) (byte) 1, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength (100) must be equal to or greater than lengthFieldOffset (100) + lengthFieldLength (1).");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelOpen(channelHandlerContext10, childChannelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
            lengthFieldBasedFrameDecoder19.channelBound(channelHandlerContext23, channelStateEvent24);
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
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext16, childChannelStateEvent17);
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
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent17 = null;
        try {
            lengthFieldBasedFrameDecoder11.channelClosed(channelHandlerContext16, channelStateEvent17);
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
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) -1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.childChannelOpen(channelHandlerContext15, childChannelStateEvent16);
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
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass5 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext6, channelEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelUnbound(channelHandlerContext15, channelStateEvent16);
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder22);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(10, (int) (byte) 0, (int) (short) 1, (int) (short) -1, 100);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.childChannelClosed(channelHandlerContext9, childChannelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
            lengthFieldBasedFrameDecoder7.channelBound(channelHandlerContext15, channelStateEvent16);
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
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.lang.Class<?> wildcardClass22 = lengthFieldBasedFrameDecoder21.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent24 = null;
        try {
            lengthFieldBasedFrameDecoder21.channelBound(channelHandlerContext23, channelStateEvent24);
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
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) '#', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldOffset must be a non-negative integer: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        java.lang.Class<?> wildcardClass15 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
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
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass16 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent18 = null;
        try {
            lengthFieldBasedFrameDecoder13.handleUpstream(channelHandlerContext17, channelEvent18);
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass11 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelBound(channelHandlerContext13, channelStateEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) 'a', (int) '4', 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent6 = null;
        try {
            lengthFieldBasedFrameDecoder3.handleUpstream(channelHandlerContext5, channelEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 0, (int) (byte) 10, 0, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent23 = null;
        try {
            lengthFieldBasedFrameDecoder17.channelDisconnected(channelHandlerContext22, channelStateEvent23);
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder7.channelInterestChanged(channelHandlerContext9, channelStateEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder15.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass18 = lengthFieldBasedFrameDecoder15.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent20 = null;
        try {
            lengthFieldBasedFrameDecoder15.childChannelOpen(channelHandlerContext19, childChannelStateEvent20);
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
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent7 = null;
        try {
            lengthFieldBasedFrameDecoder3.childChannelClosed(channelHandlerContext6, childChannelStateEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        try {
            java.lang.Object obj11 = lengthFieldBasedFrameDecoder3.decodeB(channelHandlerContext8, channel9, channelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 1, (int) 'a', (int) (short) 100, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder13.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder13.handleUpstream(channelHandlerContext15, channelEvent16);
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
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder7.getClass();
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder12);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder14);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder3.getClass();
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelInterestChanged(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder12.writeComplete(channelHandlerContext13, writeCompletionEvent14);
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
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder9.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChildChannelStateEvent childChannelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder9.childChannelOpen(channelHandlerContext11, childChannelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent14 = null;
        try {
            lengthFieldBasedFrameDecoder3.channelOpen(channelHandlerContext13, channelStateEvent14);
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
            lengthFieldBasedFrameDecoder15.channelClosed(channelHandlerContext20, channelStateEvent21);
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass9 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder10.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass10 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelBound(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 10, 0, (int) (short) 1, (int) (short) 0, 0);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder7.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelEvent channelEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder7.handleUpstream(channelHandlerContext11, channelEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass6 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder8 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent12 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelDisconnected(channelHandlerContext11, channelStateEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder8);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder10);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder17 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        java.lang.Class<?> wildcardClass12 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass13 = lengthFieldBasedFrameDecoder5.getClass();
        java.lang.Class<?> wildcardClass14 = lengthFieldBasedFrameDecoder5.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder5.channelOpen(channelHandlerContext15, channelStateEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder11.setFailImmediatelyOnTooLongFrame(true);
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
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder11);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder13);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder15);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder17);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder10 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder12 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder14 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.jboss.netty.channel.WriteCompletionEvent writeCompletionEvent16 = null;
        try {
            lengthFieldBasedFrameDecoder14.writeComplete(channelHandlerContext15, writeCompletionEvent16);
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
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) '4', (int) ' ', (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 32");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(100, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.jboss.netty.channel.ExceptionEvent exceptionEvent6 = null;
        try {
            lengthFieldBasedFrameDecoder3.exceptionCaught(channelHandlerContext5, exceptionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (byte) 1, (int) 'a', (int) (short) 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lengthFieldLength must be either 1, 2, 3, 4, or 8: 100");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        try {
            org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder(0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxFrameLength must be a positive integer: 0");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        org.jboss.netty.channel.Channel channel18 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer19 = null;
        try {
            java.lang.Object obj20 = lengthFieldBasedFrameDecoder16.decodeB(channelHandlerContext17, channel18, channelBuffer19);
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        java.lang.Class<?> wildcardClass8 = lengthFieldBasedFrameDecoder3.getClass();
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.jboss.netty.channel.MessageEvent messageEvent10 = null;
        try {
            lengthFieldBasedFrameDecoder3.messageReceived(channelHandlerContext9, messageEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder11 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder13 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder15 = lengthFieldBasedFrameDecoder13.setFailImmediatelyOnTooLongFrame(true);
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
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) (byte) 1, 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.jboss.netty.channel.Channel channel9 = null;
        org.jboss.netty.buffer.ChannelBuffer channelBuffer10 = null;
        try {
            java.lang.Object obj11 = lengthFieldBasedFrameDecoder5.decodeB(channelHandlerContext8, channel9, channelBuffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder3 = new org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder((int) (short) 100, (int) ' ', (int) (short) 1);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder5 = lengthFieldBasedFrameDecoder3.setFailImmediatelyOnTooLongFrame(true);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder7 = lengthFieldBasedFrameDecoder5.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.handler.codec.frame.LengthFieldBasedFrameDecoder lengthFieldBasedFrameDecoder9 = lengthFieldBasedFrameDecoder7.setFailImmediatelyOnTooLongFrame(false);
        org.jboss.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.jboss.netty.channel.ChannelStateEvent channelStateEvent11 = null;
        try {
            lengthFieldBasedFrameDecoder9.channelDisconnected(channelHandlerContext10, channelStateEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder5);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder7);
        org.junit.Assert.assertNotNull(lengthFieldBasedFrameDecoder9);
    }
}

