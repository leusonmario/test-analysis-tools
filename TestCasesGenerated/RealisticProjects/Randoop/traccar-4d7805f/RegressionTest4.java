import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(52.0d, 52L, (long) ' ', (long) '4');
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 3600000L, 0L, (long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalTripDuration();
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(35.0d);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), (long) '#', 35L, 97L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalTripDuration(300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        tripsConfig0.setMinimalNoDataDuration(97L);
        tripsConfig0.setMinimalTripDuration(300000L);
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 300000L + "'", long18 == 300000L);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 300000L, (long) (short) 100, (long) ' ');
        tripsConfig4.setMinimalParkingDuration(0L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 52L, 35L, (long) 10);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        double double11 = tripsConfig0.getMinimalTripDistance();
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        tripsConfig4.setMinimalTripDistance(100.0d);
        tripsConfig4.setMinimalParkingDuration((long) 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) '4', 3600000L, (-1L));
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(32L);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '4');
        tripsConfig4.setMinimalParkingDuration((long) (short) 100);
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) 10, (long) 100, 10L);
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(10.0d);
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalTripDuration(97L);
        tripsConfig4.setMinimalTripDuration(52L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.Class<?> wildcardClass3 = context0.getClass();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        tripsConfig4.setMinimalTripDistance(100.0d);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 32L, (long) (short) 10, (long) (byte) 10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration(35L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, 300000L, 0L, (long) 'a');
        tripsConfig4.setMinimalParkingDuration((long) 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        context0.Context();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass14 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        long long16 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, 10L, 32L, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(300000.0d);
        tripsConfig4.setMinimalTripDuration((long) '#');
        double double11 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 300000.0d + "'", double11 == 300000.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance((double) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, (long) (-1), (long) (short) 0, (long) 'a');
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), 0L, (long) (short) 0, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, 97L, (long) (byte) 1, 3600000L);
        tripsConfig4.setMinimalNoDataDuration(10L);
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        tripsConfig0.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        long long3 = tripsConfig0.getMinimalParkingDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3600000L + "'", long1 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 300000L + "'", long3 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 32L, (long) (byte) 1, 0L, (long) (byte) -1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration(0L);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        tripsConfig0.setMinimalTripDistance((double) 32L);
        long long19 = tripsConfig0.getMinimalParkingDuration();
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long20 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass21 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 32L, 3600000L, (long) 100, 10L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 300000.0d + "'", double7 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        tripsConfig0.setMinimalTripDistance(500.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalParkingDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3600000L + "'", long2 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        tripsConfig0.setMinimalTripDistance((double) 1);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalParkingDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        double double20 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration(3600000L);
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 0L, 0L, (long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) 0, 3600000L, 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) (byte) 1, (long) (short) 100, (long) (short) 1);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 52L, (long) ' ', 32L);
        tripsConfig4.setMinimalNoDataDuration(0L);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDistance((double) 32L);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        double double19 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        double double9 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.lang.Class<?> wildcardClass10 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(100L);
        long long8 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        long long18 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 300000L + "'", long18 == 300000L);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) 0, 52L, (long) '4');
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, 0L, (long) (short) 0, 52L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 1L, (long) 1, (long) (short) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 3600000L, 35L, (long) (short) 100);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalTripDistance((double) 10);
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) '4', (long) '4', 100L);
        tripsConfig4.setMinimalTripDistance(0.0d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        long long20 = tripsConfig0.getMinimalNoDataDuration();
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, (long) 100, 0L, 0L);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', 97L, (long) (byte) 10, 100L);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 100);
        double double17 = tripsConfig0.getMinimalTripDistance();
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) '#', (long) 1, 300000L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), (long) 10, 52L, (long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        java.lang.String str8 = context0.getFinal();
        java.lang.Class<?> wildcardClass9 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, (long) (byte) -1, 0L, (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        tripsConfig0.setMinimalParkingDuration(300000L);
        tripsConfig0.setMinimalNoDataDuration(100L);
        long long24 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 100L, (long) (byte) 0, (long) 1);
        tripsConfig4.setMinimalTripDistance((double) 52L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalTripDistance((-1.0d));
        long long11 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        double double17 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass17 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) ' ', 35L, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        tripsConfig0.setMinimalTripDistance((double) 52L);
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        double double3 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((-1L));
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDuration(97L);
        tripsConfig0.setMinimalParkingDuration(0L);
        long long23 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        context0.Context();
        java.lang.String str14 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalTripDuration((long) 100);
        tripsConfig0.setMinimalNoDataDuration(32L);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) (byte) 0, 3600000L, (long) (short) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDistance((double) 32L);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        tripsConfig0.setMinimalTripDuration((long) 100);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(52.0d, 35L, (long) 'a', (long) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), 32L, (long) (short) 10, (long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalNoDataDuration();
        long long3 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3600000L + "'", long2 == 3600000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 300000L + "'", long3 == 300000L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) (short) 100, 35L, (long) 'a');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        long long8 = tripsConfig0.getMinimalTripDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 100L, (long) (byte) 0, (long) 1);
        tripsConfig4.setMinimalTripDistance((double) 52L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long11 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(52L);
        tripsConfig4.setMinimalTripDistance((double) 10);
        double double12 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) 10);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        double double8 = tripsConfig4.getMinimalTripDistance();
        long long9 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 300000.0d + "'", double8 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) 1, (long) (byte) -1, (long) 0);
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 0L, 0L, (long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        double double15 = tripsConfig0.getMinimalTripDistance();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.Class<?> wildcardClass6 = context0.getClass();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, (long) (byte) -1, (long) (byte) 10, 10L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, 97L, (long) (-1), 0L);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalParkingDuration(300000L);
        double double12 = tripsConfig0.getMinimalTripDistance();
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration(1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 0);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, 0L, (long) (byte) 0, (long) (byte) 1);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(100.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, 100L, 3600000L, (long) '#');
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) '#');
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(97.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '#', 3600000L, (long) 100);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(35.0d, 3600000L, (long) (short) 10, (long) (short) 10);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalParkingDuration((-1L));
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        long long17 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        long long20 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 300000L + "'", long20 == 300000L);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        tripsConfig0.setMinimalParkingDuration((long) 10);
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
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, 10L, (long) (short) 0, 35L);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        long long8 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        double double12 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 300000.0d + "'", double12 == 300000.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        tripsConfig0.setMinimalTripDistance(300000.0d);
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        java.lang.Class<?> wildcardClass10 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        long long15 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(3600000L);
        tripsConfig0.setMinimalTripDistance(100.0d);
        tripsConfig0.setMinimalTripDistance((double) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        double double12 = tripsConfig0.getMinimalTripDistance();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        long long16 = tripsConfig0.getMinimalParkingDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalTripDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 500.0d + "'", double9 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.Class<?> wildcardClass10 = context0.getClass();
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        long long15 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        double double19 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        long long8 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        tripsConfig0.setMinimalTripDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (byte) 100, (long) '4', 35L);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        java.lang.String str11 = context0.getFinal();
        java.lang.Class<?> wildcardClass12 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', (long) 10, 35L, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        tripsConfig0.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(300000L);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        tripsConfig0.setMinimalTripDistance(32.0d);
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '#', 100L, (long) 'a');
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalParkingDuration((-1L));
        tripsConfig0.setMinimalParkingDuration(300000L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) (byte) -1, 1L, (long) (short) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(35L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.Class<?> wildcardClass6 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (byte) 10, (long) 1, 97L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 'a');
        tripsConfig0.setMinimalTripDuration(100L);
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        long long18 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        double double22 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        tripsConfig0.setMinimalTripDistance((double) 52L);
        tripsConfig0.setMinimalParkingDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 100L, (long) (byte) 0, (long) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(35.0d, (-1L), (long) (byte) 1, 35L);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', (long) 10, 35L, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 10L, (long) (short) 0, 300000L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 52L, (long) 'a', (long) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        tripsConfig0.setMinimalParkingDuration((-1L));
        java.lang.Class<?> wildcardClass17 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalParkingDuration(300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (short) 10, 1L, (long) (short) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 1, 0L, (long) (short) -1);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (-1), 97L, 10L);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, (-1L), (long) (short) 10, (long) 1);
        tripsConfig4.setMinimalTripDistance((double) (byte) 1);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100.0f, (-1L), (long) 0, 100L);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalTripDuration(97L);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 300000.0d + "'", double9 == 300000.0d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) 'a', 97L, (long) 0);
        tripsConfig4.setMinimalTripDuration((long) 1);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        long long19 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        double double22 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, 300000L, 100L, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, (long) (short) 1, (long) '#', (long) (byte) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, 32L, (long) (short) 1, (long) (short) 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        double double17 = tripsConfig0.getMinimalTripDistance();
        double double18 = tripsConfig0.getMinimalTripDistance();
        long long19 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        tripsConfig0.setMinimalTripDistance((double) 0L);
        long long19 = tripsConfig0.getMinimalParkingDuration();
        long long20 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long23 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        tripsConfig0.setMinimalTripDistance(100.0d);
        java.lang.Class<?> wildcardClass17 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        long long18 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) 'a');
        long long21 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, (long) (-1), (long) '4', (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
        java.lang.String str14 = context0.getFinal();
        context0.Context();
        java.lang.String str16 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, (long) 100, 10L, (long) (-1));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(100L);
        long long8 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration(52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        long long11 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 'a', 10L, 52L, (long) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) 'a', 52L, (long) '#');
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        long long14 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDistance((double) 10);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(100L);
        tripsConfig0.setMinimalTripDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration(300000L);
        tripsConfig0.setMinimalTripDuration((-1L));
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) ' ', 35L, (long) 1);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long12 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.Class<?> wildcardClass9 = context0.getClass();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, 1L, (-1L), (long) (short) 10);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDistance((double) 10);
        tripsConfig0.setMinimalTripDuration(10L);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) '#', (long) 1, 300000L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig4.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 0L, (long) (byte) 10, (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(1.0d);
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 0L, (long) (byte) 10, (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(1.0d);
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 1L, (long) 'a', (long) ' ');
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        double double8 = tripsConfig4.getMinimalTripDistance();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        tripsConfig0.setMinimalParkingDuration(97L);
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalParkingDuration();
        long long3 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300000L + "'", long2 == 300000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 300000L + "'", long3 == 300000L);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
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
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        context0.Context();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass14 = context0.getClass();
        java.lang.String str15 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (short) 100, (long) (byte) 1, 32L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(1L);
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), (long) 10, (long) (-1), (long) '4');
        tripsConfig4.setMinimalNoDataDuration(35L);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100.0f, (long) 0, 1L, 0L);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        long long8 = tripsConfig0.getMinimalTripDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        double double13 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str13 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalParkingDuration(35L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 10);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) (byte) 0, (long) '4', 32L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) (byte) 10, 35L, (-1L));
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalTripDistance((double) '4');
        tripsConfig4.setMinimalTripDistance((double) 300000L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, (long) (byte) -1, (long) 10, (long) 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        java.lang.Class<?> wildcardClass13 = context0.getClass();
        java.lang.String str14 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        double double16 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(1L);
        long long19 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, (long) ' ', 300000L);
        tripsConfig4.setMinimalParkingDuration(0L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        long long23 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        long long16 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, 1L, (long) (byte) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.Class<?> wildcardClass6 = context0.getClass();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) (short) -1, (long) (short) 10, (long) '#');
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, (long) (-1), (long) (byte) 1, (long) (short) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (-1.0f));
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDistance((double) 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        context0.Context();
        java.lang.Class<?> wildcardClass11 = context0.getClass();
        java.lang.String str12 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalParkingDuration(300000L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '4');
        tripsConfig4.setMinimalParkingDuration((long) (short) 100);
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        long long14 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) 100, (long) (short) 10, 300000L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (-1L), (long) ' ', (long) (byte) 10);
        tripsConfig4.setMinimalTripDuration(3600000L);
        tripsConfig4.setMinimalTripDistance((double) 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        long long19 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(10L);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(35.0d, (long) (short) 100, 0L, (long) (short) -1);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        tripsConfig0.setMinimalTripDistance(32.0d);
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
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        double double18 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance(300000.0d);
        tripsConfig0.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        double double14 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        tripsConfig0.setMinimalTripDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalTripDistance(97.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long16 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        tripsConfig0.setMinimalTripDistance((double) 10);
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
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        long long20 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalTripDuration((long) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        long long19 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) ' ', 35L, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalTripDuration(97L);
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(100L);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
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
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(1L);
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        double double18 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(52L);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600000L + "'", long3 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 1, 32L, 0L, 32L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
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
        long long20 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 300000L + "'", long20 == 300000L);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) 0L);
        tripsConfig4.setMinimalParkingDuration((long) 100);
        double double17 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        long long13 = tripsConfig0.getMinimalTripDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 'a');
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 10L, 10L, (long) '4');
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        java.lang.Class<?> wildcardClass11 = context0.getClass();
        context0.Context();
        java.lang.String str13 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 52L, (long) 'a', (long) (byte) 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 100, (long) (byte) 100, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        long long14 = tripsConfig0.getMinimalTripDuration();
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        double double13 = tripsConfig4.getMinimalTripDistance();
        double double14 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
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
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long20 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (short) -1, 52L, (long) 0);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        tripsConfig0.setMinimalTripDuration((long) '4');
        long long19 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        java.lang.Class<?> wildcardClass11 = context0.getClass();
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
        context0.Context();
        java.lang.String str15 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 32L, 10L, 32L, (long) 'a');
        tripsConfig4.setMinimalNoDataDuration(32L);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration(100L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, 52L, (long) (short) 1, (long) (byte) 100);
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalParkingDuration(100L);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100.0f, (long) (short) 100, 0L, 97L);
        tripsConfig4.setMinimalParkingDuration(32L);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) 100, (long) (short) 10, 300000L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        tripsConfig0.setMinimalTripDistance(100.0d);
        java.lang.Class<?> wildcardClass17 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(300000L);
        double double20 = tripsConfig0.getMinimalTripDistance();
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 100L, (long) (byte) 10, 0L);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(300000L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 10L, (long) (short) 0, 300000L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, (long) (byte) -1, 97L, (long) 'a');
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(500.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) 'a', (long) (short) 1, (long) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(0L);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        long long12 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long9 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        long long13 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) ' ');
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration(0L);
        double double10 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
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
        double double19 = tripsConfig0.getMinimalTripDistance();
        long long20 = tripsConfig0.getMinimalNoDataDuration();
        double double21 = tripsConfig0.getMinimalTripDistance();
        long long22 = tripsConfig0.getMinimalTripDuration();
        double double23 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration(32L);
        tripsConfig4.setMinimalTripDuration((long) 10);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 'a');
        long long18 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        tripsConfig0.setMinimalParkingDuration(100L);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, (long) (byte) 10, 300000L, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration((-1L));
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDistance((double) 32L);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        tripsConfig0.setMinimalParkingDuration(32L);
        tripsConfig0.setMinimalNoDataDuration(300000L);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, (long) 1, (long) 1, (long) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalParkingDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), 35L, 52L, (long) (short) 1);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', 100L, 0L);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) 1, (long) (byte) -1, (long) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(52L);
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        java.lang.Class<?> wildcardClass11 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(52L);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 3600000L, 0L, (long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, 0L, (long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass9 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) (byte) -1, 1L, (long) (short) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        double double7 = tripsConfig4.getMinimalTripDistance();
        double double8 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
        tripsConfig0.setMinimalNoDataDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) '#', 10L, (long) '#');
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDuration(100L);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDuration(100L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, 52L, (long) (short) 1, (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, (long) (short) -1, 32L, 52L);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (short) 100, (long) 1, (long) ' ');
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalNoDataDuration(10L);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1, 300000L, (long) (short) 10, 1L);
        tripsConfig4.setMinimalNoDataDuration(3600000L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
}

