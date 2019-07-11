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
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalNoDataDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        tripsConfig0.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass24 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass25 = tripsConfig0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration(10L);
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, (long) (byte) 10, (long) (-1), 97L);
        tripsConfig4.setMinimalTripDistance((double) 0L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) (-1), (long) '4', (long) '4');
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 0L, (long) (-1), (long) (byte) 1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 500.0d + "'", double14 == 500.0d);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalParkingDuration(300000L);
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        tripsConfig0.setMinimalTripDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, 97L, (long) (byte) 1, 3600000L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        long long11 = tripsConfig4.getMinimalTripDuration();
        double double12 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalTripDuration();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 52L, 1L, (long) (short) 1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDistance((double) 10);
        tripsConfig0.setMinimalTripDuration(10L);
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (-1L), (long) 0, 0L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        tripsConfig0.setMinimalTripDistance(300000.0d);
        long long21 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig4.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(52L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 500.0d + "'", double11 == 500.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, 0L, (long) 10, (long) (-1));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(32L);
        double double8 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration(100L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        double double12 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(300000L);
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        tripsConfig0.setMinimalNoDataDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (short) 10, 1L, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10);
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, 100L, (long) 0, 35L);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) (short) 0, (-1L), (long) (byte) 1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, 300000L, (long) '4', 100L);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) 'a', (long) '4', (long) (short) -1);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 10, 32L, (-1L));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.String str11 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) 10, (long) ' ', 52L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, 0L, (long) 'a', 10L);
        tripsConfig4.setMinimalNoDataDuration((long) '4');
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100.0f, 32L, 100L, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 0L, (long) (byte) 10, (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) 100);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        double double18 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', 100L, (long) (short) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalTripDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        long long12 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalNoDataDuration(52L);
        long long8 = tripsConfig0.getMinimalTripDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(100L);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalParkingDuration(35L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, (-1L), (long) (short) 1, 3600000L);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (long) (byte) 0, 0L, 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 0L, (long) (short) 0, 1L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        tripsConfig0.setMinimalTripDistance(500.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalTripDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(100L);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(300000L);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, 3600000L, 100L, (long) (short) 100);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        long long23 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 300000L + "'", long20 == 300000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3600000L + "'", long23 == 3600000L);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long13 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration(52L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1, 300000L, (long) (short) 10, 1L);
        tripsConfig4.setMinimalNoDataDuration(3600000L);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, 97L, (long) 100, (long) '#');
        tripsConfig4.setMinimalNoDataDuration(100L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (byte) 10, (long) 1, 97L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(10L);
        tripsConfig4.setMinimalTripDistance((double) 3600000L);
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
        tripsConfig4.setMinimalTripDuration(10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '4', (long) '#', 52L, 0L);
        tripsConfig4.setMinimalTripDistance((double) 0L);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (short) 100, (long) 'a', 0L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(32.0d);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        long long10 = tripsConfig0.getMinimalTripDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        long long18 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(35L);
        double double21 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) (short) 0, (long) (byte) 10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        double double3 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((-1L));
        tripsConfig0.setMinimalNoDataDuration(1L);
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        long long23 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) ' ', (long) 'a', 100L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        double double3 = tripsConfig0.getMinimalTripDistance();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDuration((long) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        tripsConfig0.setMinimalTripDuration(1L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 0, (long) (short) 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str13 = context0.getFinal();
        java.lang.String str14 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long6 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) (short) 100, 52L, (long) '4');
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, 0L, (long) 10, (long) (-1));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, 0L, (long) 10, (long) (-1));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(32L);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        tripsConfig0.setMinimalTripDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, 300000L, (long) (short) 10, (long) 10);
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(100L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        double double10 = tripsConfig0.getMinimalTripDistance();
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        tripsConfig0.setMinimalTripDuration(3600000L);
        long long20 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3600000L + "'", long20 == 3600000L);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, 0L, (long) (byte) -1, (long) ' ');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 10L, (long) (byte) 0, (long) 10);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDistance((double) (-1.0f));
        tripsConfig4.setMinimalNoDataDuration((long) '#');
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        tripsConfig0.setMinimalTripDistance(100.0d);
        tripsConfig0.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, 35L, (long) (short) 0, (long) (short) 100);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(35.0d, (long) 'a', 300000L, (long) (short) 100);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        tripsConfig0.setMinimalTripDuration(3600000L);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalParkingDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalTripDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, 100L, (long) (short) -1, (long) (byte) 0);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (byte) 0, (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1);
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) '#', 300000L, (long) (short) -1);
        tripsConfig4.setMinimalParkingDuration(3600000L);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        context0.Context();
        context0.Context();
        java.lang.String str13 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        tripsConfig0.setMinimalTripDuration(0L);
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 52L, 1L, (long) (short) 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        java.lang.String str8 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, 0L, (long) (short) -1, (long) (short) 1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
        long long21 = tripsConfig0.getMinimalParkingDuration();
        double double22 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32.0d + "'", double22 == 32.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', (long) 10, 35L, (long) (short) 10);
        tripsConfig4.setMinimalTripDistance((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 0L, (long) 100, (long) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration(100L);
        tripsConfig4.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalTripDistance(35.0d);
        tripsConfig4.setMinimalNoDataDuration(52L);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(300000L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(32.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3600000L + "'", long4 == 3600000L);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        long long2 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300000L + "'", long2 == 300000L);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) 0, (long) (byte) 100, 10L);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        long long21 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
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
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (-1L), 97L, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(300000L);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalTripDuration(52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        tripsConfig0.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(10.0d, (long) '#', 300000L, (long) 1);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        tripsConfig0.setMinimalTripDuration((long) 100);
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 97L, (long) 0, (long) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        double double18 = tripsConfig0.getMinimalTripDistance();
        long long19 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDistance((double) 32L);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, (long) (-1), (long) (byte) 1, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration(0L);
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        long long18 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance(1.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) (byte) -1, 0L, 100L);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration(300000L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, (long) (byte) 10, (long) (short) 0, (-1L));
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        double double21 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass22 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(100.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        double double7 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, 1L, 3600000L, (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) (-1), 100L, 1L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, 0L, (long) '#', (long) 0);
        tripsConfig4.setMinimalParkingDuration(300000L);
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (short) 0, (long) (short) 0, 0L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (-1L), (long) (byte) 10, 1L);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(100L);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(300000L);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalTripDistance((double) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 300000.0d + "'", double9 == 300000.0d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        long long3 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        double double5 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3600000L + "'", long1 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 300000L + "'", long3 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 500.0d + "'", double5 == 500.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        tripsConfig0.setMinimalTripDuration((long) 0);
        long long18 = tripsConfig0.getMinimalTripDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
        double double11 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        context0.Context();
        java.lang.Class<?> wildcardClass12 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) 10, 100L, (long) (short) -1);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), 35L, 52L, 0L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3600000L + "'", long8 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
        double double11 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        double double18 = tripsConfig0.getMinimalTripDistance();
        long long19 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        tripsConfig0.setMinimalTripDuration((long) 100);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        java.lang.String str11 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 97L, 0L, 300000L, (long) '4');
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, 1L, (long) (byte) 100, (long) (byte) 100);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.lang.String str15 = context0.getFinal();
        java.lang.String str16 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) (byte) -1, 1L, (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 97L, (long) (byte) 0, (-1L), 0L);
        tripsConfig4.setMinimalNoDataDuration(3600000L);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) (short) -1, (long) (short) 0, 300000L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        tripsConfig0.setMinimalParkingDuration(300000L);
        tripsConfig0.setMinimalParkingDuration(52L);
        double double18 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 100L, (long) (byte) 0, (long) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        tripsConfig4.setMinimalTripDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, 52L, 0L, (long) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) '4');
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        tripsConfig0.setMinimalNoDataDuration(0L);
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, (long) (byte) 0, (long) 1, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        java.lang.Class<?> wildcardClass11 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(300000.0d, (long) (byte) -1, 100L, 52L);
        tripsConfig4.setMinimalTripDistance(300000.0d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(52L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) 'a', 0L, (long) (byte) 100);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        long long23 = tripsConfig0.getMinimalParkingDuration();
        double double24 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        long long18 = tripsConfig0.getMinimalTripDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (-1), 0L, (long) 'a');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (short) 1, (long) (byte) -1, (long) 0);
        tripsConfig4.setMinimalParkingDuration(32L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        context0.Context();
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', 97L, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration(300000L);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) 32L);
        long long27 = tripsConfig0.getMinimalTripDuration();
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
        long long21 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        double double5 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 500.0d + "'", double5 == 500.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, (long) (short) 1, (long) 1, (long) 1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration(10L);
        long long14 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        java.lang.String str10 = context0.getFinal();
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, (-1L), (long) (short) 0, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) '#', 52L, (long) (byte) 0);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long12 = tripsConfig0.getMinimalTripDuration();
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (short) -1, (long) 'a', (long) '#');
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        tripsConfig0.setMinimalParkingDuration(100L);
        tripsConfig0.setMinimalParkingDuration(0L);
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
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) ' ', 1L);
        tripsConfig4.setMinimalParkingDuration((long) 100);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        java.lang.String str13 = context0.getFinal();
        java.lang.String str14 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        long long17 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 300000L + "'", long16 == 300000L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 300000L + "'", long17 == 300000L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) (short) 1, (long) (byte) 0, (long) (byte) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        tripsConfig0.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        double double13 = tripsConfig4.getMinimalTripDistance();
        double double14 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(1L);
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1.0f), (long) (byte) 10, 52L, (long) (short) 1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), 35L, 52L, 0L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) 10, (long) 100, 10L);
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(10.0d);
        tripsConfig4.setMinimalParkingDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, (long) 0, (long) 100, (long) 100);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 97L, 0L, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double6 = tripsConfig0.getMinimalTripDistance();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) (byte) -1, 1L, (long) (short) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (-1L), 32L, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 97L, 0L, 100L, (-1L));
        tripsConfig4.setMinimalTripDistance((double) 300000L);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(52.0d);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(3600000.0d, 35L, (long) (byte) 10, 300000L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, 52L, 32L, (long) 'a');
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        long long8 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        context0.Context();
        java.lang.String str12 = context0.getFinal();
        context0.Context();
        java.lang.String str14 = context0.getFinal();
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, 10L, 32L, (long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(300000L);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        context0.Context();
        java.lang.String str14 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        long long9 = tripsConfig4.getMinimalTripDuration();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) (-1), (long) (byte) -1, (long) (byte) 0);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(300000L);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        long long26 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) 'a', (long) (-1), 52L);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) '4', 3600000L, (-1L));
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        long long10 = tripsConfig4.getMinimalTripDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        long long18 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, 100L, 1L, 1L);
        tripsConfig4.setMinimalParkingDuration(100L);
        tripsConfig4.setMinimalTripDistance((-1.0d));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 10, (long) (byte) 0, (long) (-1), (long) 10);
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, (long) (short) 10, 3600000L, 52L);
        tripsConfig4.setMinimalTripDuration((long) (-1));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, 32L, 10L, 300000L);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass2 = context0.getClass();
        context0.Context();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.Class<?> wildcardClass3 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long13 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, (long) (short) 1, (long) (byte) -1, (long) (short) 100);
        tripsConfig4.setMinimalNoDataDuration(3600000L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) 0);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        double double11 = tripsConfig0.getMinimalTripDistance();
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, (long) (byte) -1, 97L, (long) 'a');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
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
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) '4');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalParkingDuration((long) (short) 100);
        long long16 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(100.0d);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, 35L, 97L, (long) (short) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, (long) '#', 0L, 0L);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        long long19 = tripsConfig0.getMinimalParkingDuration();
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
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 500.0d + "'", double4 == 500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        double double16 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
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
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0L, (long) '#', (long) 0, (long) (short) -1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, 52L, (long) (-1), 3600000L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) ' ', 300000L, (long) (short) 100, (long) ' ');
        tripsConfig4.setMinimalTripDistance((double) 'a');
        tripsConfig4.setMinimalTripDuration(3600000L);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 10, 52L, (long) '#');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) 100, 1L, (long) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1, (long) 100, (long) '4', (long) (short) 0);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        double double9 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalTripDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        tripsConfig0.setMinimalTripDuration(32L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        tripsConfig0.setMinimalTripDuration(97L);
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        java.lang.String str12 = context0.getFinal();
        java.lang.String str13 = context0.getFinal();
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(10L);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) (byte) 0, 3600000L, (long) (short) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(10L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(500.0d, 3600000L, (long) '#', (long) 10);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) (byte) 10, (long) 0, (long) 'a');
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        tripsConfig0.setMinimalParkingDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), (long) ' ', (long) 1, (long) (short) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        tripsConfig0.setMinimalTripDuration(100L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 300000L + "'", long12 == 300000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration(100L);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        double double18 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) (byte) 0, 3600000L, (long) (short) 0);
        tripsConfig4.setMinimalTripDuration(0L);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) 100, (long) (byte) 100, (long) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, (long) 'a', 97L, (long) 0);
        tripsConfig4.setMinimalTripDuration(300000L);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3600000L + "'", long13 == 3600000L);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        tripsConfig0.setMinimalParkingDuration(10L);
        tripsConfig0.setMinimalTripDistance(32.0d);
        long long19 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, (long) (short) 100, (long) '#', (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 300000.0d + "'", double6 == 300000.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 3600000L, (long) (byte) -1, 32L, 300000L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalNoDataDuration(100L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 300000L);
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) 'a', (-1L), (long) (short) 100);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        double double21 = tripsConfig0.getMinimalTripDistance();
        long long22 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        long long2 = tripsConfig0.getMinimalTripDuration();
        double double3 = tripsConfig0.getMinimalTripDistance();
        long long4 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300000L + "'", long2 == 300000L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 500.0d + "'", double3 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '4', (long) '#', (long) (short) 0, 10L);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) (byte) 1, (long) (short) 10, (long) (short) 100);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, (long) (-1), (long) (byte) 1, (-1L));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        tripsConfig0.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, 52L, (long) 'a', (long) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str14 = context0.getFinal();
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3600000L + "'", long12 == 3600000L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), 0L, (long) (byte) 100, 32L);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        java.lang.String str12 = context0.getFinal();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 3600000L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 300000L + "'", long6 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 300000L + "'", long7 == 300000L);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((-1.0d), (long) 10, 52L, (long) (short) -1);
        tripsConfig4.setMinimalParkingDuration((long) '4');
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) (byte) 10, 35L, (-1L));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, 0L, (long) (byte) 1, (long) (short) 100);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalTripDistance((double) '#');
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (-1L), (long) '4');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(300000L);
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 300000L, 10L, 32L, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 300000.0d + "'", double7 == 300000.0d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(1.0d, (long) (short) 100, (long) 1, 0L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        long long24 = tripsConfig0.getMinimalNoDataDuration();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10L, (long) (-1), (long) (byte) 1, (long) (short) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) (byte) 10, 35L, (-1L));
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, (long) '4', (long) (short) 1, (long) (byte) 10);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 'a');
        tripsConfig0.setMinimalTripDuration(100L);
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) 10);
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, 52L, (long) (short) -1, (long) (short) 10);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        context0.Context();
        context0.Context();
        java.lang.String str12 = context0.getFinal();
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 32L, (long) (byte) 100, 10L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(97L);
        double double8 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalTripDuration(100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) 1, (long) (byte) 10, (long) (-1));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(52.0d, (long) (byte) -1, (long) 0, 3600000L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(32.0d, 0L, (long) 'a', 10L);
        tripsConfig4.setMinimalParkingDuration((long) '4');
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        double double21 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(100.0d, 0L, 1L, 1L);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalParkingDuration(1L);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalTripDuration();
        double double14 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, 32L, (long) 100, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        tripsConfig0.setMinimalNoDataDuration(3600000L);
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 97L, 10L, (long) (byte) 100, 0L);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (short) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1), 52L, (long) (short) 1, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 10L, (long) 100, (long) (short) 10);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, (long) 0, 300000L, 10L);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) 0, (long) 1, (long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration(300000L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration(10L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, 100L, (long) (byte) 0, (long) 1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) '#', 3600000L, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        tripsConfig0.setMinimalTripDistance((double) 10);
        long long17 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDuration(1L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDuration(97L);
        double double12 = tripsConfig4.getMinimalTripDistance();
        double double13 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) -1, (long) 100, 52L);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 1, (long) '#', (long) 10, (long) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0.0f);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) -1, 97L, (long) (byte) 1, 3600000L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalParkingDuration(0L);
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.Class<?> wildcardClass7 = context0.getClass();
        context0.Context();
        context0.Context();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 52L);
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 300000L + "'", long14 == 300000L);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) -1, 0L, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        long long15 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        double double17 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 32L, (long) (byte) 0, 3600000L, 0L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        tripsConfig0.setMinimalNoDataDuration(300000L);
        tripsConfig0.setMinimalParkingDuration((long) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 'a', (long) '4', (long) (short) -1, (long) '4');
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) 10, (long) 100, 10L);
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(10.0d);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        long long19 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig(0.0d, (long) (-1), (long) (short) 10, (long) 10);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) ' ');
        long long9 = tripsConfig4.getMinimalTripDuration();
        double double10 = tripsConfig4.getMinimalTripDistance();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(3600000.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        double double7 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 500.0d + "'", double7 == 500.0d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100, 32L, (long) 100, (long) (byte) -1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 300000L + "'", long10 == 300000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) '#', 97L, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 100L, (long) (byte) 100, (long) 'a', (long) 10);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        long long2 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass3 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(32L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 300000L + "'", long2 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10, 52L, (-1L), (long) (short) -1);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 100, (long) 'a', 0L, (long) 'a');
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1.0f, (long) 100, 100L, (long) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        double double8 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(3600000L);
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 'a');
        tripsConfig0.setMinimalTripDuration(100L);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        double double8 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 'a', (long) 1, (long) (short) 100, 0L);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 35L, 52L, (long) (short) 100, 0L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration(52L);
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(300000L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 52L, (long) (-1), (long) ' ', 300000L);
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, (long) '#', 3600000L, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600000L + "'", long5 == 3600000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) -1, (long) (short) 100, (long) 100, (long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 3600000L);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000L + "'", long10 == 3600000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3600000L + "'", long3 == 3600000L);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long14 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 100, (long) (short) 100, 300000L, 0L);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) 0);
        double double11 = tripsConfig0.getMinimalTripDistance();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3600000L + "'", long16 == 3600000L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration(0L);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 300000L + "'", long9 == 300000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 500.0d + "'", double10 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 300000L + "'", long13 == 300000L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 500.0d + "'", double16 == 500.0d);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        tripsConfig0.setMinimalTripDuration(10L);
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalTripDistance((double) 97L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        long long24 = tripsConfig0.getMinimalParkingDuration();
        long long25 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        long long15 = tripsConfig0.getMinimalParkingDuration();
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3600000L + "'", long14 == 3600000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (-1L), (long) (-1), (-1L), (-1L));
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(500.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0, 3600000L, 32L, (long) 0);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 1L, (long) '#', (long) (short) 1, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(52L);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (byte) 10, (long) '4', (long) 1, (long) (byte) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        long long15 = tripsConfig0.getMinimalTripDuration();
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3600000L + "'", long9 == 3600000L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDistance((double) 32L);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        tripsConfig0.setMinimalTripDuration((long) 100);
        tripsConfig0.setMinimalTripDuration(0L);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        tripsConfig0.setMinimalTripDistance((double) 1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 500.0d + "'", double6 == 500.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 300000L + "'", long11 == 300000L);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 300000L + "'", long15 == 300000L);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.Class<?> wildcardClass4 = context0.getClass();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(300000.0d);
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) 100);
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 500.0d + "'", double1 == 500.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3600000L + "'", long7 == 3600000L);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.br.TripsConfig tripsConfig0 = org.br.Context.initTripsConfig();
        long long1 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(tripsConfig0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 300000L + "'", long1 == 300000L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 300000L + "'", long4 == 300000L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 300000L + "'", long5 == 300000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 300000L + "'", long8 == 300000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) (short) 0, (long) (short) 0, 10L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration(52L);
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalNoDataDuration(0L);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.br.TripsConfig tripsConfig4 = new org.br.TripsConfig((double) 0.0f, 10L, (long) (short) 0, 3600000L);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        context0.Context();
        java.lang.String str15 = context0.getFinal();
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.br.Context context0 = new org.br.Context();
        context0.Context();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
    }
}

