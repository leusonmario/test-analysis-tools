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
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) (short) -1, (-1L), (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, (long) (byte) 1, (long) (short) 10, 100L);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, 32L, 0L, (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(300000.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        tripsConfig0.setMinimalTripDistance((double) 1);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass17 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long20 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 300000L + "'", long20 == 300000L);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) (short) 10, (long) (byte) 0, (long) (short) 100);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 300000L, (long) (short) 100, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) 'a');
        tripsConfig4.setMinimalTripDuration(3600000L);
        tripsConfig4.setMinimalTripDuration(300000L);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        double double9 = tripsConfig4.getMinimalTripDistance();
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 300000.0d + "'", double9 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 300000.0d + "'", double10 == 300000.0d);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 10L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) 1, (long) ' ', 1L);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, 97L, 32L, (long) (byte) 100);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) (byte) 1, (long) (byte) 0, (long) ' ');
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, 52L, (long) (short) 100, 0L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, (long) (byte) 0, (long) 100, (long) (short) 1);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalTripDistance((double) 'a');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 500.0d + "'", double12 == 500.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (byte) 10, (long) (short) -1, 3600000L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(35L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double20 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300000L + "'", long17 == 300000L);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(0L);
        double double7 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        double double2 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        double double5 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 500.0d + "'", double2 == 500.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) (short) -1, (long) (short) 0, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 1L, (long) 'a', (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        long long12 = tripsConfig4.getMinimalTripDuration();
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        double double15 = tripsConfig0.getMinimalTripDistance();
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        double double15 = tripsConfig0.getMinimalTripDistance();
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        tripsConfig0.setMinimalTripDistance(32.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(1L);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        long long18 = tripsConfig0.getMinimalParkingDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) ' ', (long) (byte) 0, 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0.0f);
        long long19 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, 35L, (long) ' ', 32L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        tripsConfig4.setMinimalNoDataDuration(1L);
        long long15 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, 0L, (long) '4', 3600000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalParkingDuration(97L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        long long18 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, 300000L, (long) (short) 100, (long) (short) 10);
        tripsConfig4.setMinimalTripDistance((double) 32L);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) '#', 3600000L, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration(35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((-1.0d));
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(100L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, (-1L), 3600000L, (long) 1);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        long long15 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalTripDuration(97L);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (short) -1, (long) 'a', (long) '#');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        tripsConfig0.setMinimalNoDataDuration(100L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) 100, 35L, 0L);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, 97L, (long) '#', (long) 10);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalParkingDuration(300000L);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        long long19 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalParkingDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long23 = tripsConfig0.getMinimalTripDuration();
        double double24 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass25 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        double double18 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 300000.0d + "'", double18 == 300000.0d);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 97L, (long) (short) 100, 0L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (-1), 0L, (long) 'a');
        tripsConfig4.setMinimalParkingDuration((long) (short) 1);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 'a');
        long long18 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass10 = context0.getClass();
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 'a', 0L, (long) (short) 100, 0L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        double double3 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3600000L + "'", long1 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 500.0d + "'", double3 == 500.0d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration(0L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) ' ', 35L, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        long long8 = tripsConfig4.getMinimalTripDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setMinimalTripDistance(500.0d);
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalTripDuration((long) 0);
        tripsConfig0.setMinimalTripDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        double double15 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        double double17 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) '4');
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, 52L, (long) (short) 1, (long) (byte) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration(0L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance(100.0d);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        long long20 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', 0L, (long) 0, (long) (byte) 100);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long21 = tripsConfig0.getMinimalTripDuration();
        long long22 = tripsConfig0.getMinimalTripDuration();
        long long23 = tripsConfig0.getMinimalTripDuration();
        double double24 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDuration((long) ' ');
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (-1), 0L, (long) 'a');
        tripsConfig4.setMinimalParkingDuration((long) (short) 1);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, 0L, (long) 10, (long) (-1));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(32L);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalTripDistance((double) 1);
        java.lang.Class<?> wildcardClass21 = tripsConfig0.getClass();
        long long22 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0.0f);
        tripsConfig0.setMinimalTripDistance((double) 1);
        double double21 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        double double13 = tripsConfig0.getMinimalTripDistance();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(35.0d);
        double double17 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalTripDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), (long) (short) 10, (long) '#', (-1L));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDistance((double) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        double double14 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (short) -1, (long) 'a', (long) '#');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), (-1L), 97L, (long) 100);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 1L);
        tripsConfig4.setMinimalParkingDuration(100L);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) (byte) 0, 3600000L, (long) (short) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, 32L, (long) 100, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        tripsConfig0.setMinimalTripDuration(3600000L);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '4', (long) (byte) 100, (long) 1, (long) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1, (long) (short) 0, 97L, (long) 1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        double double15 = tripsConfig0.getMinimalTripDistance();
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        long long12 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) (byte) 10, (long) ' ', (long) (byte) 10);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) ' ');
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration(300000L);
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
        tripsConfig4.setMinimalTripDistance((double) 10L);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        tripsConfig0.setMinimalTripDistance((double) 1);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass17 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long20 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, (long) (byte) 100, 32L, (long) '4');
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) '4', (long) (-1), 3600000L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, 0L, (long) '4', 3600000L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 300000.0d + "'", double9 == 300000.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 97L, (-1L));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '4', (long) (short) 1, 10L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        tripsConfig0.setMinimalParkingDuration((long) 1);
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, 300000L, (long) 1, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 32L, (long) 'a', (long) (short) 10, (long) (short) 100);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        long long15 = tripsConfig0.getMinimalParkingDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        double double10 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(100L);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(300000L);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 1);
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.Class<?> wildcardClass6 = context0.getClass();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long12 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3600000.0d + "'", double6 == 3600000.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 100, (long) (byte) 100, (long) (short) -1);
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (short) -1, (long) (short) -1, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        tripsConfig4.setMinimalTripDistance(100.0d);
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) (byte) 0, (long) 100, (long) (byte) 100);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalNoDataDuration(35L);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) 10, (long) ' ', 52L);
        tripsConfig4.setMinimalTripDuration((long) 10);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalNoDataDuration(97L);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '4');
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, 1L, 0L, (long) (short) 10);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) ' ', 1L);
        tripsConfig4.setMinimalTripDistance((double) 32L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, (long) 0, 32L, (long) (short) 100);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) (byte) 0, (long) (byte) -1, 10L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long23 = tripsConfig0.getMinimalTripDuration();
        double double24 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, 52L, (long) (byte) -1, 0L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(300000L);
        tripsConfig4.setMinimalNoDataDuration(100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalTripDuration(300000L);
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 10, 52L, (long) '#');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (-1L), 97L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '4');
        tripsConfig4.setMinimalTripDuration((long) 100);
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) 100, (long) (short) 10, 300000L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(1L);
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, 35L, (long) (short) 0, 100L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalNoDataDuration(1L);
        long long5 = tripsConfig0.getMinimalParkingDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (byte) 0, (long) 100, (long) 'a');
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        double double17 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 3600000L, 0L, (long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalTripDuration((long) ' ');
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) (byte) 0, (long) (byte) 10, (long) (byte) 1);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 1L);
        double double17 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3600000L + "'", long2 == 3600000L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 35L, 3600000L, 0L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 0L, 0L, (long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, 52L, (long) (short) 1, (long) (byte) 100);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration(300000L);
        tripsConfig0.setMinimalTripDuration((-1L));
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 10L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass9 = context0.getClass();
        java.lang.String str10 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(1L);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 35L, (long) 10, (long) 'a');
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '4', (long) (byte) 10, 1L, 300000L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration(300000L);
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(3600000.0d);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 0L, (long) 100, (long) 10);
        tripsConfig4.setMinimalNoDataDuration((-1L));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalTripDuration((long) 0);
        long long21 = tripsConfig0.getMinimalNoDataDuration();
        long long22 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600000L + "'", long21 == 3600000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, 10L, (-1L), (long) (byte) 1);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        tripsConfig0.setMinimalTripDistance((double) 100);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) (short) -1, (-1L), (long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) 0L);
        double double15 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(52L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass11 = context0.getClass();
        context0.Context();
        java.lang.String str13 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) (-1), (long) (byte) 100, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration(0L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(35L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (short) 100, (long) 1, (long) ' ');
        tripsConfig4.setMinimalTripDuration(32L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, (long) (byte) 0, (long) (short) -1, (long) (byte) 10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass10 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(10L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(1L);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration(300000L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((-1.0d));
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 10L, (long) (byte) 0, (long) (-1));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, 97L, (long) (byte) 10, 32L);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(97L);
        long long21 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass24 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalNoDataDuration();
        double double2 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3600000L + "'", long1 == 3600000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 500.0d + "'", double2 == 500.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) 1, (long) (byte) -1, (long) 0);
        tripsConfig4.setMinimalParkingDuration(32L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, 300000L, (long) '#', (long) 'a');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, (long) (byte) 10, (long) (short) 100, (long) (byte) 10);
        tripsConfig4.setMinimalTripDistance(32.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 97L, (long) (byte) 100, (long) (short) -1, (long) 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, (long) (byte) 0, 3600000L, 10L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) 'a', 100L, (long) (short) -1);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long17 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalTripDistance((double) '4');
        java.lang.Class<?> wildcardClass22 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        double double10 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        double double12 = tripsConfig0.getMinimalTripDistance();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 500.0d + "'", double9 == 500.0d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str11 = context0.getFinal();
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(52.0d, (long) 'a', (long) 100, 3600000L);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(300000L);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (byte) 100, (long) 1);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) -1);
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        double double16 = tripsConfig0.getMinimalTripDistance();
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, 100L, 1L, (long) (byte) 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(1L);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration(1L);
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600000L + "'", long3 == 3600000L);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        long long13 = tripsConfig0.getMinimalParkingDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        long long20 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long23 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(1L);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        double double2 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        double double5 = tripsConfig0.getMinimalTripDistance();
        long long6 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 500.0d + "'", double2 == 500.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) (byte) 10, 35L, (-1L));
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) 0, 3600000L, 0L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, 0L, (long) 10, (long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 100);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) '4');
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(52.0d, (long) 'a', (long) 0, (long) 'a');
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, 3600000L, (long) 1, (long) (byte) -1);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(35.0d, (long) 1, (long) (short) 0, (long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration((long) '4');
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (byte) 100, 52L, (long) '4');
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 97L, (long) (short) -1, (long) '#', 3600000L);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 0L, 10L, 1L);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        long long10 = tripsConfig0.getMinimalTripDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), (-1L), 97L, (long) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, 300000L, (long) (short) 100, 32L);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 10, 52L, (long) '#');
        tripsConfig4.setMinimalTripDistance((double) 97L);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, 35L, (long) (short) 100, (long) (byte) 1);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) ' ');
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, 0L, (long) (byte) 0, (long) (byte) 1);
        tripsConfig4.setMinimalTripDistance((double) (-1));
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        long long14 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, (long) (short) 10, (long) (short) 0, (long) (byte) 100);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalNoDataDuration(52L);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 32L, (long) (short) 1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), 32L, (long) (short) 10, (long) (byte) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(35L);
        tripsConfig4.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        double double5 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        long long15 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, 300000L, (long) 1, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(100L);
        tripsConfig4.setMinimalParkingDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) (short) 100);
        tripsConfig4.setMinimalTripDistance((double) 3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.Class<?> wildcardClass9 = context0.getClass();
        context0.Context();
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, (long) 100, (long) (byte) 1, (long) (short) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 'a', 1L, (long) (byte) -1, (long) 10);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration((-1L));
        long long7 = tripsConfig4.getMinimalParkingDuration();
        double double8 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 300000.0d + "'", double8 == 300000.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(0L);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) 10, (long) (short) 100, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(300000L);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalParkingDuration(35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, 300000L, (long) (byte) 1, (long) (byte) 1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 32L, (long) 10, 100L, (long) (byte) 1);
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(10L);
        tripsConfig4.setMinimalTripDistance((double) 3600000L);
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setMinimalTripDistance(500.0d);
        tripsConfig0.setMinimalNoDataDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration(10L);
        double double14 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        tripsConfig4.setMinimalTripDuration(10L);
        tripsConfig4.setMinimalParkingDuration(0L);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) '#', 3600000L, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(35L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((-1L));
        long long22 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(10L);
        long long25 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, 97L, (long) 0, 100L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration(0L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        double double12 = tripsConfig0.getMinimalTripDistance();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        long long10 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        tripsConfig0.setMinimalTripDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) 100, (long) (short) 1, (long) 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        double double10 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        double double12 = tripsConfig0.getMinimalTripDistance();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '4', (long) (byte) 1, (long) '4');
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 1L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 1L, 1L, (long) '4');
        tripsConfig4.setMinimalTripDistance((double) ' ');
        tripsConfig4.setMinimalTripDuration(10L);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long12 = tripsConfig4.getMinimalTripDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 300000.0d + "'", double7 == 300000.0d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 500.0d + "'", double9 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        double double8 = tripsConfig4.getMinimalTripDistance();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalParkingDuration(0L);
        long long20 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass21 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration(3600000L);
        long long18 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 300000.0d + "'", double11 == 300000.0d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (-1L), (long) ' ', (long) (byte) 10);
        tripsConfig4.setMinimalTripDuration(3600000L);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '4', (long) (short) 1, 10L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) '4');
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 10, 52L, (long) '#');
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setMinimalTripDistance(500.0d);
        long long19 = tripsConfig0.getMinimalTripDuration();
        long long20 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(32L);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        long long19 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', (long) (byte) 1, (long) 'a', (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration(300000L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) 10);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        double double9 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, 10L, (long) ' ', (long) 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) 100, (long) (short) 10, 300000L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, 35L, (long) (byte) 1, (long) (short) 1);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, (long) (-1), (long) (-1), (long) '4');
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 35L, (long) (short) 0, (long) ' ');
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration(97L);
        tripsConfig0.setMinimalNoDataDuration(10L);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalParkingDuration(300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        java.lang.String str8 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) '#');
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalNoDataDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        long long9 = tripsConfig0.getMinimalTripDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 0L, (long) (short) -1, (long) (short) 1);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalParkingDuration(300000L);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        long long19 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '#', 3600000L, (long) 100);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 'a');
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, (long) (-1), (long) ' ', 300000L);
        tripsConfig4.setMinimalTripDuration((long) '4');
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        double double13 = tripsConfig0.getMinimalTripDistance();
        double double14 = tripsConfig0.getMinimalTripDistance();
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, 52L, (long) (short) 1, (long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalTripDuration(35L);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long14 = tripsConfig0.getMinimalTripDuration();
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        double double2 = tripsConfig0.getMinimalTripDistance();
        double double3 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 500.0d + "'", double2 == 500.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 500.0d + "'", double3 == 500.0d);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), 32L, (long) (short) 10, (long) (byte) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalParkingDuration(52L);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 1L, 1L, (long) '4');
        tripsConfig4.setMinimalTripDistance((double) ' ');
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), 32L, (long) (short) 10, (long) (byte) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        double double8 = tripsConfig4.getMinimalTripDistance();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.Class<?> wildcardClass10 = context0.getClass();
        java.lang.String str11 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass6 = context0.getClass();
        java.lang.String str7 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        double double19 = tripsConfig0.getMinimalTripDistance();
        long long20 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass21 = tripsConfig0.getClass();
        long long22 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(97L);
        long long21 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long24 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(35L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration(35L);
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 0, (long) 'a', (long) (byte) 10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        double double16 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration(1L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        double double17 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        double double13 = tripsConfig4.getMinimalTripDistance();
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, (long) (byte) 10, 300000L, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 0L, (long) (short) 0, 1L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalParkingDuration(35L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        long long13 = tripsConfig0.getMinimalTripDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 1, (long) (short) 10, (long) (byte) 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        java.lang.String str11 = context0.getFinal();
        context0.Context();
        java.lang.String str13 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, (long) 1, 1L, (long) (short) 100);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDuration(100L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (byte) 1, (long) (short) 1, (long) 'a');
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long20 = tripsConfig0.getMinimalParkingDuration();
        long long21 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long23 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(35L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(52.0d, (long) (byte) 100, (long) '4', (long) '4');
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        java.lang.String str12 = context0.getFinal();
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) (short) 100, 0L, (long) (short) 10);
        tripsConfig4.setMinimalNoDataDuration(300000L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        long long13 = tripsConfig0.getMinimalParkingDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        long long20 = tripsConfig0.getMinimalTripDuration();
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass11 = context0.getClass();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) ' ');
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        long long2 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300000L + "'", long2 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 10L, (long) 100, (long) (short) 10);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, 97L, (long) (byte) 1, 3600000L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((-1.0d));
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 1);
        tripsConfig4.setMinimalTripDuration(100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, 97L, (long) 100, (long) '#');
        tripsConfig4.setMinimalNoDataDuration(100L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (short) 1, 0L, (long) (short) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, 10L, 32L, (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '4', 3600000L, 0L, (long) (byte) 10);
        tripsConfig4.setMinimalTripDuration((long) '4');
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), 0L, (long) (short) 0, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, 97L, (long) 100, (long) '#');
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalTripDistance((double) 10L);
        double double17 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, 32L, 0L, (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, 52L, (long) (short) -1, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), 0L, (long) (short) 0, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDistance((double) (-1.0f));
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), 0L, (long) (short) 0, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance(32.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(52.0d, (long) (short) 10, (long) (short) 1, 0L);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        long long13 = tripsConfig0.getMinimalTripDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDuration((long) ' ');
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) '4');
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration(0L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance(100.0d);
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, (long) (byte) 0, 35L, 35L);
        tripsConfig4.setMinimalParkingDuration(35L);
    }
}

