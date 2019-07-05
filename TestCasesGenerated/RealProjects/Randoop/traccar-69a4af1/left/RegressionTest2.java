import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
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
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder8.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext24);
        java.lang.Class<?> wildcardClass26 = aquilaProtocolDecoder8.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) wildcardClass26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        boolean boolean17 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position18 = null;
        java.util.Date date19 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position18, date19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
            java.lang.String str15 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        try {
            long long13 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        try {
            long long11 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        boolean boolean8 = aquilaProtocolDecoder7.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder7.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder7.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext19);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext5, (java.lang.Object) channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol20 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder21 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext30);
        java.lang.Class<?> wildcardClass32 = aquilaProtocolDecoder21.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext19, (java.lang.Object) aquilaProtocolDecoder21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder10.getClass();
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession20 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "", "", "" };
        try {
            org.traccar.DeviceSession deviceSession22 = aquilaProtocolDecoder1.getDeviceSession(channel14, socketAddress15, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        java.lang.Throwable throwable17 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext16, throwable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        boolean boolean20 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position21 = null;
        java.util.Date date22 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position21, date22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        try {
            long long13 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        org.traccar.model.Position position9 = null;
        java.util.Date date10 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        try {
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position13 = null;
        java.util.Date date14 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        try {
            java.lang.String str15 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession21 = aquilaProtocolDecoder1.getDeviceSession(channel13, socketAddress14, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession23 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        try {
            java.lang.String str15 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext18);
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder15.getClass();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) aquilaProtocolDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        java.lang.Throwable throwable6 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext5, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol7 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder8 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext9);
        boolean boolean11 = aquilaProtocolDecoder8.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder8.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext15);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
            long long18 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder1.getClass();
        boolean boolean23 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel24 = null;
        java.net.SocketAddress socketAddress25 = null;
        java.lang.String[] strArray30 = new java.lang.String[] { "", "", "", "" };
        try {
            org.traccar.DeviceSession deviceSession31 = aquilaProtocolDecoder1.getDeviceSession(channel24, socketAddress25, strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol22 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder23 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder23.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder23.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder23.handlerRemoved(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder23.handlerAdded(channelHandlerContext30);
        io.netty.channel.ChannelHandlerContext channelHandlerContext32 = null;
        aquilaProtocolDecoder23.handlerAdded(channelHandlerContext32);
        java.lang.Class<?> wildcardClass34 = aquilaProtocolDecoder23.getClass();
        java.lang.Class<?> wildcardClass35 = aquilaProtocolDecoder23.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext36 = null;
        aquilaProtocolDecoder23.handlerRemoved(channelHandlerContext36);
        boolean boolean38 = aquilaProtocolDecoder23.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext21, (java.lang.Object) boolean38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext16);
        boolean boolean18 = aquilaProtocolDecoder9.isSharable();
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder9.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext20);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext7, (java.lang.Object) aquilaProtocolDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        try {
            java.lang.String str17 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext24);
        java.lang.Class<?> wildcardClass26 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) wildcardClass15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol21 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder22 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext25);
        java.lang.Class<?> wildcardClass27 = aquilaProtocolDecoder22.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext28);
        boolean boolean30 = aquilaProtocolDecoder22.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext20, (java.lang.Object) boolean30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        boolean boolean22 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) channelHandlerContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        try {
            long long15 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        boolean boolean14 = aquilaProtocolDecoder13.isSharable();
        boolean boolean15 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext11, (java.lang.Object) channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.Channel channel16 = null;
        java.net.SocketAddress socketAddress17 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession23 = aquilaProtocolDecoder1.getDeviceSession(channel16, socketAddress17, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel9, socketAddress10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        boolean boolean14 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder13.isSharable();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder13.getClass();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder13.getClass();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder13.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) aquilaProtocolDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol20 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder21 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext30);
        java.lang.Class<?> wildcardClass32 = aquilaProtocolDecoder21.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext19, (java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        try {
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
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
        boolean boolean20 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext23);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol19 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder20 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder20.handlerRemoved(channelHandlerContext25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext27);
        io.netty.channel.ChannelHandlerContext channelHandlerContext29 = null;
        aquilaProtocolDecoder20.handlerRemoved(channelHandlerContext29);
        io.netty.channel.ChannelHandlerContext channelHandlerContext31 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext31);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext18, (java.lang.Object) aquilaProtocolDecoder20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
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
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        try {
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        org.traccar.model.Position position15 = null;
        java.util.Date date16 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext16);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession24 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel16 = null;
        java.net.SocketAddress socketAddress17 = null;
        java.lang.String[] strArray21 = new java.lang.String[] { "", "", "" };
        try {
            org.traccar.DeviceSession deviceSession22 = aquilaProtocolDecoder1.getDeviceSession(channel16, socketAddress17, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder13.getClass();
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder13.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext11, (java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        boolean boolean8 = aquilaProtocolDecoder7.isSharable();
        boolean boolean9 = aquilaProtocolDecoder7.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder7.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder7.getClass();
        boolean boolean14 = aquilaProtocolDecoder7.isSharable();
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder7.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext5, (java.lang.Object) aquilaProtocolDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        boolean boolean15 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol17 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder18 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext25);
        boolean boolean27 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext28);
        boolean boolean30 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext31 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext31);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) channelHandlerContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        boolean boolean12 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext19);
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        java.lang.Throwable throwable8 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext7, throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext21);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext14, (java.lang.Object) aquilaProtocolDecoder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        boolean boolean15 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol17 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder18 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext22);
        boolean boolean24 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) aquilaProtocolDecoder18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        java.lang.Throwable throwable16 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext15, throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray8 = null;
        try {
            org.traccar.DeviceSession deviceSession9 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext22);
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        try {
            long long11 = aquilaProtocolDecoder1.addUnknownDevice("");
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        java.lang.Throwable throwable14 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext13, throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        java.lang.Throwable throwable20 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext19, throwable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "", "", "", "" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel9, socketAddress10, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        try {
            java.lang.String str17 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol7 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder8 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol7);
        boolean boolean9 = aquilaProtocolDecoder8.isSharable();
        boolean boolean10 = aquilaProtocolDecoder8.isSharable();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder8.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder8.getClass();
        boolean boolean15 = aquilaProtocolDecoder8.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext16);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol18 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder19 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol18);
        boolean boolean20 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext21);
        boolean boolean23 = aquilaProtocolDecoder19.isSharable();
        boolean boolean24 = aquilaProtocolDecoder19.isSharable();
        java.lang.Class<?> wildcardClass25 = aquilaProtocolDecoder19.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext17, (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position12 = null;
        java.util.Date date13 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Class<?> wildcardClass14 = obj12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext11, (java.lang.Object) wildcardClass14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        try {
            long long18 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder1.getClass();
        boolean boolean20 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position7 = null;
        java.util.Date date8 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        org.traccar.model.Position position11 = null;
        java.util.Date date12 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position11, date12);
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        java.lang.String[] strArray25 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession26 = aquilaProtocolDecoder1.getDeviceSession(channel17, socketAddress18, strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        boolean boolean17 = aquilaProtocolDecoder1.isSharable();
        try {
            long long19 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder8.isSharable();
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder8.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder8.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext24);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) channelHandlerContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder13.isSharable();
        boolean boolean20 = aquilaProtocolDecoder13.isSharable();
        boolean boolean21 = aquilaProtocolDecoder13.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext11, (java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol20 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder21 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext22);
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder21.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext27);
        boolean boolean29 = aquilaProtocolDecoder21.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext19, (java.lang.Object) boolean29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext23);
        boolean boolean25 = aquilaProtocolDecoder12.isSharable();
        java.lang.Class<?> wildcardClass26 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext27);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        boolean boolean16 = aquilaProtocolDecoder15.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext21);
        boolean boolean23 = aquilaProtocolDecoder15.isSharable();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext13, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        boolean boolean18 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position15 = null;
        java.util.Date date16 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        boolean boolean17 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        boolean boolean20 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext21);
        try {
            java.lang.String str23 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
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
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext22);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
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
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        org.traccar.model.Position position10 = null;
        java.util.Date date11 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position10, date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        java.lang.Throwable throwable12 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext11, throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "", "" };
        try {
            org.traccar.DeviceSession deviceSession21 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder12.isSharable();
        boolean boolean18 = aquilaProtocolDecoder12.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        try {
            long long15 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str20 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol20 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder21 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext30);
        io.netty.channel.ChannelHandlerContext channelHandlerContext32 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext32);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext19, (java.lang.Object) aquilaProtocolDecoder21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext18);
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        try {
            long long16 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        java.lang.Object obj17 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext16, obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder1.getClass();
        try {
            long long22 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext16);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol17 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder18 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext27);
        java.lang.Class<?> wildcardClass29 = aquilaProtocolDecoder18.getClass();
        java.lang.Class<?> wildcardClass30 = aquilaProtocolDecoder18.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext31 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext31);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) channelHandlerContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        java.lang.Throwable throwable13 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext12, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        java.lang.String[] strArray15 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession16 = aquilaProtocolDecoder1.getDeviceSession(channel13, socketAddress14, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        boolean boolean15 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol17 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder18 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol17);
        boolean boolean19 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext30);
        io.netty.channel.ChannelHandlerContext channelHandlerContext32 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext32);
        java.lang.Class<?> wildcardClass34 = aquilaProtocolDecoder18.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) aquilaProtocolDecoder18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position4 = null;
        java.util.Date date5 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol9 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder10 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol9);
        boolean boolean11 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext18);
        boolean boolean20 = aquilaProtocolDecoder10.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        boolean boolean17 = aquilaProtocolDecoder16.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder16.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext14, (java.lang.Object) aquilaProtocolDecoder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        boolean boolean12 = aquilaProtocolDecoder10.isSharable();
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder10.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext16);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        boolean boolean18 = aquilaProtocolDecoder1.isSharable();
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext24);
        boolean boolean26 = aquilaProtocolDecoder12.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel5 = null;
        java.net.SocketAddress socketAddress6 = null;
        java.lang.String[] strArray7 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession8 = aquilaProtocolDecoder1.getDeviceSession(channel5, socketAddress6, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        java.lang.Throwable throwable8 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext7, throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol8 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder9 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder9.isSharable();
        boolean boolean15 = aquilaProtocolDecoder9.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext20);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext7, (java.lang.Object) channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel9, socketAddress10, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol20 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder21 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder21.handlerRemoved(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder21.handlerAdded(channelHandlerContext28);
        java.lang.Class<?> wildcardClass30 = aquilaProtocolDecoder21.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext19, (java.lang.Object) aquilaProtocolDecoder21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        java.lang.Throwable throwable6 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext5, throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
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
        java.lang.Class<?> wildcardClass26 = aquilaProtocolDecoder19.getClass();
        boolean boolean27 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext28);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext17, (java.lang.Object) aquilaProtocolDecoder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder7.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext23);
        java.lang.Class<?> wildcardClass25 = aquilaProtocolDecoder7.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext5, (java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol19 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder20 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol19);
        boolean boolean21 = aquilaProtocolDecoder20.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder20.handlerRemoved(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext24);
        java.lang.Class<?> wildcardClass26 = aquilaProtocolDecoder20.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext27);
        java.lang.Class<?> wildcardClass29 = aquilaProtocolDecoder20.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext18, (java.lang.Object) aquilaProtocolDecoder20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext24);
        boolean boolean26 = aquilaProtocolDecoder13.isSharable();
        java.lang.Class<?> wildcardClass27 = aquilaProtocolDecoder13.getClass();
        java.lang.Class<?> wildcardClass28 = aquilaProtocolDecoder13.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.lang.Throwable throwable14 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext13, throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder12.isSharable();
        boolean boolean18 = aquilaProtocolDecoder12.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext21);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        java.lang.Throwable throwable16 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext15, throwable16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext24);
        boolean boolean26 = aquilaProtocolDecoder17.isSharable();
        boolean boolean27 = aquilaProtocolDecoder17.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext30);
        io.netty.channel.ChannelHandlerContext channelHandlerContext32 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext32);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext15, (java.lang.Object) channelHandlerContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder13.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder13.isSharable();
        boolean boolean22 = aquilaProtocolDecoder13.isSharable();
        boolean boolean23 = aquilaProtocolDecoder13.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        boolean boolean15 = aquilaProtocolDecoder10.isSharable();
        boolean boolean16 = aquilaProtocolDecoder10.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext21);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
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
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext25);
        java.lang.Class<?> wildcardClass27 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext28);
        java.lang.Class<?> wildcardClass30 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) wildcardClass30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        try {
            long long17 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel18 = null;
        java.net.SocketAddress socketAddress19 = null;
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession23 = aquilaProtocolDecoder1.getDeviceSession(channel18, socketAddress19, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        boolean boolean8 = aquilaProtocolDecoder7.isSharable();
        boolean boolean9 = aquilaProtocolDecoder7.isSharable();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder7.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext5, (java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel5 = null;
        java.net.SocketAddress socketAddress6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel5, socketAddress6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        java.lang.Throwable throwable14 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext13, throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder11.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder11.getClass();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
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
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext16);
        boolean boolean18 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
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
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        try {
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        java.lang.Throwable throwable18 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext17, throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        java.lang.Throwable throwable14 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext13, throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        try {
            java.lang.String str16 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext20);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        boolean boolean20 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder13.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext21);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext11, (java.lang.Object) aquilaProtocolDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol18 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder19 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol18);
        boolean boolean20 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext21);
        boolean boolean23 = aquilaProtocolDecoder19.isSharable();
        boolean boolean24 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext25);
        boolean boolean27 = aquilaProtocolDecoder19.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext17, (java.lang.Object) aquilaProtocolDecoder19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        java.lang.Throwable throwable8 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext7, throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
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
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext3);
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        org.traccar.model.Position position17 = null;
        java.util.Date date18 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession12 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder1.getClass();
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        try {
            java.lang.String str11 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder17.getClass();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder17.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext15, (java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        org.traccar.model.Position position15 = null;
        java.util.Date date16 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        boolean boolean16 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        org.traccar.model.Position position12 = null;
        java.util.Date date13 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        try {
            long long15 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.Throwable throwable13 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext12, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol17 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder18 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol17);
        boolean boolean19 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext20);
        boolean boolean22 = aquilaProtocolDecoder18.isSharable();
        boolean boolean23 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext24);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) aquilaProtocolDecoder18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        java.lang.Object obj14 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext10);
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        java.lang.Throwable throwable12 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext11, throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        org.traccar.model.Position position12 = null;
        java.util.Date date13 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        try {
            long long20 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        try {
            long long16 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position23 = null;
        java.util.Date date24 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position23, date24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        boolean boolean18 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession11 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        boolean boolean17 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol4 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder5 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder5.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder5.handlerAdded(channelHandlerContext8);
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder5.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder5.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder5.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext3, (java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        boolean boolean9 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol17 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder18 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext21);
        boolean boolean23 = aquilaProtocolDecoder18.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext26);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) channelHandlerContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext19);
        try {
            java.lang.String str21 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext15);
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext20);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol24 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder25 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder25.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder25.handlerAdded(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder25.handlerAdded(channelHandlerContext30);
        io.netty.channel.ChannelHandlerContext channelHandlerContext32 = null;
        aquilaProtocolDecoder25.handlerAdded(channelHandlerContext32);
        boolean boolean34 = aquilaProtocolDecoder25.isSharable();
        boolean boolean35 = aquilaProtocolDecoder25.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext36 = null;
        aquilaProtocolDecoder25.handlerRemoved(channelHandlerContext36);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext23, (java.lang.Object) channelHandlerContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        io.netty.channel.Channel channel16 = null;
        java.net.SocketAddress socketAddress17 = null;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession25 = aquilaProtocolDecoder1.getDeviceSession(channel16, socketAddress17, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol18 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder19 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext20);
        boolean boolean22 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext23);
        boolean boolean25 = aquilaProtocolDecoder19.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext17, (java.lang.Object) boolean25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext8);
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        boolean boolean24 = aquilaProtocolDecoder15.isSharable();
        boolean boolean25 = aquilaProtocolDecoder15.isSharable();
        boolean boolean26 = aquilaProtocolDecoder15.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext13, (java.lang.Object) aquilaProtocolDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext22, (java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str16 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext12);
        java.lang.Class<?> wildcardClass14 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext8);
        boolean boolean10 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext11);
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder1.isSharable();
        boolean boolean20 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext21);
        try {
            long long24 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
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
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder10.getClass();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder10.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext23);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder12.isSharable();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession12 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder1.getClass();
        boolean boolean13 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder1.getClass();
        try {
            long long11 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
        java.lang.Throwable throwable17 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext16, throwable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol3 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder4 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder4.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder4.isSharable();
        boolean boolean8 = aquilaProtocolDecoder4.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder4.getClass();
        boolean boolean10 = aquilaProtocolDecoder4.isSharable();
        boolean boolean11 = aquilaProtocolDecoder4.isSharable();
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder4.getClass();
        java.lang.Class<?> wildcardClass13 = aquilaProtocolDecoder4.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext2, (java.lang.Object) aquilaProtocolDecoder4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        org.traccar.model.Position position7 = null;
        java.util.Date date8 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        try {
            java.lang.String str16 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol24 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder25 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder25.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder25.handlerAdded(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder25.handlerRemoved(channelHandlerContext30);
        io.netty.channel.ChannelHandlerContext channelHandlerContext32 = null;
        aquilaProtocolDecoder25.handlerRemoved(channelHandlerContext32);
        io.netty.channel.ChannelHandlerContext channelHandlerContext34 = null;
        aquilaProtocolDecoder25.handlerRemoved(channelHandlerContext34);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext23, (java.lang.Object) channelHandlerContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.Channel channel19 = null;
        java.net.SocketAddress socketAddress20 = null;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        try {
            org.traccar.DeviceSession deviceSession28 = aquilaProtocolDecoder1.getDeviceSession(channel19, socketAddress20, strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        boolean boolean12 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext9);
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        boolean boolean14 = aquilaProtocolDecoder11.isSharable();
        boolean boolean15 = aquilaProtocolDecoder11.isSharable();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder11.getClass();
        boolean boolean17 = aquilaProtocolDecoder11.isSharable();
        boolean boolean18 = aquilaProtocolDecoder11.isSharable();
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol25 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder26 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder26.handlerAdded(channelHandlerContext27);
        io.netty.channel.ChannelHandlerContext channelHandlerContext29 = null;
        aquilaProtocolDecoder26.handlerAdded(channelHandlerContext29);
        io.netty.channel.ChannelHandlerContext channelHandlerContext31 = null;
        aquilaProtocolDecoder26.handlerAdded(channelHandlerContext31);
        io.netty.channel.ChannelHandlerContext channelHandlerContext33 = null;
        aquilaProtocolDecoder26.handlerRemoved(channelHandlerContext33);
        io.netty.channel.ChannelHandlerContext channelHandlerContext35 = null;
        aquilaProtocolDecoder26.handlerAdded(channelHandlerContext35);
        boolean boolean37 = aquilaProtocolDecoder26.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext38 = null;
        aquilaProtocolDecoder26.handlerRemoved(channelHandlerContext38);
        io.netty.channel.ChannelHandlerContext channelHandlerContext40 = null;
        aquilaProtocolDecoder26.handlerRemoved(channelHandlerContext40);
        io.netty.channel.ChannelHandlerContext channelHandlerContext42 = null;
        aquilaProtocolDecoder26.handlerRemoved(channelHandlerContext42);
        io.netty.channel.ChannelHandlerContext channelHandlerContext44 = null;
        aquilaProtocolDecoder26.handlerAdded(channelHandlerContext44);
        java.lang.Class<?> wildcardClass46 = aquilaProtocolDecoder26.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext24, (java.lang.Object) aquilaProtocolDecoder26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

