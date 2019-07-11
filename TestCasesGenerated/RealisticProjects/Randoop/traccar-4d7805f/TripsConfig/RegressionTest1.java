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
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 1L, (long) 1, (long) (short) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), 32L, (long) (short) 10, (long) (byte) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        java.lang.Class<?> wildcardClass9 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, (long) (short) 0, (long) (short) 10, (long) (byte) 100);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) (byte) 1, (long) (byte) 100, (long) 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        long long6 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalParkingDuration(97L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) 100, (long) (short) 10, 300000L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '4', (long) (short) 1, 10L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(1L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 0L, (long) 100, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(500.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
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
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        java.lang.Class<?> wildcardClass22 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) '#');
        long long11 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, (long) (byte) -1, 97L, (long) 'a');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(300000L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, (long) (byte) -1, 97L, (long) 'a');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) 100, (long) (short) -1, (long) (short) 10);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        long long20 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        tripsConfig0.setMinimalTripDuration(300000L);
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(10L);
        tripsConfig4.setMinimalTripDistance((double) 3600000L);
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(100L);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalParkingDuration(1L);
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalTripDuration(97L);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) 100, (long) (short) 10, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((-1.0d));
        double double9 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 1L, (long) 1, (long) (short) 0);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, 1L, 3600000L, (long) (byte) 0);
        tripsConfig4.setMinimalTripDuration(10L);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) 100, 0L, (long) 100);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '4');
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, (long) (-1), (long) (byte) 1, (long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration(300000L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration(0L);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(10L);
        tripsConfig4.setMinimalTripDistance((double) 3600000L);
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        double double13 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3600000.0d + "'", double13 == 3600000.0d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        tripsConfig0.setMinimalTripDuration((long) 100);
        double double19 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3600000L + "'", long19 == 3600000L);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600000L + "'", long3 == 3600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 100, 1L, 0L);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        double double14 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        long long5 = tripsConfig0.getMinimalParkingDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalParkingDuration(300000L);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) 1, (long) (byte) -1, (long) 0);
        tripsConfig4.setMinimalParkingDuration(32L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        java.lang.Class<?> wildcardClass12 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 97L, (-1L));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 1, 3600000L, (long) 10, (long) ' ');
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        double double16 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) (byte) 10, (long) 'a', (long) 'a');
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long10 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, (long) '#', 10L, 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        tripsConfig4.setMinimalTripDistance(100.0d);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) 100, (long) 100, 1L);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 0L, (long) (byte) 10, (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration(35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long9 = tripsConfig4.getMinimalTripDuration();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) 'a', (long) '4', (long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (short) 100, (long) 1, (long) ' ');
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance(10.0d);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(100L);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 1L);
        tripsConfig4.setMinimalParkingDuration(100L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalTripDuration();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long22 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 300000L, (long) (short) 100, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(52L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration(32L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, (long) (byte) 10, (long) (short) 0, (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance(3600000.0d);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        tripsConfig4.setMinimalTripDistance(100.0d);
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 'a');
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDuration(32L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        tripsConfig0.setMinimalTripDistance((double) 0.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3600000L + "'", long2 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, (long) (short) 1, (long) (byte) -1, (long) (short) 100);
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) '4', (long) (-1), 3600000L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        double double21 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '4');
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) (byte) 100, 35L, (long) (short) 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        double double2 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 500.0d + "'", double2 == 500.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((-1.0d));
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, (long) (short) 10, (long) (short) -1, 300000L);
        tripsConfig4.setMinimalTripDistance(0.0d);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        tripsConfig0.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        tripsConfig0.setMinimalTripDistance(300000.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        long long23 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(32L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100.0f, 0L, (long) (byte) 0, 100L);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 1L);
        tripsConfig4.setMinimalParkingDuration(1L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        tripsConfig4.setMinimalTripDuration((long) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalParkingDuration(35L);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(10L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600000L + "'", long17 == 3600000L);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) ' ', (long) (-1), 3600000L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 10L, (long) 100, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) (short) 100, (long) (byte) -1, 1L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        long long20 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(100L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, 300000L, (long) 1, 300000L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalParkingDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, 300000L, (long) (short) 100, (-1L));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        double double7 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (byte) 10, (long) 1, 97L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (-1), (long) (short) 1, 97L);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, (-1L), (long) (byte) 0, 3600000L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        tripsConfig4.setMinimalNoDataDuration(1L);
        java.lang.Class<?> wildcardClass15 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        double double22 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 35L, 3600000L, 0L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) '4', 35L, 52L);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        double double23 = tripsConfig0.getMinimalTripDistance();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(35.0d);
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 1, 3600000L, 0L, (-1L));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) 10, (long) (byte) 1, 0L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double11 = tripsConfig0.getMinimalTripDistance();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        long long16 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        tripsConfig0.setMinimalNoDataDuration(3600000L);
        tripsConfig0.setMinimalNoDataDuration(35L);
        long long21 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 300000L + "'", long21 == 300000L);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), (long) '#', 0L, (long) (short) 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        double double18 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 300000.0d + "'", double8 == 300000.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(100L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        java.lang.String str10 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 0L, (long) (byte) 10, (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(1.0d);
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 500.0d + "'", double20 == 500.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        tripsConfig0.setMinimalTripDuration(97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalTripDuration(97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.Class<?> wildcardClass6 = context0.getClass();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) '#', 0L, (-1L));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 3600000L, 0L, (long) (byte) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 35L);
        tripsConfig4.setMinimalParkingDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(300000L);
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) '#', (long) ' ', (long) (-1));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        double double11 = tripsConfig0.getMinimalTripDistance();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 500.0d + "'", double11 == 500.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(100.0d);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalParkingDuration(300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 500.0d + "'", double11 == 500.0d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((-1.0d));
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance(3600000.0d);
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, 97L, (long) (byte) 1, 3600000L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(100L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', 100L, (long) (short) 1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalTripDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (byte) 1, (long) (byte) 10, (long) (byte) 1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), (long) (byte) 10, 1L, 10L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.lang.Class<?> wildcardClass17 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        double double20 = tripsConfig0.getMinimalTripDistance();
        double double21 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        tripsConfig0.setMinimalParkingDuration(300000L);
        long long24 = tripsConfig0.getMinimalParkingDuration();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 300000L + "'", long24 == 300000L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, 1L, 3600000L, (long) (byte) 0);
        tripsConfig4.setMinimalTripDuration(10L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(32L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        long long15 = tripsConfig0.getMinimalTripDuration();
        long long16 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalNoDataDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long7 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) (byte) 100, (long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(10L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) '#', 3600000L, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (byte) 0, 0L, 0L);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        double double9 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 1, (long) 'a', (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 300000.0d + "'", double5 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', 100L, (long) (short) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        double double16 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long11 = tripsConfig0.getMinimalParkingDuration();
        double double12 = tripsConfig0.getMinimalTripDistance();
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalParkingDuration(97L);
        tripsConfig4.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, 1L, 3600000L, (long) (byte) 0);
        tripsConfig4.setMinimalTripDuration(10L);
        tripsConfig4.setMinimalParkingDuration(0L);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, 0L, (long) 'a', 10L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        tripsConfig0.setMinimalNoDataDuration(35L);
        long long8 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        long long12 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) (short) -1, (long) ' ', (long) (short) 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, 97L, (long) (byte) 1, 3600000L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), (long) (byte) -1, 10L, 32L);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 10L, (long) '#', 35L);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(100L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 1L);
        tripsConfig4.setMinimalParkingDuration(100L);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1);
        tripsConfig0.setMinimalNoDataDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) '4');
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 1, (long) (byte) 100, (long) 100);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '4', (long) (short) 1, 10L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, (long) (short) -1, (long) 1, (long) 'a');
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600000L + "'", long3 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) (byte) 0, (long) 0, (long) ' ');
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1, 0L, (long) '#', (long) 100);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        long long19 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3600000L + "'", long18 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        tripsConfig4.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalParkingDuration();
        long long3 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300000L + "'", long2 == 300000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 300000L + "'", long3 == 300000L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 52L, 1L, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long7 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        tripsConfig0.setMinimalNoDataDuration(35L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, (long) 10, (long) (byte) 1, (-1L));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.lang.String str11 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration(0L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600000L + "'", long3 == 3600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalParkingDuration((-1L));
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '4', (long) (short) 1, (long) ' ', (long) 10);
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(100L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) -1, 100L, (long) '4');
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        tripsConfig0.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, (long) '4', (-1L), (long) '4');
        tripsConfig4.setMinimalTripDistance((double) 3600000L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 0L, 97L, 0L);
        tripsConfig4.setMinimalParkingDuration(300000L);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        double double17 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 0L, 0L, (long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(32.0d);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long20 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(10L);
        tripsConfig4.setMinimalTripDistance((double) 3600000L);
        tripsConfig4.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        tripsConfig4.setMinimalTripDuration(10L);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        long long16 = tripsConfig0.getMinimalTripDuration();
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(3600000.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 500.0d + "'", double9 == 500.0d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (short) 100, (long) (byte) 10, 1L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        tripsConfig4.setMinimalTripDuration(10L);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, (long) '#', 10L, 0L);
        tripsConfig4.setMinimalTripDistance((double) 52L);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, 32L, (long) 1, (long) (short) 100);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, (long) 10, 0L, 0L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        double double15 = tripsConfig0.getMinimalTripDistance();
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        long long1 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(97L);
        long long9 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        double double17 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        tripsConfig0.setMinimalTripDistance((double) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        long long15 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(300000L);
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, 300000L, (long) 1, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) 10, 0L, (long) (short) 100);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, (long) '#', (long) (byte) -1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.lang.String str10 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) 100);
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 300000.0d + "'", double9 == 300000.0d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) 'a', (long) '4', (long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, 35L, (long) (short) 0, 100L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3600000.0d + "'", double5 == 3600000.0d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        tripsConfig0.setMinimalTripDuration(35L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (-1L), (long) ' ', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        tripsConfig0.setMinimalTripDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 0L, 97L, 0L);
        tripsConfig4.setMinimalTripDuration(1L);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        double double18 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        long long3 = tripsConfig0.getMinimalParkingDuration();
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3600000L + "'", long1 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 300000L + "'", long3 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration(1L);
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration((long) 0);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(0L);
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 500.0d + "'", double16 == 500.0d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 10, 52L, (long) '#');
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalTripDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance(35.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, 0L, (long) (byte) 100, 100L);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        long long16 = tripsConfig0.getMinimalTripDuration();
        long long17 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(35.0d);
        tripsConfig4.setMinimalTripDistance((double) 52L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long9 = tripsConfig4.getMinimalTripDuration();
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600000L + "'", long3 == 3600000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 10, 52L, (long) '#');
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) 'a', (long) '4', (long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.lang.String str13 = context0.getFinal();
        java.lang.Class<?> wildcardClass14 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '4', (long) (byte) 100, (long) 1, (long) 0);
        tripsConfig4.setMinimalTripDuration(10L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration(3600000L);
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration((long) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDistance((double) 10);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration(300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(300000L);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, 35L, (long) 10, (long) (short) 100);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 0, (long) (short) -1, 3600000L, 97L);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3600000L + "'", long15 == 3600000L);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 0L, (long) 100, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        java.lang.Class<?> wildcardClass3 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalParkingDuration((-1L));
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long13 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        double double19 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 300000L, (long) (short) 100, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) 'a');
        tripsConfig4.setMinimalTripDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration(100L);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        tripsConfig4.setMinimalTripDistance((double) 0.0f);
        tripsConfig4.setMinimalTripDistance(100.0d);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        tripsConfig4.setMinimalTripDistance(100.0d);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(3600000L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(300000.0d);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        tripsConfig0.setMinimalNoDataDuration(3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        long long2 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300000L + "'", long2 == 300000L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) 1, 3600000L, (long) (byte) 1);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        double double12 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 300000.0d + "'", double12 == 300000.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1);
        tripsConfig0.setMinimalNoDataDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) '4');
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) (short) 100, 0L, (long) (short) 10);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (byte) 0, (long) (short) 0, 0L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, 300000L, (long) 1, 300000L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 52L);
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3600000L + "'", long2 == 3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 35L, 3600000L, 0L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '4', (long) (short) 1, 10L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.Class<?> wildcardClass3 = context0.getClass();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.lang.String str13 = context0.getFinal();
        java.lang.String str14 = context0.getFinal();
        java.lang.String str15 = context0.getFinal();
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) 'a', (long) '4', (long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        tripsConfig0.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 300000L, (long) 10, 100L);
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 'a', 97L, (long) '#', 52L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(100L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        tripsConfig0.setMinimalParkingDuration((long) '#');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration(10L);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        long long23 = tripsConfig0.getMinimalTripDuration();
        double double24 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        tripsConfig4.setMinimalTripDuration(0L);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, 52L, (long) (short) 100, 0L);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        double double22 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) 100);
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) '#');
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        double double13 = tripsConfig4.getMinimalTripDistance();
        double double14 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDistance((double) 10);
        long long9 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) 10, (long) 100, 10L);
        tripsConfig4.setMinimalParkingDuration((long) 1);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 10L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) 100, 52L, (long) (byte) 10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) '4', (long) (short) 1, 10L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        double double13 = tripsConfig4.getMinimalTripDistance();
        double double14 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 300000.0d + "'", double13 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 300000.0d + "'", double14 == 300000.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 500.0d + "'", double9 == 500.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.lang.String str11 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalNoDataDuration(52L);
        double double14 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 1, (long) 0, 1L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        tripsConfig0.setMinimalTripDuration((long) '#');
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        tripsConfig4.setMinimalTripDuration((long) '#');
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, (long) '#', (long) (byte) -1, (long) ' ');
        tripsConfig4.setMinimalParkingDuration(97L);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalParkingDuration(35L);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        tripsConfig0.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDuration(97L);
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        long long13 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, (long) ' ', 100L, 10L);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, 0L, (long) (byte) 0, (long) (byte) 1);
        tripsConfig4.setMinimalTripDistance((double) (-1));
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, 0L, (long) '4', 3600000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDuration(32L);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) (short) 0, (long) 1, (long) (short) 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3600000L + "'", long6 == 3600000L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        tripsConfig0.setMinimalTripDistance((double) 3600000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', (long) 0, 0L, (long) '4');
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '4');
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) ' ', 1L);
        tripsConfig4.setMinimalParkingDuration(0L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        tripsConfig0.setMinimalTripDistance((double) 1);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration(0L);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        tripsConfig0.setMinimalParkingDuration(1L);
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(0L);
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(300000L);
        tripsConfig4.setMinimalTripDistance((double) 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

