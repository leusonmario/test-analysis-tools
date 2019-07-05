import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        try {
            java.lang.String str21 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext16, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        java.lang.Throwable throwable9 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext8, throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext6, (java.lang.Object) aquilaProtocolDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder6.handlerAdded(channelHandlerContext13);
        boolean boolean15 = aquilaProtocolDecoder6.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder6.handlerRemoved(channelHandlerContext16);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext4, (java.lang.Object) channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        boolean boolean16 = aquilaProtocolDecoder11.isSharable();
        boolean boolean17 = aquilaProtocolDecoder11.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext22);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel9, socketAddress10, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext15);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext22);
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder13.getClass();
        java.lang.Class<?> wildcardClass25 = aquilaProtocolDecoder13.getClass();
        boolean boolean26 = aquilaProtocolDecoder13.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) boolean26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext17);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext14, (java.lang.Object) aquilaProtocolDecoder16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.lang.Throwable throwable17 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext16, throwable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.traccar.model.Position position11 = null;
        java.util.Date date12 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession24 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.Channel channel6 = null;
        java.net.SocketAddress socketAddress7 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel6, socketAddress7, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        java.lang.Throwable throwable20 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext19, throwable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        boolean boolean16 = aquilaProtocolDecoder15.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder15.getClass();
        boolean boolean20 = aquilaProtocolDecoder15.isSharable();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder15.getClass();
        boolean boolean22 = aquilaProtocolDecoder15.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder12.isSharable();
        boolean boolean18 = aquilaProtocolDecoder12.isSharable();
        boolean boolean19 = aquilaProtocolDecoder12.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder10.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext26);
        boolean boolean28 = aquilaProtocolDecoder10.isSharable();
        java.lang.Class<?> wildcardClass29 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        boolean boolean16 = aquilaProtocolDecoder15.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder15.getClass();
        boolean boolean20 = aquilaProtocolDecoder15.isSharable();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder15.getClass();
        boolean boolean22 = aquilaProtocolDecoder15.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext13, (java.lang.Object) boolean22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        boolean boolean8 = aquilaProtocolDecoder7.isSharable();
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder7.getClass();
        boolean boolean10 = aquilaProtocolDecoder7.isSharable();
        boolean boolean11 = aquilaProtocolDecoder7.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext5, (java.lang.Object) aquilaProtocolDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position6 = null;
        java.util.Date date7 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        try {
            long long15 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        org.traccar.model.Position position11 = null;
        java.util.Date date12 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position11, date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
            long long16 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.String[] strArray13 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol4 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder5 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol4);
        boolean boolean6 = aquilaProtocolDecoder5.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder5.handlerRemoved(channelHandlerContext7);
        java.lang.Class<?> wildcardClass9 = aquilaProtocolDecoder5.getClass();
        boolean boolean10 = aquilaProtocolDecoder5.isSharable();
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder5.getClass();
        java.lang.Class<?> wildcardClass12 = aquilaProtocolDecoder5.getClass();
        boolean boolean13 = aquilaProtocolDecoder5.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder5.handlerRemoved(channelHandlerContext14);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext3, (java.lang.Object) channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession24 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) ' ');
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol18 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder19 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol18);
        boolean boolean20 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext23);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext17, (java.lang.Object) channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession11 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        org.traccar.model.Position position16 = null;
        java.util.Date date17 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        boolean boolean14 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        boolean boolean16 = aquilaProtocolDecoder15.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder15.getClass();
        boolean boolean20 = aquilaProtocolDecoder15.isSharable();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext13, (java.lang.Object) aquilaProtocolDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession20 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        org.traccar.model.Position position17 = null;
        java.util.Date date18 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext9);
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        io.netty.channel.Channel channel16 = null;
        java.net.SocketAddress socketAddress17 = null;
        java.lang.String[] strArray18 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel16, socketAddress17, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        try {
            long long17 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
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
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder9.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        boolean boolean23 = aquilaProtocolDecoder10.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        try {
            java.lang.String str19 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) aquilaProtocolDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        try {
            long long15 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        try {
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext20);
        boolean boolean22 = aquilaProtocolDecoder13.isSharable();
        boolean boolean23 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext24);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) channelHandlerContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext24);
        java.lang.Class<?> wildcardClass26 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) aquilaProtocolDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        try {
            long long20 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        try {
            long long16 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder10.handlerAdded(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder10.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder10.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder14.isSharable();
        boolean boolean18 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        java.lang.Throwable throwable18 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext17, throwable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        try {
            java.lang.String str11 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession12 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        boolean boolean13 = aquilaProtocolDecoder12.isSharable();
        boolean boolean14 = aquilaProtocolDecoder12.isSharable();
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder12.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext21);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext13);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
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
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext7, (java.lang.Object) aquilaProtocolDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        boolean boolean10 = aquilaProtocolDecoder9.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext13);
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder9.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext16);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) aquilaProtocolDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder16.isSharable();
        boolean boolean22 = aquilaProtocolDecoder16.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext23);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext14, (java.lang.Object) aquilaProtocolDecoder16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        boolean boolean15 = aquilaProtocolDecoder14.isSharable();
        boolean boolean16 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder14.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext18);
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder14.getClass();
        boolean boolean21 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext22);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) channelHandlerContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position6 = null;
        java.util.Date date7 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        try {
            java.lang.String str15 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
        try {
            long long4 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext16);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) channelHandlerContext16);
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder10.handlerRemoved(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) aquilaProtocolDecoder10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        boolean boolean8 = aquilaProtocolDecoder7.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext9);
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder7.handlerAdded(channelHandlerContext13);
        boolean boolean15 = aquilaProtocolDecoder7.isSharable();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder7.getClass();
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder7.getClass();
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder7.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext5, (java.lang.Object) aquilaProtocolDecoder7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        java.lang.Throwable throwable20 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext19, throwable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        org.traccar.model.Position position13 = null;
        java.util.Date date14 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder13.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext11, (java.lang.Object) aquilaProtocolDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.Object obj16 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext15, obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext8, (java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol8 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder9 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol8);
        boolean boolean10 = aquilaProtocolDecoder9.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext17);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        boolean boolean17 = aquilaProtocolDecoder16.isSharable();
        boolean boolean18 = aquilaProtocolDecoder16.isSharable();
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder16.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder16.getClass();
        boolean boolean23 = aquilaProtocolDecoder16.isSharable();
        boolean boolean24 = aquilaProtocolDecoder16.isSharable();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext14, (java.lang.Object) aquilaProtocolDecoder16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        boolean boolean26 = aquilaProtocolDecoder18.isSharable();
        java.lang.Class<?> wildcardClass27 = aquilaProtocolDecoder18.getClass();
        java.lang.Class<?> wildcardClass28 = aquilaProtocolDecoder18.getClass();
        java.lang.Class<?> wildcardClass29 = aquilaProtocolDecoder18.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext30);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext16, (java.lang.Object) channelHandlerContext30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("");
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        java.lang.Class<?> wildcardClass32 = aquilaProtocolDecoder18.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) wildcardClass32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        java.lang.Throwable throwable22 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext21, throwable22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        io.netty.channel.Channel channel11 = null;
        java.net.SocketAddress socketAddress12 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel11, socketAddress12, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol18 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder19 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol18);
        boolean boolean20 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext23);
        boolean boolean25 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext26);
        java.lang.Class<?> wildcardClass28 = aquilaProtocolDecoder19.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext17, (java.lang.Object) aquilaProtocolDecoder19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        try {
            long long8 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext23);
        boolean boolean25 = aquilaProtocolDecoder16.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext28);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext14, (java.lang.Object) channelHandlerContext28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        java.lang.Throwable throwable11 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext10, throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        try {
            long long20 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder14.isSharable();
        boolean boolean20 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) channelHandlerContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        boolean boolean18 = aquilaProtocolDecoder17.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext19);
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder17.getClass();
        boolean boolean22 = aquilaProtocolDecoder17.isSharable();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder17.getClass();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder17.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext15, (java.lang.Object) aquilaProtocolDecoder17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position6 = null;
        java.util.Date date7 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        boolean boolean18 = aquilaProtocolDecoder17.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext19);
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder17.getClass();
        boolean boolean22 = aquilaProtocolDecoder17.isSharable();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder17.getClass();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder17.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext15, (java.lang.Object) aquilaProtocolDecoder17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
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
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        java.lang.Object obj8 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext7, obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        org.traccar.model.Position position17 = null;
        java.util.Date date18 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        boolean boolean15 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder14.getClass();
        boolean boolean19 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder14.getClass();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
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
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        java.lang.Throwable throwable17 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext16, throwable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray14 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        org.traccar.model.Position position12 = null;
        java.util.Date date13 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position12, date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
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
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position9 = null;
        java.util.Date date10 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        try {
            java.lang.String str15 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        try {
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        io.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel13, socketAddress14, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        boolean boolean8 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position9 = null;
        java.util.Date date10 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position8 = null;
        java.util.Date date9 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        io.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel9, socketAddress10, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
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
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder9.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext7, (java.lang.Object) aquilaProtocolDecoder9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
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
            aquilaProtocolDecoder1.channelRead(channelHandlerContext7, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        try {
            long long13 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel5 = null;
        java.net.SocketAddress socketAddress6 = null;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession11 = aquilaProtocolDecoder1.getDeviceSession(channel5, socketAddress6, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.traccar.model.Position position13 = null;
        java.util.Date date14 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position13, date14);
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        try {
            long long17 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.lang.Class<?> wildcardClass11 = aquilaProtocolDecoder1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        org.traccar.model.Position position13 = null;
        java.util.Date date14 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext15, (java.lang.Object) channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext25);
        boolean boolean27 = aquilaProtocolDecoder16.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext30);
        io.netty.channel.ChannelHandlerContext channelHandlerContext32 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext32);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext14, (java.lang.Object) channelHandlerContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol11 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder12 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol11);
        boolean boolean13 = aquilaProtocolDecoder12.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext14);
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        try {
            java.lang.String str22 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.traccar.model.Position position15 = null;
        java.util.Date date16 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position15, date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position7 = null;
        java.util.Date date8 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        try {
            long long14 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        org.traccar.model.Position position22 = null;
        java.util.Date date23 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position22, date23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        org.traccar.model.Position position7 = null;
        java.util.Date date8 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext25);
        boolean boolean27 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass28 = aquilaProtocolDecoder14.getClass();
        java.lang.Class<?> wildcardClass29 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        try {
            java.lang.String str16 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        io.netty.channel.Channel channel9 = null;
        java.net.SocketAddress socketAddress10 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel9, socketAddress10, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str5 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol18 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder19 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext28);
        io.netty.channel.ChannelHandlerContext channelHandlerContext30 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext30);
        java.lang.Class<?> wildcardClass32 = aquilaProtocolDecoder19.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext33 = null;
        aquilaProtocolDecoder19.handlerAdded(channelHandlerContext33);
        io.netty.channel.ChannelHandlerContext channelHandlerContext35 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext35);
        boolean boolean37 = aquilaProtocolDecoder19.isSharable();
        boolean boolean38 = aquilaProtocolDecoder19.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext39 = null;
        aquilaProtocolDecoder19.handlerRemoved(channelHandlerContext39);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext17, (java.lang.Object) channelHandlerContext39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        boolean boolean17 = aquilaProtocolDecoder16.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext20);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext14, (java.lang.Object) channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel5 = null;
        java.net.SocketAddress socketAddress6 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel5, socketAddress6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext23);
        java.lang.Class<?> wildcardClass25 = aquilaProtocolDecoder14.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext26);
        io.netty.channel.ChannelHandlerContext channelHandlerContext28 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext28);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext14);
        boolean boolean16 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext20);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        boolean boolean15 = aquilaProtocolDecoder14.isSharable();
        boolean boolean16 = aquilaProtocolDecoder14.isSharable();
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder14.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext18);
        java.lang.Class<?> wildcardClass20 = aquilaProtocolDecoder14.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.lang.Class<?> wildcardClass15 = aquilaProtocolDecoder5.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext3, (java.lang.Object) aquilaProtocolDecoder5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        java.lang.Object obj24 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext23, obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol15 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder16 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder16.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder16.handlerRemoved(channelHandlerContext23);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext14, (java.lang.Object) channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
            long long11 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext19, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) 100);
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        try {
            java.lang.String str17 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder13.getClass();
        java.lang.Class<?> wildcardClass25 = aquilaProtocolDecoder13.getClass();
        boolean boolean26 = aquilaProtocolDecoder13.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) aquilaProtocolDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
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
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        java.lang.Object obj5 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext4, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession17 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position5 = null;
        java.util.Date date6 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        java.lang.Throwable throwable13 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext12, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        try {
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession12 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        try {
            long long5 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext14, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext26);
        java.lang.Class<?> wildcardClass28 = aquilaProtocolDecoder17.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext15, (java.lang.Object) aquilaProtocolDecoder17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext8, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.lang.Throwable throwable15 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext14, throwable15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        org.traccar.model.Position position13 = null;
        java.util.Date date14 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position13, date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        try {
            long long5 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        org.traccar.model.Position position7 = null;
        java.util.Date date8 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        boolean boolean16 = aquilaProtocolDecoder15.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        java.lang.Class<?> wildcardClass2 = aquilaProtocolDecoder1.getClass();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        java.lang.Throwable throwable12 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext11, throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext29);
        io.netty.channel.ChannelHandlerContext channelHandlerContext31 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext31);
        java.lang.Class<?> wildcardClass33 = aquilaProtocolDecoder20.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext34 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext34);
        io.netty.channel.ChannelHandlerContext channelHandlerContext36 = null;
        aquilaProtocolDecoder20.handlerRemoved(channelHandlerContext36);
        boolean boolean38 = aquilaProtocolDecoder20.isSharable();
        boolean boolean39 = aquilaProtocolDecoder20.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext40 = null;
        aquilaProtocolDecoder20.handlerRemoved(channelHandlerContext40);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext18, (java.lang.Object) aquilaProtocolDecoder20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        try {
            long long16 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        boolean boolean13 = aquilaProtocolDecoder12.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder12.handlerRemoved(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        try {
            long long17 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext9);
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        java.lang.Object obj12 = null;
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext13);
        io.netty.channel.Channel channel15 = null;
        java.net.SocketAddress socketAddress16 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel15, socketAddress16, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        org.traccar.model.Position position17 = null;
        java.util.Date date18 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) channelHandlerContext18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
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
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext12);
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext26);
        boolean boolean28 = aquilaProtocolDecoder15.isSharable();
        java.lang.Class<?> wildcardClass29 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) aquilaProtocolDecoder15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        try {
            java.lang.String str13 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext17, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext7);
        org.traccar.model.Position position9 = null;
        java.util.Date date10 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext22);
        boolean boolean24 = aquilaProtocolDecoder15.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext25);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext13, (java.lang.Object) channelHandlerContext25);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        boolean boolean15 = aquilaProtocolDecoder12.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext18);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        try {
            java.lang.String str7 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol6 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder7 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol6);
        boolean boolean8 = aquilaProtocolDecoder7.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext9 = null;
        aquilaProtocolDecoder7.handlerRemoved(channelHandlerContext9);
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass6 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext7);
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        boolean boolean16 = aquilaProtocolDecoder11.isSharable();
        boolean boolean17 = aquilaProtocolDecoder11.isSharable();
        boolean boolean18 = aquilaProtocolDecoder11.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        io.netty.channel.Channel channel22 = null;
        java.net.SocketAddress socketAddress23 = null;
        java.lang.String[] strArray24 = new java.lang.String[] {};
        try {
            org.traccar.DeviceSession deviceSession25 = aquilaProtocolDecoder1.getDeviceSession(channel22, socketAddress23, strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        io.netty.channel.Channel channel12 = null;
        java.net.SocketAddress socketAddress13 = null;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession21 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext26);
        java.lang.Class<?> wildcardClass28 = aquilaProtocolDecoder15.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext29 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext29);
        io.netty.channel.ChannelHandlerContext channelHandlerContext31 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext31);
        boolean boolean33 = aquilaProtocolDecoder15.isSharable();
        java.lang.Class<?> wildcardClass34 = aquilaProtocolDecoder15.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext13, (java.lang.Object) wildcardClass34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.lang.Throwable throwable13 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext12, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        java.lang.Throwable throwable13 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext12, throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        boolean boolean15 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str16 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        try {
            long long7 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol12 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder13 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol12);
        boolean boolean14 = aquilaProtocolDecoder13.isSharable();
        boolean boolean15 = aquilaProtocolDecoder13.isSharable();
        java.lang.Class<?> wildcardClass16 = aquilaProtocolDecoder13.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext17);
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder13.getClass();
        boolean boolean20 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder13.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) aquilaProtocolDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol19 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder20 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol19);
        boolean boolean21 = aquilaProtocolDecoder20.isSharable();
        boolean boolean22 = aquilaProtocolDecoder20.isSharable();
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder20.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder20.handlerAdded(channelHandlerContext24);
        io.netty.channel.ChannelHandlerContext channelHandlerContext26 = null;
        aquilaProtocolDecoder20.handlerRemoved(channelHandlerContext26);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext18, (java.lang.Object) aquilaProtocolDecoder20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        boolean boolean18 = aquilaProtocolDecoder17.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder17.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext22);
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder17.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext15, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext16);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        try {
            java.lang.String str17 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.lang.Throwable throwable12 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext11, throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        io.netty.channel.Channel channel14 = null;
        java.net.SocketAddress socketAddress15 = null;
        java.lang.String[] strArray18 = new java.lang.String[] { "", "" };
        try {
            org.traccar.DeviceSession deviceSession19 = aquilaProtocolDecoder1.getDeviceSession(channel14, socketAddress15, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        org.traccar.model.Position position16 = null;
        java.util.Date date17 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str9 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder18.handlerRemoved(channelHandlerContext27);
        java.lang.Class<?> wildcardClass29 = aquilaProtocolDecoder18.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext16, (java.lang.Object) wildcardClass29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        try {
            long long12 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext23, (java.lang.Object) channelHandlerContext32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol16 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder17 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder17.handlerRemoved(channelHandlerContext22);
        io.netty.channel.ChannelHandlerContext channelHandlerContext24 = null;
        aquilaProtocolDecoder17.handlerAdded(channelHandlerContext24);
        java.lang.Class<?> wildcardClass26 = aquilaProtocolDecoder17.getClass();
        java.lang.Class<?> wildcardClass27 = aquilaProtocolDecoder17.getClass();
        java.lang.Class<?> wildcardClass28 = aquilaProtocolDecoder17.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext15, (java.lang.Object) wildcardClass28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerRemoved(channelHandlerContext18);
        boolean boolean20 = aquilaProtocolDecoder11.isSharable();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder11.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext9, (java.lang.Object) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        io.netty.channel.ChannelHandlerContext channelHandlerContext7 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol8 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder9 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol8);
        boolean boolean10 = aquilaProtocolDecoder9.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext11);
        io.netty.channel.ChannelHandlerContext channelHandlerContext13 = null;
        aquilaProtocolDecoder9.handlerRemoved(channelHandlerContext13);
        boolean boolean15 = aquilaProtocolDecoder9.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder9.handlerAdded(channelHandlerContext16);
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder9.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext7, (java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext10);
        try {
            long long13 = aquilaProtocolDecoder1.addUnknownDevice("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext12);
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
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        try {
            java.lang.String str19 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext13);
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        try {
            aquilaProtocolDecoder1.channelActive(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.traccar.model.Position position16 = null;
        java.util.Date date17 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        try {
            long long10 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str11 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext5);
        java.lang.Class<?> wildcardClass7 = aquilaProtocolDecoder1.getClass();
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext34 = null;
        aquilaProtocolDecoder18.handlerAdded(channelHandlerContext34);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext16, (java.lang.Object) aquilaProtocolDecoder18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol14 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder15 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext18);
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder15.handlerAdded(channelHandlerContext20);
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder15.handlerRemoved(channelHandlerContext22);
        boolean boolean24 = aquilaProtocolDecoder15.isSharable();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext13, (java.lang.Object) boolean24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        io.netty.channel.Channel channel10 = null;
        java.net.SocketAddress socketAddress11 = null;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession15 = aquilaProtocolDecoder1.getDeviceSession(channel10, socketAddress11, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.Channel channel8 = null;
        java.net.SocketAddress socketAddress9 = null;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "" };
        try {
            org.traccar.DeviceSession deviceSession14 = aquilaProtocolDecoder1.getDeviceSession(channel8, socketAddress9, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol21 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder22 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol21);
        io.netty.channel.ChannelHandlerContext channelHandlerContext23 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext23);
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder22.handlerRemoved(channelHandlerContext27);
        io.netty.channel.ChannelHandlerContext channelHandlerContext29 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext29);
        io.netty.channel.ChannelHandlerContext channelHandlerContext31 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext31);
        io.netty.channel.ChannelHandlerContext channelHandlerContext33 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext33);
        io.netty.channel.ChannelHandlerContext channelHandlerContext35 = null;
        aquilaProtocolDecoder22.handlerAdded(channelHandlerContext35);
        java.lang.Class<?> wildcardClass37 = aquilaProtocolDecoder22.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext38 = null;
        aquilaProtocolDecoder22.handlerRemoved(channelHandlerContext38);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext20, (java.lang.Object) channelHandlerContext38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol10 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder11 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext14);
        io.netty.channel.ChannelHandlerContext channelHandlerContext16 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext16);
        io.netty.channel.ChannelHandlerContext channelHandlerContext18 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext18);
        boolean boolean20 = aquilaProtocolDecoder11.isSharable();
        java.lang.Class<?> wildcardClass21 = aquilaProtocolDecoder11.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder11.handlerAdded(channelHandlerContext22);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext9, (java.lang.Object) aquilaProtocolDecoder11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        boolean boolean24 = aquilaProtocolDecoder14.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext25 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext25);
        io.netty.channel.ChannelHandlerContext channelHandlerContext27 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext27);
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext12, (java.lang.Object) aquilaProtocolDecoder14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        io.netty.channel.Channel channel13 = null;
        java.net.SocketAddress socketAddress14 = null;
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel13, socketAddress14, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        org.traccar.model.Position position14 = null;
        java.util.Date date15 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position14, date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        org.traccar.model.Position position17 = null;
        java.util.Date date18 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position17, date18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "" };
        try {
            org.traccar.DeviceSession deviceSession18 = aquilaProtocolDecoder1.getDeviceSession(channel12, socketAddress13, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
            aquilaProtocolDecoder1.channelReadComplete(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.Throwable throwable10 = null;
        try {
            aquilaProtocolDecoder1.exceptionCaught(channelHandlerContext9, throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        java.lang.Class<?> wildcardClass8 = aquilaProtocolDecoder1.getClass();
        org.traccar.model.Position position9 = null;
        java.util.Date date10 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        boolean boolean14 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder13.handlerRemoved(channelHandlerContext17);
        boolean boolean19 = aquilaProtocolDecoder13.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext20 = null;
        aquilaProtocolDecoder13.handlerAdded(channelHandlerContext20);
        java.lang.Class<?> wildcardClass22 = aquilaProtocolDecoder13.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext11, (java.lang.Object) aquilaProtocolDecoder13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext15);
        boolean boolean17 = aquilaProtocolDecoder8.isSharable();
        boolean boolean18 = aquilaProtocolDecoder8.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext19);
        boolean boolean21 = aquilaProtocolDecoder8.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext22 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext22);
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext6, (java.lang.Object) aquilaProtocolDecoder8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
            aquilaProtocolDecoder1.channelWritabilityChanged(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        try {
            java.lang.String str16 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        java.lang.Class<?> wildcardClass10 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext11 = null;
        try {
            aquilaProtocolDecoder1.channelRegistered(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        org.traccar.protocol.AquilaProtocol aquilaProtocol13 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder14 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol13);
        io.netty.channel.ChannelHandlerContext channelHandlerContext15 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext15);
        io.netty.channel.ChannelHandlerContext channelHandlerContext17 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext17);
        io.netty.channel.ChannelHandlerContext channelHandlerContext19 = null;
        aquilaProtocolDecoder14.handlerRemoved(channelHandlerContext19);
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder14.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder14.getClass();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder14.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext12, (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Class cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str8 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext2);
        java.lang.Class<?> wildcardClass4 = aquilaProtocolDecoder1.getClass();
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        try {
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        io.netty.channel.ChannelHandlerContext channelHandlerContext5 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext5);
        io.netty.channel.Channel channel7 = null;
        java.net.SocketAddress socketAddress8 = null;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession12 = aquilaProtocolDecoder1.getDeviceSession(channel7, socketAddress8, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        java.lang.Class<?> wildcardClass3 = aquilaProtocolDecoder1.getClass();
        boolean boolean4 = aquilaProtocolDecoder1.isSharable();
        boolean boolean5 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext6);
        io.netty.channel.ChannelHandlerContext channelHandlerContext8 = null;
        try {
            aquilaProtocolDecoder1.channelInactive(channelHandlerContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext3 = null;
        aquilaProtocolDecoder1.handlerRemoved(channelHandlerContext3);
        java.lang.Class<?> wildcardClass5 = aquilaProtocolDecoder1.getClass();
        boolean boolean6 = aquilaProtocolDecoder1.isSharable();
        boolean boolean7 = aquilaProtocolDecoder1.isSharable();
        try {
            long long9 = aquilaProtocolDecoder1.addUnknownDevice("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        io.netty.channel.ChannelHandlerContext channelHandlerContext21 = null;
        aquilaProtocolDecoder12.handlerAdded(channelHandlerContext21);
        java.lang.Class<?> wildcardClass23 = aquilaProtocolDecoder12.getClass();
        java.lang.Class<?> wildcardClass24 = aquilaProtocolDecoder12.getClass();
        try {
            aquilaProtocolDecoder1.channelRead(channelHandlerContext10, (java.lang.Object) aquilaProtocolDecoder12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.traccar.protocol.AquilaProtocolDecoder cannot be cast to org.traccar.NetworkMessage");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        org.traccar.model.Position position16 = null;
        java.util.Date date17 = null;
        try {
            aquilaProtocolDecoder1.getLastLocation(position16, date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        boolean boolean2 = aquilaProtocolDecoder1.isSharable();
        boolean boolean3 = aquilaProtocolDecoder1.isSharable();
        io.netty.channel.Channel channel4 = null;
        java.net.SocketAddress socketAddress5 = null;
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        try {
            org.traccar.DeviceSession deviceSession13 = aquilaProtocolDecoder1.getDeviceSession(channel4, socketAddress5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
            aquilaProtocolDecoder1.channelActive(channelHandlerContext13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
            aquilaProtocolDecoder1.channelUnregistered(channelHandlerContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        try {
            java.lang.String str14 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        try {
            java.lang.String str10 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.traccar.protocol.AquilaProtocol aquilaProtocol0 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder1 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol0);
        io.netty.channel.ChannelHandlerContext channelHandlerContext2 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext2);
        io.netty.channel.ChannelHandlerContext channelHandlerContext4 = null;
        aquilaProtocolDecoder1.handlerAdded(channelHandlerContext4);
        io.netty.channel.ChannelHandlerContext channelHandlerContext6 = null;
        org.traccar.protocol.AquilaProtocol aquilaProtocol7 = null;
        org.traccar.protocol.AquilaProtocolDecoder aquilaProtocolDecoder8 = new org.traccar.protocol.AquilaProtocolDecoder(aquilaProtocol7);
        boolean boolean9 = aquilaProtocolDecoder8.isSharable();
        io.netty.channel.ChannelHandlerContext channelHandlerContext10 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext10);
        io.netty.channel.ChannelHandlerContext channelHandlerContext12 = null;
        aquilaProtocolDecoder8.handlerRemoved(channelHandlerContext12);
        io.netty.channel.ChannelHandlerContext channelHandlerContext14 = null;
        aquilaProtocolDecoder8.handlerAdded(channelHandlerContext14);
        boolean boolean16 = aquilaProtocolDecoder8.isSharable();
        java.lang.Class<?> wildcardClass17 = aquilaProtocolDecoder8.getClass();
        java.lang.Class<?> wildcardClass18 = aquilaProtocolDecoder8.getClass();
        java.lang.Class<?> wildcardClass19 = aquilaProtocolDecoder8.getClass();
        try {
            aquilaProtocolDecoder1.userEventTriggered(channelHandlerContext6, (java.lang.Object) wildcardClass19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        boolean boolean11 = aquilaProtocolDecoder1.isSharable();
        try {
            java.lang.String str12 = aquilaProtocolDecoder1.getProtocolName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

