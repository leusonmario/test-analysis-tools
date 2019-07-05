import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        try {
            java.lang.String str2 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext2, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        try {
            java.lang.String str4 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        try {
            long long3 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext3, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str4 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        java.lang.Throwable throwable5 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext4, throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext3, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str3 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        org.traccar.model.Position position6 = null;
        java.util.Date date7 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext4, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        try {
            java.lang.String str6 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        try {
            java.lang.String str5 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol3 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder4 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol3);
        boolean boolean5 = aquilaProtocolDecoder4.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder4.handlerRemoved(channelHandlerContext6);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext2, (java.lang.Object) aquilaProtocolDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        org.traccar.model.Position position2 = null;
        java.util.Date date3 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position2, date3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol5 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder6 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext9);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext4, (java.lang.Object) channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext4, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "", "", "", "", "" };
        try {
            org.traccar.DeviceSession deviceSession11 = aquilaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray4 = null;
        try {
            org.traccar.DeviceSession deviceSession5 = aquilaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        java.lang.Throwable throwable3 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext2, throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol5 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder6 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder6.handlerRemoved(channelHandlerContext11);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext4, (java.lang.Object) channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        java.lang.Throwable throwable6 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext5, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext11, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext4, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        java.lang.Throwable throwable6 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext5, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        java.lang.Throwable throwable8 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext7, throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession20 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel4, socketAddress5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position11 = null;
        java.util.Date date12 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext5, (java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol8 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder9 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext16);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) aquilaProtocolDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        java.lang.String[] strArray11 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession12 = aquilaProtocolDecoder1.getDeviceSession(channel9, socketAddress10, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        java.lang.Throwable throwable7 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext6, throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol5 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder6 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol5);
        boolean boolean7 = aquilaProtocolDecoder6.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder6.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext10);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext4, (java.lang.Object) aquilaProtocolDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        try {
            long long13 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        java.lang.Throwable throwable4 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext3, throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        try {
            long long5 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol7 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder8 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder8.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext18);
        boolean boolean20 = aquilaProtocolDecoder8.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) aquilaProtocolDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "" };
        try {
            org.traccar.DeviceSession deviceSession9 = aquilaProtocolDecoder1.getDeviceSession(channel4, socketAddress5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        boolean boolean11 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder10.getClass();
        boolean boolean15 = aquilaProtocolDecoder10.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol7 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder8 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext11);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str5 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession21 = aquilaProtocolDecoder1.getDeviceSession(channel14, socketAddress15, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        try {
            long long5 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol4 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder5 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol4);
        boolean boolean6 = aquilaProtocolDecoder5.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder5.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder5.handlerAdded(channelHandlerContext9);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext3, (java.lang.Object) aquilaProtocolDecoder5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext6, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.Channel channel5 = null;
        java.net.SocketAddress socketAddress6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel5, socketAddress6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.Channel channel2 = null;
        java.net.SocketAddress socketAddress3 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession10 = aquilaProtocolDecoder1.getDeviceSession(channel2, socketAddress3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        java.lang.Throwable throwable5 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext4, throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position7 = null;
        java.util.Date date8 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        try {
            long long6 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession11 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        java.lang.Object obj16 = new java.lang.Object();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext15, obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol17 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder18 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext21);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position5 = null;
        java.util.Date date6 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        java.lang.Throwable throwable8 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext7, throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        org.traccar.model.Position position4 = null;
        java.util.Date date5 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        try {
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        try {
            java.lang.String str17 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol5 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder6 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext9);
        boolean boolean11 = aquilaProtocolDecoder6.isSharable();
        boolean boolean12 = aquilaProtocolDecoder6.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder6.handlerRemoved(channelHandlerContext13);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext4, (java.lang.Object) channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        org.traccar.model.Position position19 = null;
        java.util.Date date20 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position19, date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        try {
            long long15 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        try {
            long long11 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol5 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder6 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext13);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext4, (java.lang.Object) aquilaProtocolDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        boolean boolean11 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder10.getClass();
        boolean boolean15 = aquilaProtocolDecoder10.isSharable();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        try {
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        try {
            long long6 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        java.lang.Throwable throwable18 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext17, throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        java.lang.Throwable throwable8 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext7, throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        try {
            long long18 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        try {
            long long8 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        boolean boolean12 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder11.getClass();
        boolean boolean16 = aquilaProtocolDecoder11.isSharable();
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder11.getClass();
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Object obj11 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Character cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        java.lang.Throwable throwable12 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext11, throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext5, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        org.traccar.model.Position position12 = null;
        java.util.Date date13 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        java.lang.String[] strArray16 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel14, socketAddress15, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        try {
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        try {
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        try {
            long long16 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        org.traccar.model.Position position6 = null;
        java.util.Date date7 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        try {
            long long8 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str5 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol5 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder6 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol5);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext4, (java.lang.Object) aquilaProtocol5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position7 = null;
        java.util.Date date8 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        java.lang.Throwable throwable14 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext13, throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext21);
        boolean boolean23 = aquilaProtocolDecoder12.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext26);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) channelHandlerContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        boolean boolean15 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext20);
        boolean boolean22 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        try {
            long long13 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        try {
            long long11 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext22);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) aquilaProtocolDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder11.getClass();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol4 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder5 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol4);
        boolean boolean6 = aquilaProtocolDecoder5.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder5.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder5.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder5.handlerAdded(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder5.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext3, (java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        boolean boolean15 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str15 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession21 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        org.traccar.model.Position position12 = null;
        java.util.Date date13 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray13 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position6 = null;
        java.util.Date date7 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.Channel channel19 = null;
        java.net.SocketAddress socketAddress20 = null;
        java.lang.String[] strArray26 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession27 = aquilaProtocolDecoder1.getDeviceSession(channel19, socketAddress20, strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel14, socketAddress15, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel5 = null;
        java.net.SocketAddress socketAddress6 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel5, socketAddress6, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext23);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol8 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder9 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol8);
        boolean boolean10 = aquilaProtocolDecoder9.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder9.getClass();
        boolean boolean14 = aquilaProtocolDecoder9.isSharable();
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder9.getClass();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder9.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) aquilaProtocolDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray9 = null;
        try {
            org.traccar.DeviceSession deviceSession10 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        boolean boolean12 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext15);
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext14, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        boolean boolean15 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder14.getClass();
        boolean boolean19 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder14.getClass();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder14.getClass();
        boolean boolean22 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext23);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        boolean boolean17 = aquilaProtocolDecoder16.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext18);
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder16.getClass();
        boolean boolean21 = aquilaProtocolDecoder16.isSharable();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder16.getClass();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder16.getClass();
        boolean boolean24 = aquilaProtocolDecoder16.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext14, (java.lang.Object) aquilaProtocolDecoder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        boolean boolean11 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext16);
        boolean boolean18 = aquilaProtocolDecoder10.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol7 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder8 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder8.isSharable();
        boolean boolean18 = aquilaProtocolDecoder8.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext6, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext3, (java.lang.Object) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext4, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        java.lang.Throwable throwable13 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext12, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext22);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) aquilaProtocolDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position9 = null;
        java.util.Date date10 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        java.lang.Throwable throwable13 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext12, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext17);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext20);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        try {
            java.lang.String str17 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext2, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession10 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession21 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        boolean boolean18 = aquilaProtocolDecoder17.isSharable();
        boolean boolean19 = aquilaProtocolDecoder17.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder17.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder17.getClass();
        boolean boolean24 = aquilaProtocolDecoder17.isSharable();
        boolean boolean25 = aquilaProtocolDecoder17.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext15, (java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        try {
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        try {
            long long5 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder10.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        java.lang.Object obj13 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol5 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder6 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol5);
        boolean boolean7 = aquilaProtocolDecoder6.isSharable();
        boolean boolean8 = aquilaProtocolDecoder6.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder6.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder6.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext4, (java.lang.Object) aquilaProtocolDecoder6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        try {
            java.lang.String str6 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext15);
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        java.lang.Throwable throwable14 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext13, throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder12.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str3 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext23);
        java.lang.Class<?> wildcardClass25 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext26);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext14);
        boolean boolean16 = aquilaProtocolDecoder13.isSharable();
        boolean boolean17 = aquilaProtocolDecoder13.isSharable();
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder13.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        org.traccar.model.Position position6 = null;
        java.util.Date date7 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) aquilaProtocol12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        boolean boolean16 = aquilaProtocolDecoder11.isSharable();
        boolean boolean17 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession10 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        java.lang.Throwable throwable4 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext3, throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        try {
            long long13 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext4, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder11.getClass();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        org.traccar.model.Position position16 = null;
        java.util.Date date17 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext14, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        boolean boolean15 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder14.getClass();
        boolean boolean19 = aquilaProtocolDecoder14.isSharable();
        boolean boolean20 = aquilaProtocolDecoder14.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) boolean20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        java.lang.Throwable throwable16 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext15, throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        boolean boolean11 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel3 = null;
        java.net.SocketAddress socketAddress4 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "" };
        try {
            org.traccar.DeviceSession deviceSession8 = aquilaProtocolDecoder1.getDeviceSession(channel3, socketAddress4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        org.traccar.model.Position position12 = null;
        java.util.Date date13 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder11.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext17);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol8 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder9 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext16);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) aquilaProtocolDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext21);
        boolean boolean23 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext18);
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        boolean boolean18 = aquilaProtocolDecoder17.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext15, (java.lang.Object) channelHandlerContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        boolean boolean8 = aquilaProtocolDecoder7.isSharable();
        boolean boolean9 = aquilaProtocolDecoder7.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder7.getClass();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder7.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext5, (java.lang.Object) aquilaProtocolDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        java.lang.Throwable throwable12 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext11, throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext19);
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        boolean boolean13 = aquilaProtocolDecoder12.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext18);
        boolean boolean20 = aquilaProtocolDecoder12.isSharable();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder12.getClass();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder12.getClass();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        try {
            long long11 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        try {
            long long16 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder12.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext14);
        boolean boolean16 = aquilaProtocolDecoder7.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext17);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext5, (java.lang.Object) aquilaProtocolDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol18 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder19 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol18);
        boolean boolean20 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder19.getClass();
        boolean boolean24 = aquilaProtocolDecoder19.isSharable();
        java.lang.Class<?> wildcardClass25 = aquilaProtocolDecoder19.getClass();
        boolean boolean26 = aquilaProtocolDecoder19.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext17, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position5 = null;
        java.util.Date date6 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel13, socketAddress14, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext21);
        boolean boolean23 = aquilaProtocolDecoder10.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.Channel channel17 = null;
        java.net.SocketAddress socketAddress18 = null;
        java.lang.String[] strArray19 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession20 = aquilaProtocolDecoder1.getDeviceSession(channel17, socketAddress18, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str17 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        org.traccar.model.Position position17 = null;
        java.util.Date date18 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext15);
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol7 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder8 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext9);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) aquilaProtocolDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray12 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        try {
            java.lang.String str6 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession11 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext27);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext14, (java.lang.Object) aquilaProtocolDecoder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

