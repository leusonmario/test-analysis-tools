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
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), (long) 'a', (long) '#', true, 97L, true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) 100);
        tripsConfig6.setMinimalTripDistance((double) (byte) 1);
        double double14 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDistance((double) 35L);
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) 1);
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
        tripsConfig6.setMinimalTripDistance((double) 1L);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(97L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long3 = tripsConfig0.getMinimalNoDataDuration();
        long long4 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        tripsConfig0.setMinimalNoDataDuration(97L);
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) ' ', (long) (byte) 1, (-1L), true, (long) '#', false);
        tripsConfig6.setMinimalParkingDuration((long) (short) 100);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        tripsConfig0.setMinimalNoDataDuration(97L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        double double19 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 100, (long) 10, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 'a');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) ' ');
        tripsConfig6.setMinimalTripDuration(0L);
        tripsConfig6.setUseIgnition(false);
        boolean boolean16 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration(1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDuration(97L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean11 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig6.setMinimalTripDistance((double) 1L);
        boolean boolean17 = tripsConfig6.getUseIgnition();
        boolean boolean18 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 1);
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        double double9 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) ' ', (long) (short) -1, true, (long) (short) 100, true);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) 10L);
        long long9 = tripsConfig6.getMinimalTripDuration();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration(97L);
        tripsConfig6.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        long long8 = tripsConfig6.getMinimalParkingDuration();
        double double9 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance(10.0d);
        boolean boolean12 = tripsConfig6.getUseIgnition();
        long long13 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 32L, (long) (byte) -1, (long) (byte) 0, false, 0L, false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration(10L);
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        boolean boolean6 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        double double7 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        double double10 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(1L);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalParkingDuration(32L);
        long long18 = tripsConfig6.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass19 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 100, (long) 10, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 'a');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) ' ');
        tripsConfig6.setMinimalTripDuration(0L);
        tripsConfig6.setUseIgnition(false);
        boolean boolean16 = tripsConfig6.getUseIgnition();
        boolean boolean17 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        long long14 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 100, (long) 10, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 'a');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(false);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean11 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDuration((long) ' ');
        long long8 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        long long8 = tripsConfig0.getMinimalTripDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(false);
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setUseIgnition(false);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        boolean boolean12 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(false);
        boolean boolean10 = tripsConfig6.getGreedyParking();
        long long11 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) 32L);
        long long14 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 10L, 97L, (long) ' ', true, 10L, true);
        tripsConfig6.setMinimalTripDuration(0L);
        double double9 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setUseIgnition(false);
        long long12 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration(32L);
        tripsConfig0.setMinimalTripDistance(100.0d);
        tripsConfig0.setGreedyParking(true);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        boolean boolean5 = tripsConfig0.getGreedyParking();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 10, 100L, 0L, true, 97L, true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) '#');
        double double13 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((-1L));
        long long21 = tripsConfig6.getMinimalNoDataDuration();
        long long22 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) '#');
        tripsConfig6.setMinimalTripDuration(97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1, (long) (short) 100, (long) (short) 100, true, (long) ' ', true);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        double double14 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setGreedyParking(false);
        long long21 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) '#');
        double double11 = tripsConfig6.getMinimalTripDistance();
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration(100L);
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (-1L), 52L, (long) (byte) 100, true, (long) (short) 0, true);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 10);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDistance((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setGreedyParking(true);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        boolean boolean13 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        long long16 = tripsConfig0.getMinimalTripDuration();
        double double17 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration((long) 1);
        long long15 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        boolean boolean19 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalTripDuration();
        long long15 = tripsConfig6.getMinimalTripDuration();
        long long16 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) '#', (long) 10, (long) '4', true, (long) 'a', false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        long long8 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDistance((double) 35L);
        tripsConfig6.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) (byte) 0, 52L, true, 0L, true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration(1L);
        double double14 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, 0L, 100L, false, 97L, false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        double double8 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        boolean boolean13 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        long long16 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(true);
        long long19 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean20 = tripsConfig6.getGreedyParking();
        boolean boolean21 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration(32L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 10.0f, 10L, (long) 0, false, (long) 'a', false);
        tripsConfig6.setMinimalNoDataDuration(100L);
        tripsConfig6.setMinimalTripDuration((-1L));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (-1L), (long) (short) -1, true, (long) (byte) -1, true);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) (byte) 10);
        boolean boolean10 = tripsConfig6.getGreedyParking();
        double double11 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration((long) 0);
        boolean boolean14 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setUseIgnition(false);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) -1);
        boolean boolean16 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration((long) ' ');
        tripsConfig6.setMinimalTripDistance(0.0d);
        tripsConfig6.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (-1L), (long) '#', true, (long) 0, false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        double double5 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(35L);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        double double10 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(1L);
        tripsConfig6.setMinimalParkingDuration((-1L));
        long long15 = tripsConfig6.getMinimalParkingDuration();
        long long16 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (-1L), 1L, true, 10L, false);
        tripsConfig6.setMinimalTripDuration(10L);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) '4', 1L, 0L, true, 100L, false);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        boolean boolean8 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalTripDistance((double) 'a');
        double double9 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 97.0d + "'", double9 == 97.0d);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) (-1), (long) (byte) 1, false, (long) '#', true);
        tripsConfig6.setMinimalParkingDuration(97L);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDuration(0L);
        boolean boolean12 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0.0f, (long) 'a', (long) (short) 10, true, (long) 10, false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (-1), (long) (byte) -1, (-1L), false, 1L, true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 1);
        long long10 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean16 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        tripsConfig6.setMinimalTripDuration((long) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) -1);
        boolean boolean16 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration((long) ' ');
        tripsConfig6.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) '4');
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean15 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        boolean boolean3 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setMinimalParkingDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) (-1L));
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration(97L);
        tripsConfig6.setMinimalTripDistance((double) 0L);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 1);
        long long18 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance(10.0d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setGreedyParking(false);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalParkingDuration(52L);
        boolean boolean11 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        long long14 = tripsConfig6.getMinimalParkingDuration();
        long long15 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        tripsConfig0.setUseIgnition(true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig6.setMinimalNoDataDuration((long) 100);
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(32.0d, (long) (byte) 10, 100L, false, (long) 0, false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, 32L, (long) (short) 0, true, 0L, true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((-1L));
        long long21 = tripsConfig6.getMinimalTripDuration();
        long long22 = tripsConfig6.getMinimalNoDataDuration();
        boolean boolean23 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 10, 100L, 10L, false, (long) (byte) 0, true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance(97.0d);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalTripDuration();
        long long15 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration(32L);
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
        long long20 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration(97L);
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(1.0d);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 35L, (long) ' ', (long) (byte) 0, true, (long) (byte) 0, true);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        tripsConfig0.setMinimalNoDataDuration(97L);
        boolean boolean11 = tripsConfig0.getGreedyParking();
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        double double9 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0, (long) 1, (long) (short) 0, false, (long) ' ', true);
        tripsConfig6.setMinimalNoDataDuration(10L);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((-1.0d));
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean11 = tripsConfig0.getGreedyParking();
        boolean boolean12 = tripsConfig0.getGreedyParking();
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        long long15 = tripsConfig0.getMinimalTripDuration();
        boolean boolean16 = tripsConfig0.getGreedyParking();
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) 100, false, (long) '4', false);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
        boolean boolean10 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) 10);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        long long3 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDuration((long) (byte) 1);
        boolean boolean17 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDistance((double) (byte) 1);
        tripsConfig6.setMinimalNoDataDuration((long) (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDuration((long) 10);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        long long3 = tripsConfig0.getMinimalTripDuration();
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        boolean boolean12 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setGreedyParking(false);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) 10L);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalNoDataDuration();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        boolean boolean10 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        tripsConfig6.setMinimalTripDuration((long) ' ');
        double double11 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance(10.0d);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        double double19 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig6.setMinimalNoDataDuration(0L);
        tripsConfig6.setMinimalTripDistance((double) 10.0f);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDistance((double) '4');
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        tripsConfig0.setUseIgnition(true);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((-1L));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration(1L);
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDistance((-1.0d));
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        long long15 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 100, (long) 10, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 'a');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) ' ');
        tripsConfig6.setMinimalNoDataDuration(100L);
        long long14 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1, 0L, 0L, false, 0L, true);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setUseIgnition(false);
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(35.0d, (long) (short) -1, (long) (byte) -1, false, (long) 100, false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 100, 35L, (long) (short) -1, true, 10L, false);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1, (long) (short) 100, (long) (short) 100, true, (long) ' ', true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        boolean boolean13 = tripsConfig0.getGreedyParking();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) (byte) 10, (long) (short) -1, false, (long) 10, true);
        tripsConfig6.setMinimalTripDistance(100.0d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDistance((double) 35L);
        boolean boolean12 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(1.0d, (long) (byte) 1, 0L, true, 52L, false);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) -1, (long) 0, 0L, true, (long) (byte) 10, false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 100, (long) 10, true, 1L, false);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalParkingDuration((long) 0);
        long long11 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long10 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(52L);
        boolean boolean16 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) ' ', (long) '4', (long) (short) 1, true, (long) 1, false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        long long12 = tripsConfig6.getMinimalTripDuration();
        long long13 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 97L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) (byte) 0, (long) (byte) 1, true, 0L, false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 0);
        long long17 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        double double11 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        long long13 = tripsConfig6.getMinimalNoDataDuration();
        double double14 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        boolean boolean6 = tripsConfig0.getUseIgnition();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 100, (long) '#', (long) (byte) 0, true, (long) 100, false);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, 35L, false, 1L, true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setUseIgnition(false);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) (short) 0);
        tripsConfig6.setMinimalTripDuration((long) (byte) 10);
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalParkingDuration((-1L));
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        double double10 = tripsConfig6.getMinimalTripDistance();
        long long11 = tripsConfig6.getMinimalTripDuration();
        double double12 = tripsConfig6.getMinimalTripDistance();
        long long13 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDistance((-1.0d));
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        boolean boolean15 = tripsConfig6.getGreedyParking();
        double double16 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDistance((double) '4');
        double double5 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(35.0d, 97L, (long) (short) 100, true, (long) (short) 100, false);
        tripsConfig6.setGreedyParking(false);
        long long9 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 10);
        long long16 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) (short) 0);
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) '4');
        tripsConfig0.setMinimalTripDuration((long) 1);
        boolean boolean8 = tripsConfig0.getUseIgnition();
        long long9 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) '#');
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setGreedyParking(true);
        long long18 = tripsConfig6.getMinimalTripDuration();
        long long19 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) 0);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setGreedyParking(true);
        double double16 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) (short) 1);
        long long19 = tripsConfig6.getMinimalNoDataDuration();
        long long20 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setUseIgnition(false);
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        java.lang.Class<?> wildcardClass19 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        java.lang.Class<?> wildcardClass22 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((-1L));
        long long21 = tripsConfig6.getMinimalNoDataDuration();
        long long22 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) '#');
        tripsConfig6.setMinimalParkingDuration((long) (short) 1);
        boolean boolean27 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalParkingDuration((-1L));
        boolean boolean19 = tripsConfig0.getGreedyParking();
        boolean boolean20 = tripsConfig0.getGreedyParking();
        boolean boolean21 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalTripDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        long long10 = tripsConfig6.getMinimalParkingDuration();
        double double11 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setUseIgnition(false);
        long long14 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDistance(10.0d);
        boolean boolean12 = tripsConfig0.getGreedyParking();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) (byte) 100, (long) 'a', true, (long) 'a', true);
        tripsConfig6.setUseIgnition(true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        long long4 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 0, (long) (short) 100, (long) (byte) 10, false, 52L, false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        double double11 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig6.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 100.0f, (long) (byte) -1, (long) (byte) 1, false, (long) 0, true);
        tripsConfig6.setMinimalParkingDuration((-1L));
        tripsConfig6.setMinimalTripDistance((double) 10);
        long long11 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance(52.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        long long10 = tripsConfig6.getMinimalTripDuration();
        long long11 = tripsConfig6.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        boolean boolean5 = tripsConfig0.getGreedyParking();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(97L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        double double8 = tripsConfig0.getMinimalTripDistance();
        double double9 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        long long7 = tripsConfig0.getMinimalTripDuration();
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        boolean boolean13 = tripsConfig0.getGreedyParking();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        long long15 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (byte) 1);
        long long17 = tripsConfig0.getMinimalTripDuration();
        boolean boolean18 = tripsConfig0.getGreedyParking();
        boolean boolean19 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) (short) 0);
        tripsConfig6.setMinimalTripDuration((long) (byte) 10);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration((-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDuration(52L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        tripsConfig0.setMinimalNoDataDuration(35L);
        tripsConfig0.setMinimalTripDuration(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) '#');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setGreedyParking(true);
        boolean boolean7 = tripsConfig0.getGreedyParking();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        double double13 = tripsConfig0.getMinimalTripDistance();
        boolean boolean14 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 1, (long) 100, (long) (short) 0, false, 32L, false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDuration((long) ' ');
        tripsConfig0.setMinimalTripDistance((double) 97L);
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        double double2 = tripsConfig0.getMinimalTripDistance();
        long long3 = tripsConfig0.getMinimalParkingDuration();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setUseIgnition(true);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 97L, (-1L), (-1L), false, (long) (short) 10, false);
        tripsConfig6.setGreedyParking(false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalParkingDuration(97L);
        tripsConfig0.setMinimalNoDataDuration(35L);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        boolean boolean5 = tripsConfig0.getGreedyParking();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        long long7 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(35.0d, (long) '#', (long) (short) -1, true, (long) (short) -1, false);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(97.0d, (long) (short) 0, (long) ' ', false, 0L, false);
        tripsConfig6.setMinimalTripDistance((double) 0L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) (short) 0);
        tripsConfig6.setUseIgnition(true);
        long long14 = tripsConfig6.getMinimalTripDuration();
        boolean boolean15 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        boolean boolean19 = tripsConfig0.getGreedyParking();
        long long20 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(true);
        boolean boolean12 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(1.0d, (long) (short) 1, (long) 1, false, (-1L), true);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration(100L);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((-1L));
        long long21 = tripsConfig6.getMinimalNoDataDuration();
        long long22 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) '#');
        tripsConfig6.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        double double6 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration(97L);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        boolean boolean3 = tripsConfig0.getGreedyParking();
        long long4 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setGreedyParking(false);
        long long21 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration(35L);
        long long24 = tripsConfig6.getMinimalNoDataDuration();
        long long25 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration((long) 1);
        tripsConfig6.setMinimalTripDuration((long) 1);
        boolean boolean17 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalParkingDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(100.0d, (long) (short) 100, 32L, false, 1L, false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        double double10 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(1L);
        tripsConfig6.setMinimalParkingDuration((-1L));
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration((-1L));
        long long16 = tripsConfig6.getMinimalNoDataDuration();
        double double17 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDuration((long) (byte) -1);
        boolean boolean20 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) (-1));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(10.0d);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) 10, (long) (byte) 10, true, 97L, false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalParkingDuration(97L);
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setMinimalTripDistance((double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(10.0d);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 0);
        double double17 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass18 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 1, (long) '4', 0L, false, 0L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (byte) 1, (long) (short) 100, true, (long) 1, true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        long long2 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((double) 100L);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(35.0d, (long) (byte) -1, (-1L), true, (long) (short) -1, true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration(32L);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        long long19 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 'a');
        tripsConfig6.setMinimalParkingDuration(35L);
        long long19 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        boolean boolean5 = tripsConfig0.getGreedyParking();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean10 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, (long) (short) 1, (long) 10, true, 52L, false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 100, (long) 100, (long) (-1), false, (long) '4', false);
        tripsConfig6.setUseIgnition(true);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 1, (long) 0, (long) '#', false, (long) (byte) 10, false);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 1, 52L, (long) (-1), true, 97L, false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        boolean boolean13 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) (byte) 100);
        long long19 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 35L, (long) 100, (long) (byte) 100, false, (long) (byte) 1, false);
        tripsConfig6.setUseIgnition(false);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        boolean boolean13 = tripsConfig0.getGreedyParking();
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) 10L);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) 100);
        tripsConfig6.setMinimalTripDistance((double) (byte) 1);
        boolean boolean14 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setMinimalParkingDuration((long) '#');
        tripsConfig6.setMinimalTripDistance((double) (short) 10);
        long long17 = tripsConfig6.getMinimalNoDataDuration();
        double double18 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        double double14 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        double double11 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        double double5 = tripsConfig0.getMinimalTripDistance();
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 1, (long) '4', 0L, true, 1L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalParkingDuration(32L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) 100, false, (long) '4', false);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalTripDuration();
        long long9 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0.0f, (long) 1, (long) 100, false, 1L, false);
        tripsConfig6.setGreedyParking(true);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        double double13 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (-1L), 1L, true, 10L, false);
        tripsConfig6.setMinimalTripDuration(10L);
        double double9 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) 52L);
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), (long) ' ', (long) (short) 100, false, (long) (byte) 1, true);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration(35L);
        boolean boolean19 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDistance(52.0d);
        boolean boolean22 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        double double5 = tripsConfig0.getMinimalTripDistance();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance(100.0d);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        double double7 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        boolean boolean8 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDistance((double) 1L);
        long long11 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) 10L);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance(35.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) 1);
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
        tripsConfig6.setMinimalTripDuration((long) (short) 100);
        boolean boolean14 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        double double6 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        long long16 = tripsConfig6.getMinimalParkingDuration();
        long long17 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) '#');
        tripsConfig6.setMinimalParkingDuration((long) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setUseIgnition(false);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalNoDataDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        double double11 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        long long13 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalNoDataDuration((long) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        long long8 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setUseIgnition(true);
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(1L);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        double double11 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        long long13 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        double double5 = tripsConfig0.getMinimalTripDistance();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalParkingDuration(32L);
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalTripDistance((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        double double1 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean4 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        boolean boolean7 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 32L, 32L, (long) (short) 1, false, (long) (short) 0, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(false);
        boolean boolean10 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        double double10 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 35L, (long) (-1), (long) (-1), false, (long) (short) 10, false);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) '4', (long) (short) 0, 0L, true, 0L, false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        boolean boolean3 = tripsConfig0.getGreedyParking();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration(52L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) 1);
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
        tripsConfig6.setMinimalTripDistance((double) 1L);
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        double double13 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 10, (long) (byte) 100, (long) '4', true, (long) (byte) 10, true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        boolean boolean13 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration((long) '#');
        long long16 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 10);
        long long19 = tripsConfig6.getMinimalTripDuration();
        boolean boolean20 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (-1.0f), 32L, (long) (byte) 0, true, 1L, false);
        tripsConfig6.setMinimalTripDistance((double) 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) '4');
        tripsConfig0.setMinimalTripDuration((long) 1);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setUseIgnition(false);
        long long21 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) '4');
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        long long13 = tripsConfig6.getMinimalTripDuration();
        long long14 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) '4');
        long long18 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) '#');
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        long long16 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration(32L);
        boolean boolean5 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (-1L), (long) (short) -1, true, (long) (byte) -1, true);
        double double7 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalTripDuration();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalParkingDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(32.0d, (long) 1, (long) 10, false, (long) '4', true);
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDuration((long) 100);
        boolean boolean7 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 0);
        long long17 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration(32L);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(97L);
        double double8 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration(10L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalTripDistance((-1.0d));
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        double double7 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0L, (long) 10, 10L, true, (long) (byte) -1, true);
        tripsConfig6.setMinimalTripDuration(0L);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        boolean boolean14 = tripsConfig6.getUseIgnition();
        double double15 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalParkingDuration((long) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration(0L);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) 10L);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 10);
        long long16 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        tripsConfig6.setMinimalTripDistance((double) 35L);
        tripsConfig6.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        boolean boolean13 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalParkingDuration(97L);
        tripsConfig6.setMinimalNoDataDuration(35L);
        java.lang.Class<?> wildcardClass14 = tripsConfig6.getClass();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0.0f);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 35L, (long) 100, (long) (byte) 100, false, (long) (byte) 1, false);
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalTripDistance((double) 1);
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        double double5 = tripsConfig0.getMinimalTripDistance();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setGreedyParking(true);
        double double16 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) (short) 1);
        long long19 = tripsConfig6.getMinimalNoDataDuration();
        long long20 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        boolean boolean5 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        long long9 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration(32L);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        long long9 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance((double) 100.0f);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((-1L));
        long long21 = tripsConfig6.getMinimalNoDataDuration();
        double double22 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (short) 100, (long) 100, false, (long) '4', false);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        double double13 = tripsConfig0.getMinimalTripDistance();
        boolean boolean14 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        double double11 = tripsConfig6.getMinimalTripDistance();
        double double12 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(32L);
        long long15 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalTripDuration((long) ' ');
        tripsConfig0.setMinimalParkingDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 0);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) 100L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) 10, 0L, true, 0L, true);
        tripsConfig6.setMinimalTripDuration((long) '4');
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalNoDataDuration(35L);
        long long13 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setGreedyParking(false);
        double double15 = tripsConfig6.getMinimalTripDistance();
        double double16 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) 10L);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        long long13 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass14 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        tripsConfig6.setMinimalTripDistance((double) 10L);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalParkingDuration(0L);
        long long12 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        double double10 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(1L);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        double double16 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) (-1));
        tripsConfig6.setMinimalTripDistance(1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration(32L);
        tripsConfig0.setMinimalParkingDuration(52L);
        boolean boolean7 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        double double3 = tripsConfig0.getMinimalTripDistance();
        double double4 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) ' ', (long) (byte) 1, (-1L), true, (long) '#', false);
        tripsConfig6.setMinimalParkingDuration((long) (short) -1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        long long8 = tripsConfig6.getMinimalParkingDuration();
        long long9 = tripsConfig6.getMinimalTripDuration();
        double double10 = tripsConfig6.getMinimalTripDistance();
        long long11 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) '4', (long) (short) 0, 100L, true, (long) (short) -1, false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(100.0d, (long) (short) 0, (long) (short) 0, false, (long) '#', false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        double double19 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) -1, (long) '#', (long) ' ', true, (long) (byte) 100, true);
        tripsConfig6.setGreedyParking(true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        long long9 = tripsConfig0.getMinimalTripDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) 10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalNoDataDuration((long) '#');
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setMinimalTripDistance((double) 100L);
        double double21 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) (short) 0, (long) (short) 0, false, (long) 0, false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setUseIgnition(true);
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(1L);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(35.0d);
        long long9 = tripsConfig0.getMinimalTripDuration();
        boolean boolean10 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        boolean boolean11 = tripsConfig0.getGreedyParking();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDuration(35L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(32.0d, 100L, 1L, true, 10L, false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDistance(35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 10, (long) '4', 10L, false, (long) (short) 1, false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean15 = tripsConfig0.getUseIgnition();
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        boolean boolean8 = tripsConfig0.getUseIgnition();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        boolean boolean13 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((-1.0d));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, 35L, 10L, false, (long) 1, false);
        tripsConfig6.setUseIgnition(true);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(97.0d, 0L, 1L, false, (long) (byte) 10, true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setMinimalTripDuration(100L);
        boolean boolean17 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        long long6 = tripsConfig0.getMinimalNoDataDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        tripsConfig0.setMinimalTripDistance(100.0d);
        tripsConfig0.setMinimalNoDataDuration(52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        boolean boolean6 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(true);
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(1L);
        tripsConfig0.setGreedyParking(false);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(52L);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        double double10 = tripsConfig0.getMinimalTripDistance();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1, 0L, (long) 1, false, (long) 1, false);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration(32L);
        tripsConfig6.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long10 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        boolean boolean12 = tripsConfig0.getGreedyParking();
        tripsConfig0.setGreedyParking(false);
        boolean boolean15 = tripsConfig0.getUseIgnition();
        boolean boolean16 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        double double8 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(32L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setUseIgnition(false);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        long long9 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDistance((double) '#');
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(32L);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        double double18 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setUseIgnition(true);
        long long5 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(1L);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 1, (long) 1, 32L, false, 32L, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        long long8 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        long long9 = tripsConfig0.getMinimalTripDuration();
        boolean boolean10 = tripsConfig0.getGreedyParking();
        double double11 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1.0f, (long) 10, 0L, true, 0L, true);
        tripsConfig6.setMinimalTripDuration((long) '4');
        tripsConfig6.setUseIgnition(false);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        long long13 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 100, 97L, (long) 10, false, (long) 1, false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        long long4 = tripsConfig0.getMinimalTripDuration();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        double double8 = tripsConfig0.getMinimalTripDistance();
        long long9 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 1);
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDuration((long) (byte) 0);
        tripsConfig6.setMinimalParkingDuration((long) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDistance(10.0d);
        boolean boolean12 = tripsConfig0.getGreedyParking();
        boolean boolean13 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long4 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        tripsConfig0.setUseIgnition(false);
        double double5 = tripsConfig0.getMinimalTripDistance();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(100L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1.0f, 10L, (long) (short) 0, false, 0L, true);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        double double4 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        double double12 = tripsConfig0.getMinimalTripDistance();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        boolean boolean5 = tripsConfig0.getGreedyParking();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        long long15 = tripsConfig0.getMinimalTripDuration();
        boolean boolean16 = tripsConfig0.getGreedyParking();
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalTripDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setGreedyParking(true);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        boolean boolean12 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(false);
        double double17 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) 0);
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        double double6 = tripsConfig0.getMinimalTripDistance();
        double double7 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setMinimalParkingDuration((long) '#');
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        boolean boolean16 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig6.setMinimalNoDataDuration(0L);
        tripsConfig6.setMinimalTripDistance((double) 10.0f);
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        long long16 = tripsConfig6.getMinimalParkingDuration();
        long long17 = tripsConfig6.getMinimalNoDataDuration();
        long long18 = tripsConfig6.getMinimalParkingDuration();
        long long19 = tripsConfig6.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass20 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDuration(52L);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 10);
        long long16 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        tripsConfig6.setMinimalTripDistance((double) 35L);
        long long21 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        double double10 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDuration((long) 10);
        boolean boolean13 = tripsConfig6.getGreedyParking();
        double double14 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(true);
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        long long16 = tripsConfig6.getMinimalParkingDuration();
        long long17 = tripsConfig6.getMinimalNoDataDuration();
        long long18 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        boolean boolean6 = tripsConfig0.getUseIgnition();
        double double7 = tripsConfig0.getMinimalTripDistance();
        long long8 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 100, (long) 10, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 'a');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        long long11 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration(0L);
        tripsConfig6.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setUseIgnition(false);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 10.0f, (long) (byte) 1, 97L, false, 0L, false);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 0, (long) 10, (long) (short) 1, true, (long) (-1), false);
        tripsConfig6.setUseIgnition(true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        boolean boolean8 = tripsConfig0.getUseIgnition();
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setUseIgnition(true);
        boolean boolean11 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(52.0d, (long) (byte) 100, 0L, false, 52L, true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        double double10 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(1L);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        double double16 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) (-1));
        tripsConfig6.setGreedyParking(true);
        boolean boolean21 = tripsConfig6.getGreedyParking();
        long long22 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        long long8 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 1);
        boolean boolean13 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(1L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) '#');
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) (short) -1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalParkingDuration((long) 1);
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDuration(52L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (byte) 10);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (-1));
        long long14 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean15 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1, (long) 100, 0L, false, (long) 0, true);
        tripsConfig6.setMinimalTripDuration((long) 10);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDistance((double) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 97L, (long) (byte) 100, 32L, false, (long) (byte) 10, true);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setUseIgnition(false);
        double double13 = tripsConfig6.getMinimalTripDistance();
        long long14 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        tripsConfig0.setMinimalTripDuration((long) (byte) 100);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 32L, (long) (byte) -1, (long) (short) 100, false, 1L, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) 100);
        long long10 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, 0L, (long) ' ', true, (long) (short) 1, true);
        tripsConfig6.setMinimalParkingDuration(100L);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        boolean boolean6 = tripsConfig0.getGreedyParking();
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (-1), 52L, 52L, true, (long) '#', true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 10, 10L, (long) '#', false, 52L, false);
        tripsConfig6.setMinimalNoDataDuration((long) 10);
        tripsConfig6.setMinimalNoDataDuration((long) 'a');
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) '#');
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setGreedyParking(true);
        java.lang.Class<?> wildcardClass18 = tripsConfig6.getClass();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration(32L);
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(true);
        boolean boolean14 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        boolean boolean8 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setGreedyParking(true);
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) 0);
        boolean boolean14 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (short) 10, (long) (short) 10, (long) (short) 0, true, (long) (short) 0, false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) (byte) 0, (long) 1, 0L, true, (long) (-1), false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        double double10 = tripsConfig6.getMinimalTripDistance();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration((long) ' ');
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 'a');
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(10.0d, (long) '#', (long) (short) 0, true, 97L, true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        long long13 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        long long9 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) '#');
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setGreedyParking(true);
        java.lang.Class<?> wildcardClass18 = tripsConfig6.getClass();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        boolean boolean14 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass5 = tripsConfig0.getClass();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setGreedyParking(false);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 'a', (long) 100, (long) 10, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 'a');
        tripsConfig6.setMinimalParkingDuration(100L);
        boolean boolean11 = tripsConfig6.getUseIgnition();
        long long12 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long4 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setGreedyParking(false);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean10 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        boolean boolean1 = tripsConfig0.getUseIgnition();
        boolean boolean2 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        tripsConfig0.setUseIgnition(false);
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.traccar.reports.model.TripsConfig tripsConfig0 = new org.traccar.reports.model.TripsConfig();
        tripsConfig0.setMinimalTripDuration((long) '#');
        tripsConfig0.setMinimalNoDataDuration(1L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 1L, (long) 10, 0L, false, (long) 'a', true);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDistance((-1.0d));
        tripsConfig6.setMinimalParkingDuration(97L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig(0.0d, (long) 100, (long) 100, true, (long) (short) 10, false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.traccar.reports.model.TripsConfig tripsConfig6 = new org.traccar.reports.model.TripsConfig((double) 35L, (long) 100, (long) (byte) 100, false, (long) (byte) 1, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }
}

