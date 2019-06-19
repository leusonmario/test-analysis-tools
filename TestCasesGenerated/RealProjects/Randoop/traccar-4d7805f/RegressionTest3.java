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
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDistance((-1.0d));
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDuration(97L);
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        double double22 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass23 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) '#', (long) (short) 0, (long) 0);
        tripsConfig4.setMinimalTripDistance((double) 32L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        long long13 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig4.setMinimalTripDistance((double) 32L);
        tripsConfig4.setMinimalTripDuration((long) ' ');
        double double19 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) '#', (long) (-1), (long) (byte) 1);
        tripsConfig4.setMinimalTripDistance((double) (-1.0f));
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 52L, (long) '#', 100L, 1L);
        tripsConfig4.setMinimalTripDistance((double) (short) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (long) 10, (long) 1, 100L);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        tripsConfig4.setMinimalTripDuration(0L);
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) -1, (long) 100, 0L, (long) (byte) 100);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(100.0d, 35L, (long) (short) 0, 100L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 52L, (long) '#', 100L, 1L);
        tripsConfig4.setMinimalTripDistance((double) (short) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        double double8 = tripsConfig4.getMinimalTripDistance();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        double double11 = tripsConfig4.getMinimalTripDistance();
        double double12 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(100L);
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        long long16 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        long long17 = tripsConfig4.getMinimalParkingDuration();
        double double18 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 1, (long) '4', (long) (short) -1, (long) '#');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10);
        double double11 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long3 = tripsConfig0.getMinimalParkingDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(97L);
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', (long) 'a', (long) 'a', (long) 0);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) ' ', (long) '4', (long) (short) 100, 100L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (-1L), 10L, (long) '#');
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) -1, 0L, (long) (short) 0, (long) ' ');
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalTripDuration((-1L));
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig4.setMinimalTripDuration((long) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 10L, 32L, (long) 100);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 10L);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) '#');
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        double double15 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        long long17 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 35L, (long) (byte) 1, (long) (short) 1, (long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) ' ');
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 'a', (long) 'a', (long) ' ');
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10L, 97L, (long) 'a', (long) 1);
        tripsConfig4.setMinimalTripDistance((double) 97L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass20 = tripsConfig4.getClass();
        double double21 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalTripDistance((double) 'a');
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) ' ');
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(35L);
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double15 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) 0L);
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100.0f, (long) '#', (long) (short) 0, (long) (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) ' ', 35L, 100L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalTripDuration(10L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100, (long) ' ', (long) (byte) 0, (long) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', (long) 100, 97L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalNoDataDuration(1L);
        double double15 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) -1);
        long long18 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 0L, (long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDuration((long) '4');
        long long9 = tripsConfig4.getMinimalTripDuration();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration(97L);
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 1, (long) (short) 10, 35L, (long) 'a');
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        tripsConfig4.setMinimalTripDistance((double) 100);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(97.0d, (long) (byte) 100, 32L, (long) '4');
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 10, (long) (short) 10, (long) (short) -1);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(97L);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100L, (long) ' ', 100L, 35L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 10L);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        double double15 = tripsConfig4.getMinimalTripDistance();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        long long17 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        double double14 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(52L);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0, (-1L), (long) (byte) -1, (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100L, (long) (short) 1, 97L, 0L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        tripsConfig4.setMinimalTripDuration(1L);
        tripsConfig4.setMinimalTripDistance((double) 10);
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        long long16 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) 0, (long) (byte) 1, (long) (byte) 100);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration(97L);
        tripsConfig4.setMinimalTripDuration(35L);
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) -1, 10L, 35L, (long) 'a');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) 0, 100L, (long) (short) 100);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        long long17 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 100, (long) (-1), (long) 'a', (long) 'a');
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalParkingDuration(10L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) '4', (long) 10, (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, 1L, (long) (byte) 1, (long) 0);
        tripsConfig4.setMinimalTripDuration(1L);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), 52L, (long) (byte) 0, (long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (-1L));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        long long17 = tripsConfig4.getMinimalTripDuration();
        double double18 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long3 = tripsConfig0.getMinimalParkingDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) '4');
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        double double16 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        double double9 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) '#');
        long long11 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 0, 0L, (long) (short) 10, 10L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        long long1 = tripsConfig0.getMinimalTripDuration();
        double double2 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        tripsConfig4.setMinimalTripDuration(1L);
        tripsConfig4.setMinimalTripDistance((double) 10);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        long long17 = tripsConfig4.getMinimalParkingDuration();
        long long18 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(35.0d, (long) 100, (long) 1, 0L);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 10, 0L, 1L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalParkingDuration((long) (short) 100);
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) (byte) 1, (long) (byte) 10, 32L);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) '#', (long) (short) 0, (long) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) 100L);
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 100, 0L, 100L, 52L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', (long) 100, 97L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, 0L, (long) (short) 10, (long) (short) 100);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalTripDistance((double) 'a');
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(97.0d);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(1L);
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), (long) 'a', (long) (-1), 97L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalParkingDuration(97L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) ' ', 97L, (long) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
        long long16 = tripsConfig4.getMinimalParkingDuration();
        long long17 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long20 = tripsConfig4.getMinimalNoDataDuration();
        long long21 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((-1L));
        long long12 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(35.0d);
        double double16 = tripsConfig4.getMinimalTripDistance();
        long long17 = tripsConfig4.getMinimalTripDuration();
        double double18 = tripsConfig4.getMinimalTripDistance();
        double double19 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1), (long) 100, (long) (short) 100, 100L);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 10, (long) (short) 10, (long) (short) -1, (long) (short) 100);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        long long17 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 10);
        tripsConfig4.setMinimalTripDistance((-1.0d));
        tripsConfig4.setMinimalTripDistance((double) 1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        double double12 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) 100);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        double double11 = tripsConfig4.getMinimalTripDistance();
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        long long19 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0.0f, (long) (byte) 10, (long) (short) 10, (long) '4');
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100L, (long) (short) 0, (long) (short) 1, (long) 1);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100.0f, (long) (short) 10, 52L, (long) '#');
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) 1L);
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) '#');
        long long16 = tripsConfig4.getMinimalTripDuration();
        double double17 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        double double19 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, (long) (-1), 97L, (-1L));
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 100);
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalNoDataDuration(10L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 1);
        tripsConfig4.setMinimalParkingDuration(10L);
        long long26 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        long long15 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        long long19 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass20 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '4', (long) 100, (long) (-1), 0L);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        tripsConfig4.setMinimalTripDuration(1L);
        tripsConfig4.setMinimalTripDistance((double) 10);
        double double15 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((-1L));
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        long long20 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (long) 10, (long) 1, 100L);
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) '#');
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass19 = tripsConfig4.getClass();
        long long20 = tripsConfig4.getMinimalTripDuration();
        double double21 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 35L, (-1L), 10L, (long) (short) 1);
        tripsConfig4.setMinimalNoDataDuration(1L);
        tripsConfig4.setMinimalNoDataDuration(10L);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) 100, (long) (-1), 10L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalTripDistance((double) 32L);
        tripsConfig4.setMinimalParkingDuration((long) 10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) '#');
        tripsConfig4.setMinimalTripDistance((double) 'a');
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalTripDuration(52L);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (long) 0, (long) '4', (long) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) (short) 100);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) '4');
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) 0, (long) (byte) 1, (long) (byte) 100);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 'a');
        tripsConfig4.setMinimalTripDistance((double) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) 0);
        tripsConfig4.setMinimalParkingDuration((long) 100);
        tripsConfig4.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1, 52L, (long) '#', (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (long) 10, (long) 1, 100L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig4.setMinimalTripDuration(1L);
        tripsConfig4.setMinimalTripDistance((double) 35L);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration((-1L));
        double double5 = tripsConfig0.getMinimalTripDistance();
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        double double8 = tripsConfig4.getMinimalTripDistance();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), 1L, (long) (-1), (long) '#');
        tripsConfig4.setMinimalParkingDuration(0L);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) 0, (long) 10, (long) (short) -1);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalTripDistance((double) 'a');
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(97.0d);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) '#');
        tripsConfig4.setMinimalTripDistance((double) 52L);
        tripsConfig4.setMinimalTripDistance((double) 10);
        tripsConfig4.setMinimalTripDuration(100L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10L, 52L, (long) (byte) -1, 10L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), (long) (short) 1, (long) (byte) 1, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDuration(52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(35.0d, (long) (short) 10, (long) 100, 10L);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) ' ', (long) ' ', 32L);
        tripsConfig4.setMinimalTripDistance(100.0d);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(32.0d, (long) '4', (long) (byte) 0, 0L);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1, 52L, (long) '#', (long) ' ');
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 10L, (long) (short) 10, (long) 100);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        long long16 = tripsConfig4.getMinimalTripDuration();
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        long long18 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 1, (long) ' ', (long) (byte) -1, (long) 'a');
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) 52L);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(97L);
        tripsConfig4.setMinimalTripDistance((-1.0d));
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 0L, (long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDuration((long) '4');
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 100, (long) 'a', (long) 0, (long) (short) 10);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        java.lang.Class<?> wildcardClass21 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, 1L, (long) 100, (-1L));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        double double8 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(32L);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', (long) 100, 97L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalParkingDuration((long) 1);
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalNoDataDuration(97L);
        tripsConfig4.setMinimalParkingDuration(0L);
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalTripDistance((double) 'a');
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(97.0d);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(97.0d, (long) 10, (long) ' ', (long) (short) 10);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), 32L, (long) (byte) 1, 10L);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 1, 1L, (long) 0, (long) '#');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) (byte) 1, (long) (byte) 1, (long) (short) 1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), (long) (byte) 1, 97L, (long) (short) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDistance((double) '4');
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(97.0d, (long) (short) -1, 100L, (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(1L);
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 'a', 0L, 32L);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', (long) (byte) 0, (long) (short) 0, 32L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double15 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) 0L);
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        long long20 = tripsConfig4.getMinimalTripDuration();
        double double21 = tripsConfig4.getMinimalTripDistance();
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        long long23 = tripsConfig4.getMinimalParkingDuration();
        long long24 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(35.0d, (long) '#', (long) (short) -1, (long) ' ');
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10);
        tripsConfig4.setMinimalTripDistance((double) 97L);
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        double double19 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDuration(52L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), (long) (byte) 1, 52L, (long) (-1));
        tripsConfig4.setMinimalTripDuration(0L);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDuration(10L);
        tripsConfig4.setMinimalTripDistance((double) 52L);
        tripsConfig4.setMinimalTripDuration(10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) 10);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long21 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration(0L);
        long long16 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        long long18 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long21 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, 0L, 0L, (long) (short) -1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (short) 100);
        tripsConfig4.setMinimalParkingDuration(1L);
        java.lang.Class<?> wildcardClass19 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) -1, (long) 'a', (long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalParkingDuration((long) 100);
        long long13 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        double double19 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (short) 1);
        tripsConfig4.setMinimalParkingDuration(32L);
        long long24 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass25 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) -1, (long) (byte) 100, 97L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (-1));
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, (long) (byte) -1, (long) 1, 52L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) 100, (long) (-1), 10L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) 1);
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDistance((double) 0L);
        long long14 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, (long) 0, 1L, 0L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration(1L);
        tripsConfig4.setMinimalParkingDuration((long) 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', (long) 100, 97L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig4.setMinimalTripDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 100, (long) (short) -1, 0L, (long) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(35L);
        tripsConfig4.setMinimalTripDistance((double) '#');
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(1.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) '#');
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        double double21 = tripsConfig4.getMinimalTripDistance();
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        double double23 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass24 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', (long) 100, 97L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        long long14 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(100.0d, 35L, (long) (short) 0, 100L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, 10L, (long) (byte) 1, (long) '4');
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) 1);
        double double12 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (byte) 1, 32L, (long) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) ' ', (long) 0, (long) '4');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) ' ', (long) '4', (long) (short) 100, 100L);
        tripsConfig4.setMinimalTripDuration((long) 100);
        tripsConfig4.setMinimalTripDuration((long) ' ');
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) 100, (long) (-1), 10L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) 1);
        double double10 = tripsConfig4.getMinimalTripDistance();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) 100, (long) 100, (long) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalNoDataDuration(97L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration((long) 100);
        tripsConfig4.setMinimalTripDuration((-1L));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double15 = tripsConfig4.getMinimalTripDistance();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        double double17 = tripsConfig4.getMinimalTripDistance();
        long long18 = tripsConfig4.getMinimalTripDuration();
        double double19 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        long long22 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 0L, (long) (byte) -1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', (long) ' ', (long) (-1), (long) (short) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalTripDuration(10L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        java.lang.Class<?> wildcardClass15 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 10);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig4.setMinimalTripDistance((double) (byte) -1);
        tripsConfig4.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) -1, (long) ' ', (long) 10, (long) (short) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration(32L);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration(10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', 100L, (long) (byte) -1, (long) (byte) -1);
        tripsConfig4.setMinimalParkingDuration((long) 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) -1, (long) (byte) 100, 97L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (-1));
        java.lang.Class<?> wildcardClass8 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        tripsConfig4.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 10, (long) (byte) -1, (long) (byte) 10, 35L);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 0L, (long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDuration((long) '4');
        long long9 = tripsConfig4.getMinimalTripDuration();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalTripDistance(10.0d);
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, 32L, 35L, (long) 1);
        tripsConfig4.setMinimalTripDuration(1L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) (short) 0, 0L, (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) 0, (long) 'a', (-1L));
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 10, (-1L), (long) (short) 0, (long) (short) 100);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1), (long) (short) -1, (long) (byte) -1, (long) (short) 10);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', (long) 100, 97L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalTripDuration(97L);
        tripsConfig4.setMinimalTripDuration(1L);
        tripsConfig4.setMinimalTripDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10L, 10L, (long) (-1), (long) 'a');
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        tripsConfig4.setMinimalTripDistance((double) 0L);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(52L);
        tripsConfig0.setMinimalTripDuration((long) ' ');
        tripsConfig0.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) '#');
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (-1L), (long) (byte) 1, (long) 10);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) ' ', (long) (-1), (long) (byte) 1, (long) (byte) -1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 97L, (long) (byte) 10, 1L);
        tripsConfig4.setMinimalTripDuration((long) '4');
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 1L, 0L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) '#');
        tripsConfig4.setMinimalTripDuration((-1L));
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        double double11 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100L, (long) ' ', 100L, 35L);
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        long long16 = tripsConfig4.getMinimalParkingDuration();
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) -1, (long) 'a', (long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double11 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long14 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) ' ', 0L, (long) 0, 1L);
        tripsConfig4.setMinimalTripDuration(0L);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration(100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalTripDuration(10L);
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 1, 97L, 32L, (long) '4');
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalParkingDuration(52L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) (byte) 0, 0L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        tripsConfig4.setMinimalTripDistance((double) 100.0f);
        long long16 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, 97L, (long) (-1), 32L);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        long long17 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) '#');
        tripsConfig4.setMinimalTripDuration((long) 100);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long16 = tripsConfig4.getMinimalTripDuration();
        long long17 = tripsConfig4.getMinimalTripDuration();
        double double18 = tripsConfig4.getMinimalTripDistance();
        long long19 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) -1, (long) ' ', 100L);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) '4');
        long long14 = tripsConfig4.getMinimalParkingDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        double double16 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalParkingDuration();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10L, (-1L), 35L, (long) ' ');
        tripsConfig4.setMinimalParkingDuration(10L);
        tripsConfig4.setMinimalTripDuration((long) 0);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) '#', (long) (short) 0, (long) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        double double6 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) '#');
        tripsConfig4.setMinimalTripDistance(100.0d);
        double double13 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        double double15 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (byte) 1, 32L, (long) 10);
        tripsConfig4.setMinimalParkingDuration(10L);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1L), (long) ' ', 10L, 0L);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100L, (long) 100, (long) 0, (long) 0);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 0L, (long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalTripDuration((long) '4');
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long11 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, 52L, (long) (byte) 10, (long) '#');
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), (long) '#', 0L, (long) (byte) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(35.0d, (long) ' ', (long) (short) 1, (long) (short) -1);
        tripsConfig4.setMinimalTripDuration(35L);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration(32L);
        long long21 = tripsConfig4.getMinimalNoDataDuration();
        long long22 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 0);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 10, (-1L), (long) 100, 10L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) 0, 0L, (long) 'a');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration(32L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100.0f, 0L, 0L, 1L);
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) (byte) 0, (long) (byte) 0, 100L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 1);
        tripsConfig4.setMinimalTripDistance((double) 52L);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        long long10 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        long long17 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 10);
        java.lang.Class<?> wildcardClass20 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 97L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', 1L, (long) (short) -1, 52L);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), 0L, (long) (byte) 100, (long) (short) 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(52.0d, (long) 100, (long) 1, (long) (byte) 100);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 1, (long) 1, 10L, (long) (short) 10);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDistance((-1.0d));
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDistance((double) 35L);
        long long18 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(35.0d, (long) ' ', (long) (short) 1, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', (long) ' ', (long) (-1), (long) (short) 1);
        tripsConfig4.setMinimalTripDistance((double) (-1.0f));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalTripDuration(10L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalTripDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration((-1L));
        long long5 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) -1, (long) 'a', (long) (short) 1, (long) (short) -1);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(1.0d);
        double double11 = tripsConfig4.getMinimalTripDistance();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(10.0d);
        tripsConfig4.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        long long17 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 97L, 32L, 97L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) '4', (long) '#', (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        tripsConfig4.setMinimalNoDataDuration(52L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long17 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) '#');
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        double double16 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDistance((-1.0d));
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        double double16 = tripsConfig4.getMinimalTripDistance();
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalTripDistance((double) 'a');
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1, (long) (byte) 0, (long) (short) 1, (long) ' ');
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 10L);
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        double double15 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) '#');
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        long long17 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration(52L);
        java.lang.Class<?> wildcardClass20 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        double double11 = tripsConfig4.getMinimalTripDistance();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        double double19 = tripsConfig4.getMinimalTripDistance();
        double double20 = tripsConfig4.getMinimalTripDistance();
        double double21 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        long long14 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        long long17 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) (byte) 10, 10L, (long) (byte) 10);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100, 10L, 0L, (long) 1);
        tripsConfig4.setMinimalParkingDuration((long) '4');
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((-1L));
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) '#');
        tripsConfig4.setMinimalTripDuration((long) 10);
        tripsConfig4.setMinimalTripDuration((-1L));
        tripsConfig4.setMinimalTripDistance((double) 10L);
        long long16 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalNoDataDuration(97L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        double double11 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0, (long) (short) 100, (long) (byte) -1, (long) (byte) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        double double11 = tripsConfig4.getMinimalTripDistance();
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        long long21 = tripsConfig4.getMinimalNoDataDuration();
        double double22 = tripsConfig4.getMinimalTripDistance();
        long long23 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) ' ', 0L, 10L, (long) (short) 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(10L);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(35L);
        long long17 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalParkingDuration();
        double double16 = tripsConfig4.getMinimalTripDistance();
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) -1, 97L, 0L, (long) 'a');
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        tripsConfig4.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        tripsConfig4.setMinimalParkingDuration(97L);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        double double8 = tripsConfig4.getMinimalTripDistance();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (byte) 100, (-1L), (long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) 0);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (short) 100);
        tripsConfig4.setMinimalParkingDuration(10L);
        java.lang.Class<?> wildcardClass19 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((-1L));
        long long10 = tripsConfig4.getMinimalParkingDuration();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) -1, (long) 'a', (long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalParkingDuration((long) (short) 10);
        tripsConfig4.setMinimalParkingDuration((long) 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 1, (long) 10, 35L, (long) 1);
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalNoDataDuration(35L);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) -1, (long) ' ', (long) 10, (long) (short) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        long long15 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 1L, 0L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) '#');
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((-1L));
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) '#', (long) (short) 0, (long) 0);
        tripsConfig4.setMinimalTripDistance((double) 32L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 10, (-1L), 52L, (long) 10);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, (long) (-1), 97L, (-1L));
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        tripsConfig4.setMinimalTripDistance((double) 100L);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) '#', (long) (-1), (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 1, 100L, 0L, (long) 10);
        tripsConfig4.setMinimalTripDuration(52L);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(35.0d, (long) (byte) -1, (long) (short) 1, (long) '#');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) 10);
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(100L);
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        long long25 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        double double28 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) '#');
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(100.0d, (long) 'a', 32L, 0L);
        tripsConfig4.setMinimalNoDataDuration(97L);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(100L);
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0.0f, 10L, 32L, (long) (byte) 10);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        double double11 = tripsConfig4.getMinimalTripDistance();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalNoDataDuration(100L);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', (long) ' ', (long) (-1), (long) (short) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        long long17 = tripsConfig4.getMinimalParkingDuration();
        double double18 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass19 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) 1, (long) (short) 10, (long) '#');
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10, (long) 1, (long) (byte) 0, 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long11 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        tripsConfig4.setMinimalTripDistance((double) 0);
        double double19 = tripsConfig4.getMinimalTripDistance();
        double double20 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 100, 0L, 1L, 35L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, 100L, (long) 'a', (long) (short) 1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration(52L);
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        long long19 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(1L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig4.getClass();
        double double16 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
        java.lang.Class<?> wildcardClass15 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) '4');
        tripsConfig4.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDuration((long) '4');
        tripsConfig4.setMinimalNoDataDuration(35L);
        double double16 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long19 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) -1, 10L, 35L, (long) 'a');
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), (long) (byte) 1, 97L, (long) (short) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(0L);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(32.0d, (long) (short) 10, 32L, (-1L));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration((long) '#');
        long long16 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig4.setMinimalTripDistance((double) (byte) -1);
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(97.0d, (long) (byte) 0, (long) 100, (long) '#');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        double double6 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) (byte) 0, 0L);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        long long9 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        tripsConfig4.setMinimalTripDuration((long) '#');
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) 10L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 100, 0L, (long) (-1), (long) 100);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        double double11 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long15 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 52L, 52L, (long) (short) 0, (long) 1);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10, (long) '4', (long) (short) 1, (long) (byte) 0);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) '#');
        tripsConfig4.setMinimalTripDuration((long) 100);
        long long12 = tripsConfig4.getMinimalTripDuration();
        long long13 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) (byte) 100, (long) (byte) 100, (long) (short) -1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) 0, (long) (byte) 1, (long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalTripDistance((double) 32L);
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, (long) (-1), 97L, (-1L));
        long long5 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) '#');
        tripsConfig4.setMinimalTripDistance((double) 52L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10L, (long) (byte) 10, (long) (byte) -1, (long) (short) 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalTripDistance((-1.0d));
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        double double16 = tripsConfig4.getMinimalTripDistance();
        long long17 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((-1L));
        long long12 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) (short) 100, (long) 10, 0L);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 10L, (long) (byte) 100, (long) 1);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) ' ', 97L, (long) 1);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration(100L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), (-1L), (long) (byte) 1, 10L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDistance(1.0d);
        long long11 = tripsConfig4.getMinimalTripDuration();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double15 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        double double14 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalParkingDuration((long) '#');
        long long19 = tripsConfig4.getMinimalNoDataDuration();
        long long20 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalTripDuration(10L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 0L, 1L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        double double7 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(97.0d, (long) (byte) 10, (long) 10, (long) (byte) 0);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 100, 0L, 100L, (long) '#');
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalTripDuration(35L);
        long long15 = tripsConfig4.getMinimalTripDuration();
        double double16 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1, (long) (byte) 10, (-1L), (long) (short) 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) ' ', 97L, (long) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration(52L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        long long4 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', (long) 100, 97L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', (long) 'a', (long) 'a', (long) 0);
        tripsConfig4.setMinimalNoDataDuration(0L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        long long14 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        tripsConfig4.setMinimalTripDistance(10.0d);
        tripsConfig4.setMinimalTripDuration(0L);
        long long17 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10, 100L, (long) '4', 97L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        tripsConfig4.setMinimalTripDistance((double) 'a');
        long long7 = tripsConfig4.getMinimalParkingDuration();
        double double8 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) (byte) 0, 52L, 32L);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        long long12 = tripsConfig4.getMinimalTripDuration();
        double double13 = tripsConfig4.getMinimalTripDistance();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), (long) '#', 0L, (long) (byte) 10);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) (byte) 0, (long) 0, 32L);
        tripsConfig4.setMinimalTripDuration(52L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 10L, (long) (byte) 100, (long) 1);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration(97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(35.0d);
        double double16 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) (byte) 0);
        long long20 = tripsConfig4.getMinimalTripDuration();
        long long21 = tripsConfig4.getMinimalNoDataDuration();
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) ' ', 1L, 0L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(1L);
        long long18 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass19 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        double double11 = tripsConfig4.getMinimalTripDistance();
        double double12 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(100L);
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) 10);
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(100L);
        double double22 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalParkingDuration(10L);
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) (short) 10);
        long long17 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) ' ', 97L, (long) 1);
        tripsConfig4.setMinimalParkingDuration((long) (short) 10);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalTripDuration();
        long long11 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalTripDuration((long) (short) 0);
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalNoDataDuration(35L);
        tripsConfig4.setMinimalTripDuration((long) (byte) -1);
        tripsConfig4.setMinimalTripDistance(35.0d);
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) ' ', 97L, (long) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 100L, (long) ' ', 100L, 35L);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 100, (long) (byte) -1, 97L, 0L);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((-1L));
        long long18 = tripsConfig4.getMinimalNoDataDuration();
        long long19 = tripsConfig4.getMinimalParkingDuration();
        long long20 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, (long) (-1), 97L, (-1L));
        long long5 = tripsConfig4.getMinimalTripDuration();
        double double6 = tripsConfig4.getMinimalTripDistance();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 10L, (long) (byte) 100, (long) 1);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        tripsConfig4.setMinimalNoDataDuration(32L);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        double double11 = tripsConfig4.getMinimalTripDistance();
        double double12 = tripsConfig4.getMinimalTripDistance();
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (-1L), (long) (-1), 97L);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (long) 0, (long) '4', (long) 10);
        tripsConfig4.setMinimalTripDuration((-1L));
        tripsConfig4.setMinimalNoDataDuration((long) '4');
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(52.0d, (long) 1, 97L, (long) (short) 10);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) 0, (long) (byte) 1, (long) (byte) 100);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(35.0d);
        double double16 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration(32L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), (long) (byte) 1, 52L, (long) (-1));
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalNoDataDuration((-1L));
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        long long14 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) 100L);
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalNoDataDuration();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) '#', (long) (short) 0, (long) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        double double6 = tripsConfig4.getMinimalTripDistance();
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(10L);
        tripsConfig4.setMinimalTripDistance((double) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalParkingDuration((long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        double double20 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        long long5 = tripsConfig4.getMinimalNoDataDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig4.setMinimalTripDistance(32.0d);
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) '#');
        tripsConfig4.setMinimalTripDuration((long) 100);
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        long long16 = tripsConfig4.getMinimalTripDuration();
        long long17 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        double double7 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (-1));
        java.lang.Class<?> wildcardClass12 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) '#');
        tripsConfig4.setMinimalTripDistance((double) 52L);
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        long long21 = tripsConfig4.getMinimalNoDataDuration();
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        java.lang.Class<?> wildcardClass25 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (byte) 1, (long) 0, (long) '4');
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        double double11 = tripsConfig4.getMinimalTripDistance();
        long long12 = tripsConfig4.getMinimalTripDuration();
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        long long15 = tripsConfig4.getMinimalTripDuration();
        double double16 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        double double8 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalTripDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (long) '#', (long) (short) -1, (long) (short) 10);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 0L, (long) (byte) -1);
        tripsConfig4.setMinimalNoDataDuration((long) (short) -1);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        double double14 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(1L);
        long long17 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(35L);
        double double20 = tripsConfig4.getMinimalTripDistance();
        double double21 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 1L, 0L, (long) (byte) 10);
        tripsConfig4.setMinimalParkingDuration((long) '#');
        tripsConfig4.setMinimalTripDuration((-1L));
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 0, 52L, 0L, (long) (byte) 0);
        double double5 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalTripDuration((long) 'a');
        long long7 = tripsConfig4.getMinimalTripDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        long long10 = tripsConfig4.getMinimalTripDuration();
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(1.0d, (long) ' ', 35L, (long) (byte) 10);
        long long5 = tripsConfig4.getMinimalTripDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (byte) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalParkingDuration(97L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 0, 0L, (long) (short) 10, 10L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        double double11 = tripsConfig4.getMinimalTripDistance();
        double double12 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (byte) 100, (long) ' ', (long) (short) -1);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 35L, (-1L), (long) '4', (long) 0);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        tripsConfig4.setMinimalParkingDuration((long) 100);
        double double12 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 35L, (long) 1, 32L);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 1L, 1L, (long) 0, 97L);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, 52L, (long) (short) -1, (long) 100);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(97.0d, 100L, 52L, 10L);
        long long5 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double15 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalTripDistance(0.0d);
        long long20 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) ' ');
        tripsConfig4.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalTripDuration();
        long long12 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalNoDataDuration((long) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 1);
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        long long19 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 52L, (long) (byte) 10, 0L, (long) (short) 100);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 100);
        long long16 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        long long15 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(1L);
        tripsConfig4.setMinimalNoDataDuration(100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) '#', (long) ' ', (long) (-1), (long) (short) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) 0, (long) (byte) 1, (long) (byte) 100);
        tripsConfig4.setMinimalTripDuration((long) (byte) 100);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalParkingDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        double double11 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        double double10 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) -1, (long) 'a', (long) 1);
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        tripsConfig4.setMinimalParkingDuration((long) (short) 10);
        tripsConfig4.setMinimalTripDistance((double) 52L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        double double14 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig4.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass21 = tripsConfig4.getClass();
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 10, (long) (short) 10, 97L, 97L);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        long long15 = tripsConfig4.getMinimalParkingDuration();
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        tripsConfig4.setMinimalTripDuration(10L);
        long long10 = tripsConfig4.getMinimalNoDataDuration();
        long long11 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration(0L);
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        double double16 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((-1.0d), (long) (byte) 1, 97L, (long) (short) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig4.getClass();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        tripsConfig4.setMinimalTripDistance((double) (short) -1);
        tripsConfig4.setMinimalTripDistance((double) 10);
        java.lang.Class<?> wildcardClass17 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalNoDataDuration(100L);
        long long22 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) -1);
        long long25 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig4.setMinimalTripDistance((double) 100);
        double double30 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalParkingDuration(0L);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(10.0d);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, 0L, (long) ' ', (long) 0);
        tripsConfig4.setMinimalNoDataDuration((long) 0);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) -1, (long) 'a', (long) 1);
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        long long6 = tripsConfig4.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(0.0d, (long) 0, (long) ' ', (long) (short) 100);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) '#', (long) (-1), (long) (byte) 1);
        long long5 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(1L);
        tripsConfig4.setMinimalTripDuration((-1L));
        tripsConfig4.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        tripsConfig4.setMinimalTripDuration((long) (byte) 10);
        double double9 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) (short) 1);
        long long12 = tripsConfig4.getMinimalParkingDuration();
        long long13 = tripsConfig4.getMinimalParkingDuration();
        long long14 = tripsConfig4.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig4.getClass();
        java.lang.Class<?> wildcardClass16 = tripsConfig4.getClass();
        tripsConfig4.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        long long7 = tripsConfig4.getMinimalParkingDuration();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        long long9 = tripsConfig4.getMinimalNoDataDuration();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig(10.0d, (long) (short) 0, (long) (short) 1, 1L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) 52L);
        tripsConfig4.setMinimalParkingDuration((long) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        long long17 = tripsConfig4.getMinimalParkingDuration();
        long long18 = tripsConfig4.getMinimalTripDuration();
        double double19 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) '#', (long) (short) 0, (long) 0);
        tripsConfig4.setMinimalTripDistance((double) 32L);
        long long7 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalTripDistance((double) 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) 10, (long) (-1), (-1L));
        long long5 = tripsConfig4.getMinimalParkingDuration();
        long long6 = tripsConfig4.getMinimalParkingDuration();
        long long7 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalTripDuration(100L);
        tripsConfig4.setMinimalParkingDuration((long) (short) 1);
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        double double13 = tripsConfig4.getMinimalTripDistance();
        double double14 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 10L, 10L, (long) (-1), (long) 'a');
        tripsConfig4.setMinimalTripDistance((double) (-1L));
        tripsConfig4.setMinimalParkingDuration((long) 'a');
        tripsConfig4.setMinimalParkingDuration((long) '4');
        long long11 = tripsConfig4.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (short) 0, (long) (short) 1, (long) 1, (long) (-1));
        java.lang.Class<?> wildcardClass5 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalParkingDuration(97L);
        long long7 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration(10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        double double11 = tripsConfig4.getMinimalTripDistance();
        long long12 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        tripsConfig4.setMinimalParkingDuration((long) (byte) 100);
        long long17 = tripsConfig4.getMinimalParkingDuration();
        long long18 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        double double10 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        double double13 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance((double) '#');
        long long16 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass19 = tripsConfig4.getClass();
        long long20 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig4.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        long long6 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        java.lang.Class<?> wildcardClass9 = tripsConfig4.getClass();
        long long10 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalParkingDuration((-1L));
        long long13 = tripsConfig4.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        tripsConfig4.setMinimalTripDistance((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 0, (long) (-1), (long) (short) -1, 32L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) (byte) 1, (long) (byte) 0);
        tripsConfig4.setMinimalParkingDuration(35L);
        tripsConfig4.setMinimalTripDuration((long) (short) 1);
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 100);
        tripsConfig4.setMinimalTripDistance((double) 'a');
        java.lang.Class<?> wildcardClass14 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig4.getClass();
        tripsConfig4.setMinimalParkingDuration((long) (-1));
        long long13 = tripsConfig4.getMinimalTripDuration();
        long long14 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDuration((long) (short) -1);
        long long17 = tripsConfig4.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(35L);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(52L);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        tripsConfig4.setMinimalTripDistance(0.0d);
        tripsConfig4.setMinimalParkingDuration((long) ' ');
        tripsConfig4.setMinimalNoDataDuration((long) (byte) 0);
        java.lang.Class<?> wildcardClass18 = tripsConfig4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) 0, (long) '#', 35L);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        tripsConfig4.setMinimalTripDuration((long) 0);
        java.lang.Class<?> wildcardClass7 = tripsConfig4.getClass();
        long long8 = tripsConfig4.getMinimalNoDataDuration();
        tripsConfig4.setMinimalParkingDuration((long) '#');
        long long11 = tripsConfig4.getMinimalParkingDuration();
        double double12 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDistance(97.0d);
        long long15 = tripsConfig4.getMinimalParkingDuration();
        double double16 = tripsConfig4.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.traccar.reports.model.TripsConfig tripsConfig4 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) -1, (long) 'a', 0L);
        double double5 = tripsConfig4.getMinimalTripDistance();
        tripsConfig4.setMinimalTripDuration((long) 1);
        long long8 = tripsConfig4.getMinimalTripDuration();
        long long9 = tripsConfig4.getMinimalParkingDuration();
        tripsConfig4.setMinimalTripDistance((double) 10.0f);
        long long12 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalParkingDuration((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = tripsConfig4.getClass();
        long long16 = tripsConfig4.getMinimalTripDuration();
        tripsConfig4.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }
}

