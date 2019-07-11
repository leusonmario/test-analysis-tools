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
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalParkingDuration((long) ' ');
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, 100L, (long) (short) -1, false, (long) '4', false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), 0L, (long) '#', true, (long) 'a', false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration(10L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        tripsConfig0.setGreedyParking(false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) (short) -1, (-1L), false, 32L, false);
        tripsConfig6.setGreedyParking(true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        tripsConfig6.setMinimalParkingDuration((long) (-1));
        long long11 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        boolean boolean4 = tripsConfig0.getUseIgnition();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalParkingDuration(0L);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) 10, (long) (byte) 0, true, (long) 10, true);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        java.lang.Class<?> wildcardClass14 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        boolean boolean14 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        double double10 = tripsConfig0.getMinimalTripDistance();
        double double11 = tripsConfig0.getMinimalTripDistance();
        long long12 = tripsConfig0.getMinimalTripDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) '4');
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) 10, (long) 0, true, 1L, false);
        tripsConfig6.setGreedyParking(false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        java.lang.Class<?> wildcardClass3 = tripsConfig0.getClass();
        long long4 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) 100);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean14 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) '#');
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 0L, (-1L), (long) (short) 0, true, (long) 100, true);
        tripsConfig6.setMinimalNoDataDuration((long) 'a');
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance(0.0d);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        boolean boolean8 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalTripDuration((long) 10);
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass4 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalParkingDuration((long) (short) 10);
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalTripDuration();
        long long14 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        boolean boolean3 = tripsConfig0.getUseIgnition();
        boolean boolean4 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDuration(97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setUseIgnition(true);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setUseIgnition(false);
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        long long15 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 32L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setGreedyParking(true);
        long long16 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 100L, (long) (short) 10, 32L, true, 32L, false);
        tripsConfig6.setMinimalTripDistance(0.0d);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 10L, 1L, (long) (short) 100, true, (long) 100, false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        double double14 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.br.Context context0 = new org.br.Context();
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setMinimalNoDataDuration(32L);
        tripsConfig6.setGreedyParking(true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(false);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalNoDataDuration((-1L));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 100, (long) (byte) 0, (long) (short) -1, true, (long) '4', true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDuration((long) ' ');
        tripsConfig6.setMinimalTripDuration(0L);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setUseIgnition(false);
        long long12 = tripsConfig6.getMinimalTripDuration();
        double double13 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        long long10 = tripsConfig6.getMinimalTripDuration();
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        boolean boolean12 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        boolean boolean12 = tripsConfig6.getUseIgnition();
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.br.Context context0 = new org.br.Context();
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration((long) '#');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        boolean boolean12 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 0, 0L, (long) (short) 1, true, (long) 1, false);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalParkingDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(10L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setUseIgnition(false);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        tripsConfig6.setMinimalNoDataDuration((long) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        double double10 = tripsConfig0.getMinimalTripDistance();
        double double11 = tripsConfig0.getMinimalTripDistance();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDuration((long) ' ');
        tripsConfig6.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        tripsConfig6.setMinimalTripDistance((double) (short) 0);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        double double10 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(10L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        tripsConfig6.setMinimalTripDistance((double) (short) 0);
        double double9 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setMinimalTripDistance(100.0d);
        boolean boolean16 = tripsConfig6.getUseIgnition();
        double double17 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(97L);
        boolean boolean12 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration(1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        tripsConfig6.setMinimalNoDataDuration((long) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) -1);
        long long11 = tripsConfig6.getMinimalTripDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, 97L, (long) (byte) -1, false, 0L, true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) 10, false, (long) 100, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        double double8 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) '4', (long) (byte) 0, true, 0L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) '4');
        tripsConfig6.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDistance((double) 10);
        tripsConfig6.setGreedyParking(true);
        long long16 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        boolean boolean11 = tripsConfig0.getGreedyParking();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 1, (long) (byte) 10, (long) 100, true, (long) 10, true);
        tripsConfig6.setMinimalParkingDuration(0L);
        tripsConfig6.setMinimalTripDuration((long) (short) 100);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalParkingDuration(100L);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalTripDuration((-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        boolean boolean14 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((double) '4');
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDistance((double) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalParkingDuration(0L);
        long long11 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) '4', (long) (byte) 0, true, 0L, false);
        tripsConfig6.setMinimalNoDataDuration(97L);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        boolean boolean9 = tripsConfig0.getUseIgnition();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig6.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 0L, (long) (short) -1, 0L, false, (long) (short) 0, true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration(100L);
        long long12 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean13 = tripsConfig6.getGreedyParking();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) '4', (long) (byte) 0, true, 0L, false);
        tripsConfig6.setMinimalNoDataDuration(97L);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDistance((double) 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(10L);
        tripsConfig0.setGreedyParking(false);
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        tripsConfig6.setMinimalTripDistance((double) (short) 0);
        double double9 = tripsConfig6.getMinimalTripDistance();
        long long10 = tripsConfig6.getMinimalTripDuration();
        boolean boolean11 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        long long10 = tripsConfig6.getMinimalTripDuration();
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        boolean boolean9 = tripsConfig0.getUseIgnition();
        long long10 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 0, (long) (-1), (long) 10, true, (long) (byte) 100, false);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setGreedyParking(true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 0, (long) (-1), (long) 10, true, (long) (byte) 100, false);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        tripsConfig6.setMinimalTripDuration((long) (short) 100);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDistance((double) 10);
        tripsConfig6.setGreedyParking(true);
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalParkingDuration(52L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        boolean boolean11 = tripsConfig0.getGreedyParking();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        double double3 = tripsConfig0.getMinimalTripDistance();
        boolean boolean4 = tripsConfig0.getUseIgnition();
        boolean boolean5 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) 'a', (long) 1, false, (long) 1, true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 52L, 1L, (long) (short) 10, false, 0L, false);
        tripsConfig6.setUseIgnition(true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        boolean boolean17 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '4', (long) (byte) 0, 100L, true, 10L, false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) 1);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1L), (long) (byte) -1, (long) (byte) -1, true, (long) '4', false);
        tripsConfig6.setMinimalTripDuration(0L);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) 0, (long) '#', true, (long) (short) 10, true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 100, (long) (byte) 100, (long) (short) 1, true, (long) (short) 10, false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setGreedyParking(true);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        boolean boolean3 = tripsConfig0.getUseIgnition();
        boolean boolean4 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration(52L);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        long long16 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalParkingDuration((-1L));
        tripsConfig6.setGreedyParking(false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(10L);
        tripsConfig0.setGreedyParking(false);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        boolean boolean11 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((double) 10.0f);
        boolean boolean14 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        long long11 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 97L, (long) 100, 97L, true, (long) '4', false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 100L, (long) (short) 0, (long) (short) 1, false, 10L, true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 10);
        tripsConfig6.setMinimalParkingDuration((long) (short) 1);
        tripsConfig6.setMinimalNoDataDuration((long) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        boolean boolean8 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        long long11 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 100);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 'a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 0, (long) (byte) -1, (long) 0, true, (long) ' ', true);
        tripsConfig6.setMinimalNoDataDuration((-1L));
        long long9 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        boolean boolean6 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 10L, (long) (byte) 1, (long) 0, true, (long) (byte) 10, true);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        double double14 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(0L);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        boolean boolean4 = tripsConfig0.getGreedyParking();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.br.Context context0 = new org.br.Context();
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setGreedyParking(true);
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) 10, false, (long) 100, false);
        long long7 = tripsConfig6.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass8 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean7 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration(1L);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 100, 52L, (long) (-1), true, (long) (byte) -1, true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        boolean boolean11 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDuration(1L);
        boolean boolean14 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(32.0d, (long) (short) -1, (long) '#', false, (long) (short) -1, false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        double double10 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        long long10 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance(10.0d);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        boolean boolean14 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        long long10 = tripsConfig6.getMinimalTripDuration();
        double double11 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        long long10 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setGreedyParking(true);
        java.lang.Class<?> wildcardClass16 = tripsConfig6.getClass();
        tripsConfig6.setUseIgnition(false);
        boolean boolean19 = tripsConfig6.getUseIgnition();
        boolean boolean20 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        long long17 = tripsConfig6.getMinimalParkingDuration();
        long long18 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        long long10 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setUseIgnition(true);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        double double8 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        boolean boolean14 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        long long9 = tripsConfig0.getMinimalTripDuration();
        boolean boolean10 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration((long) '#');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        boolean boolean13 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setGreedyParking(false);
        boolean boolean12 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        tripsConfig6.setMinimalNoDataDuration((long) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) -1);
        long long11 = tripsConfig6.getMinimalTripDuration();
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration(35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        double double3 = tripsConfig0.getMinimalTripDistance();
        boolean boolean4 = tripsConfig0.getUseIgnition();
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.br.Context context0 = new org.br.Context();
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) 10, false, (long) 100, false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        long long8 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) (byte) -1);
        long long13 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setGreedyParking(true);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDuration((long) (short) 100);
        tripsConfig6.setMinimalTripDistance(0.0d);
        tripsConfig6.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setGreedyParking(false);
        boolean boolean16 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalNoDataDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        boolean boolean9 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) 10, false, (long) 100, false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        double double8 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean7 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration(1L);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), 52L, (long) 100, false, 97L, false);
        tripsConfig6.setUseIgnition(false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) '4');
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 97L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 0, 100L, (long) (byte) 10, true, 35L, true);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        boolean boolean9 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass10 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(true);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (byte) -1, (long) (short) -1, false, (long) (byte) 10, false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) 1);
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setUseIgnition(true);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setGreedyParking(false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        double double10 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) (short) -1, (-1L), false, 32L, false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration(32L);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        double double17 = tripsConfig6.getMinimalTripDistance();
        double double18 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        boolean boolean4 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setGreedyParking(false);
        double double9 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) '4');
        long long17 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass2 = tripsConfig0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.br.Context context0 = new org.br.Context();
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setUseIgnition(false);
        boolean boolean15 = tripsConfig0.getGreedyParking();
        long long16 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean8 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        double double7 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass8 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) '4', (long) (byte) 0, true, 0L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalParkingDuration();
        long long9 = tripsConfig6.getMinimalParkingDuration();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 10);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(32L);
        boolean boolean16 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 100L, (long) (short) 10, 32L, true, 32L, false);
        tripsConfig6.setUseIgnition(false);
        java.lang.Class<?> wildcardClass9 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDistance((double) 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        boolean boolean7 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setMinimalTripDuration((long) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalParkingDuration(32L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) '4');
        long long17 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
        boolean boolean18 = tripsConfig6.getGreedyParking();
        boolean boolean19 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        boolean boolean8 = tripsConfig6.getUseIgnition();
        boolean boolean9 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 100L, (long) 100, true, (long) (short) 0, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) 10, false, (long) 100, false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setMinimalTripDuration((long) 'a');
        tripsConfig6.setMinimalTripDistance((double) ' ');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean13 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        boolean boolean5 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance(1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        boolean boolean11 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDuration(1L);
        tripsConfig0.setMinimalTripDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        tripsConfig0.setUseIgnition(true);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        double double12 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration(0L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setMinimalTripDistance(0.0d);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalParkingDuration(100L);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean14 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) '#');
        long long17 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration((long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        boolean boolean4 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setGreedyParking(false);
        long long9 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) '#');
        boolean boolean16 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 100, 100L, 52L, false, 52L, false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration((long) '#');
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDuration((long) 100);
        double double20 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long10 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setUseIgnition(false);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        boolean boolean14 = tripsConfig0.getGreedyParking();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        boolean boolean16 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(10.0d, (long) (short) 10, 1L, false, 97L, true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) '4');
        tripsConfig0.setGreedyParking(false);
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass20 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(32L);
        tripsConfig0.setMinimalParkingDuration((long) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 0, (long) (-1), (long) 10, true, (long) (byte) 100, false);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 0, (long) 10, (long) (byte) 100, true, 97L, true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
        boolean boolean18 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) (byte) -1, 100L, true, (long) (short) 10, true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setGreedyParking(true);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDuration(0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1L), (long) (byte) -1, (long) (byte) -1, true, (long) '4', false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setMinimalTripDistance(100.0d);
        boolean boolean16 = tripsConfig6.getUseIgnition();
        double double17 = tripsConfig6.getMinimalTripDistance();
        boolean boolean18 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        double double14 = tripsConfig0.getMinimalTripDistance();
        boolean boolean15 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setMinimalParkingDuration((-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '#', (long) (byte) 10, (long) (short) 100, true, (long) 1, true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        double double3 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        double double14 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDistance(52.0d);
        boolean boolean14 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        boolean boolean17 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        long long13 = tripsConfig0.getMinimalParkingDuration();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        boolean boolean16 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalTripDistance((double) (short) 0);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setUseIgnition(false);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '#', (long) 10, (long) '4', false, (long) '#', false);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 1);
        tripsConfig6.setGreedyParking(true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        double double14 = tripsConfig0.getMinimalTripDistance();
        double double15 = tripsConfig0.getMinimalTripDistance();
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) '4');
        long long15 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration(32L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        long long7 = tripsConfig6.getMinimalTripDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration(32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) 10, (long) 0, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 0);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        boolean boolean14 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalNoDataDuration(100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean14 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) '#');
        tripsConfig6.setUseIgnition(true);
        long long19 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean20 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        boolean boolean12 = tripsConfig0.getUseIgnition();
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setUseIgnition(false);
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        tripsConfig0.setMinimalNoDataDuration(100L);
        long long17 = tripsConfig0.getMinimalTripDuration();
        boolean boolean18 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 0, (long) (-1), (long) 10, true, (long) (byte) 100, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setMinimalNoDataDuration((long) 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        boolean boolean14 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration(100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalParkingDuration(0L);
        tripsConfig0.setUseIgnition(true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        double double3 = tripsConfig0.getMinimalTripDistance();
        double double4 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalTripDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) (short) 1);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 0, 100L, (long) 10, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration(32L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDuration((long) ' ');
        java.lang.Class<?> wildcardClass16 = tripsConfig0.getClass();
        boolean boolean17 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        java.lang.Class<?> wildcardClass6 = tripsConfig0.getClass();
        double double7 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig6.setUseIgnition(false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((-1.0d), (long) (-1), (long) (short) 0, false, (long) (byte) 10, true);
        double double7 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDistance((double) (short) 100);
        tripsConfig6.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        double double11 = tripsConfig6.getMinimalTripDistance();
        double double12 = tripsConfig6.getMinimalTripDistance();
        long long13 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(true);
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setGreedyParking(true);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 32L);
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        double double15 = tripsConfig0.getMinimalTripDistance();
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 'a', (long) (byte) 100, (long) (byte) 100, true, (long) '#', false);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(32.0d, (long) (-1), (long) (byte) -1, true, (long) 1, true);
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        java.lang.Class<?> wildcardClass9 = tripsConfig6.getClass();
        boolean boolean10 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 97L);
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        double double14 = tripsConfig0.getMinimalTripDistance();
        boolean boolean15 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) 10, (long) 0, true, 1L, false);
        tripsConfig6.setMinimalTripDuration((long) 0);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration(0L);
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalParkingDuration((long) (short) 10);
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalTripDuration();
        boolean boolean4 = tripsConfig0.getUseIgnition();
        long long5 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean6 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 10, (long) (byte) 0, 32L, true, (long) ' ', true);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        long long9 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setUseIgnition(false);
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalParkingDuration();
        long long14 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalParkingDuration((long) (short) 10);
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration(97L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        double double9 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalNoDataDuration(97L);
        long long12 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setGreedyParking(true);
        long long20 = tripsConfig0.getMinimalNoDataDuration();
        boolean boolean21 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        tripsConfig0.setGreedyParking(true);
        double double10 = tripsConfig0.getMinimalTripDistance();
        long long11 = tripsConfig0.getMinimalTripDuration();
        boolean boolean12 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 0, 97L, (long) 'a', true, (long) ' ', true);
        tripsConfig6.setMinimalTripDuration(0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        double double14 = tripsConfig6.getMinimalTripDistance();
        long long15 = tripsConfig6.getMinimalTripDuration();
        long long16 = tripsConfig6.getMinimalNoDataDuration();
        boolean boolean17 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig6.setMinimalParkingDuration(35L);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDuration(97L);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 1, (long) ' ', 52L, true, (long) 'a', true);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        boolean boolean8 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 100L, (long) (short) 10, 32L, true, 32L, false);
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        java.lang.Class<?> wildcardClass15 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        boolean boolean18 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        java.lang.Class<?> wildcardClass7 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setGreedyParking(false);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean13 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) -1, (long) '#', (long) (byte) 0, false, 10L, true);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(false);
        long long13 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean9 = tripsConfig0.getUseIgnition();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1), 32L, (long) 100, false, (long) ' ', true);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalNoDataDuration(97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDuration((long) '#');
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double11 = tripsConfig0.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 10);
        tripsConfig6.setMinimalTripDistance(52.0d);
        boolean boolean11 = tripsConfig6.getGreedyParking();
        long long12 = tripsConfig6.getMinimalTripDuration();
        double double13 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(100L);
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        tripsConfig0.setMinimalTripDistance((double) (short) -1);
        long long13 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 0L);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration(52L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalTripDistance(1.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        java.lang.Class<?> wildcardClass1 = tripsConfig0.getClass();
        long long2 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 0.0f, (long) 100, 52L, true, (long) 0, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) (byte) 10);
        double double13 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) (-1));
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalParkingDuration((long) (short) 0);
        tripsConfig6.setUseIgnition(true);
        long long19 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setMinimalTripDuration(10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        java.lang.String str11 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setGreedyParking(true);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '#', (long) 10, (long) '4', false, (long) '#', false);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 1);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDuration(97L);
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        tripsConfig6.setMinimalNoDataDuration((long) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) -1);
        long long11 = tripsConfig6.getMinimalTripDuration();
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) 32L);
        long long15 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalParkingDuration();
        boolean boolean14 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDuration((long) '#');
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalNoDataDuration(35L);
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setUseIgnition(true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) 10, false, (long) 100, false);
        double double7 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) -1, false, (long) 100, false);
        tripsConfig6.setMinimalNoDataDuration(0L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalTripDistance((double) '4');
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setUseIgnition(true);
        long long9 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalParkingDuration((long) 1);
        tripsConfig6.setMinimalNoDataDuration(10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        double double3 = tripsConfig0.getMinimalTripDistance();
        boolean boolean4 = tripsConfig0.getGreedyParking();
        boolean boolean5 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 100L, (long) (short) -1, 1L, true, 0L, true);
        boolean boolean7 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(true);
        tripsConfig6.setMinimalTripDistance((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        boolean boolean14 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setGreedyParking(false);
        long long19 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        boolean boolean9 = tripsConfig0.getUseIgnition();
        boolean boolean10 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, (long) 100, (long) (-1), true, (long) (short) 1, true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (short) -1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(52.0d, 0L, (long) ' ', false, 52L, false);
        tripsConfig6.setMinimalTripDuration((long) '4');
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        double double3 = tripsConfig0.getMinimalTripDistance();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(32.0d, (long) ' ', 35L, false, (long) (short) 10, true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 'a', 1L, 10L, false, (long) 'a', false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) 1);
        boolean boolean13 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean13 = tripsConfig0.getGreedyParking();
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        long long12 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setMinimalTripDistance((double) 1L);
        double double17 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 0);
        tripsConfig0.setMinimalTripDistance((double) 100);
        tripsConfig0.setMinimalTripDistance(0.0d);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration(10L);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 100, 97L, (long) 0, true, (long) (short) 1, false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDistance((double) (byte) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration(32L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        tripsConfig0.setGreedyParking(false);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        java.lang.String str5 = context0.getFinal();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass12 = context0.getClass();
        java.lang.String str13 = context0.getFinal();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        long long17 = tripsConfig0.getMinimalTripDuration();
        long long18 = tripsConfig0.getMinimalTripDuration();
        double double19 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0L);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setGreedyParking(true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(0.0d, (long) '4', (long) ' ', false, (long) 1, false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig6.setGreedyParking(true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        boolean boolean15 = tripsConfig0.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 0);
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        double double8 = tripsConfig6.getMinimalTripDistance();
        long long9 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDistance((double) 100);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(32L);
        tripsConfig0.setMinimalParkingDuration(52L);
        double double17 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 100);
        boolean boolean11 = tripsConfig0.getGreedyParking();
        boolean boolean12 = tripsConfig0.getGreedyParking();
        long long13 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(true);
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((-1.0d), (long) 10, 35L, false, (long) 100, false);
        tripsConfig6.setMinimalParkingDuration((long) (byte) 0);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        long long10 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 97L, 10L, (long) 100, false, 97L, false);
        tripsConfig6.setUseIgnition(false);
        tripsConfig6.setGreedyParking(true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        double double10 = tripsConfig0.getMinimalTripDistance();
        double double11 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig0.getMinimalTripDuration();
        boolean boolean15 = tripsConfig0.getGreedyParking();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDuration((long) (byte) 0);
        long long20 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 1);
        tripsConfig0.setMinimalTripDuration(35L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        tripsConfig0.setMinimalNoDataDuration((long) 10);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setMinimalParkingDuration((long) (short) 0);
        long long21 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) '4', (long) (byte) 0, true, 0L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalParkingDuration();
        long long9 = tripsConfig6.getMinimalParkingDuration();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 10);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        java.lang.Class<?> wildcardClass14 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        boolean boolean11 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDuration((long) 'a');
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        tripsConfig0.setUseIgnition(true);
        long long18 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) '#');
        boolean boolean8 = tripsConfig0.getUseIgnition();
        tripsConfig0.setUseIgnition(true);
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 0, 97L, (long) 'a', true, (long) ' ', true);
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
        tripsConfig6.setMinimalTripDistance((double) 10);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(32.0d, 0L, (long) (byte) 0, false, (long) (byte) 10, true);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        double double11 = tripsConfig6.getMinimalTripDistance();
        long long12 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDistance((double) (byte) 10);
        boolean boolean15 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setUseIgnition(false);
        double double15 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '#', 1L, (long) 100, false, 52L, false);
        tripsConfig6.setMinimalTripDuration(0L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalNoDataDuration(0L);
        tripsConfig0.setGreedyParking(true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        long long9 = tripsConfig0.getMinimalTripDuration();
        boolean boolean10 = tripsConfig0.getGreedyParking();
        long long11 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(false);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        long long16 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) '4');
        long long17 = tripsConfig0.getMinimalParkingDuration();
        long long18 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) (short) -1, (-1L), false, 32L, false);
        tripsConfig6.setMinimalNoDataDuration(0L);
        boolean boolean9 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration(100L);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        double double10 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 100L, (long) (short) -1, 1L, true, 0L, true);
        tripsConfig6.setMinimalNoDataDuration(0L);
        tripsConfig6.setMinimalTripDistance(1.0d);
        long long11 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        tripsConfig0.setMinimalNoDataDuration((long) (short) 0);
        tripsConfig0.setGreedyParking(false);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalTripDistance((double) '4');
        double double17 = tripsConfig0.getMinimalTripDistance();
        boolean boolean18 = tripsConfig0.getUseIgnition();
        boolean boolean19 = tripsConfig0.getGreedyParking();
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 32L, 1L, (long) ' ', false, (long) (byte) 0, false);
        tripsConfig6.setMinimalNoDataDuration(32L);
        long long9 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance(52.0d);
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        boolean boolean13 = tripsConfig0.getUseIgnition();
        java.lang.Class<?> wildcardClass14 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        tripsConfig6.setMinimalNoDataDuration((long) 100);
        tripsConfig6.setMinimalNoDataDuration((long) (byte) -1);
        long long11 = tripsConfig6.getMinimalTripDuration();
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance((double) 32L);
        long long15 = tripsConfig6.getMinimalParkingDuration();
        double double16 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalNoDataDuration(32L);
        tripsConfig0.setMinimalTripDistance((double) 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, (long) '4', (long) (byte) 0, true, 0L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalParkingDuration();
        long long9 = tripsConfig6.getMinimalParkingDuration();
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalNoDataDuration((long) 10);
        tripsConfig6.setMinimalTripDuration((-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setUseIgnition(false);
        tripsConfig0.setMinimalTripDuration(100L);
        tripsConfig0.setMinimalParkingDuration((long) (-1));
        long long18 = tripsConfig0.getMinimalParkingDuration();
        long long19 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        boolean boolean14 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        java.lang.Class<?> wildcardClass18 = tripsConfig0.getClass();
        boolean boolean19 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        boolean boolean14 = tripsConfig0.getGreedyParking();
        long long15 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '4', 0L, 35L, true, (long) 100, true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((long) 1);
        long long12 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) 1);
        double double15 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalParkingDuration(1L);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        long long10 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        boolean boolean13 = tripsConfig6.getUseIgnition();
        long long14 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, (long) (-1), (long) (byte) 10, false, (long) 100, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        long long8 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setMinimalTripDuration((long) (short) 100);
        tripsConfig0.setGreedyParking(true);
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDistance((double) 32L);
        tripsConfig0.setMinimalTripDuration(52L);
        tripsConfig0.setMinimalTripDuration((long) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        java.lang.Class<?> wildcardClass12 = tripsConfig6.getClass();
        double double13 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDistance((double) (byte) 100);
        boolean boolean10 = tripsConfig0.getUseIgnition();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setUseIgnition(true);
        double double13 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalParkingDuration();
        long long7 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        long long7 = tripsConfig0.getMinimalNoDataDuration();
        long long8 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        long long13 = tripsConfig6.getMinimalParkingDuration();
        long long14 = tripsConfig6.getMinimalTripDuration();
        long long15 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((-1L));
        java.lang.Class<?> wildcardClass15 = tripsConfig0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        long long10 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDistance(0.0d);
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalParkingDuration(0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        long long16 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '#', 1L, (long) 100, false, 52L, false);
        tripsConfig6.setMinimalTripDuration(0L);
        tripsConfig6.setMinimalNoDataDuration((-1L));
        long long11 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalParkingDuration((long) (byte) 0);
        tripsConfig0.setMinimalTripDuration((-1L));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDistance((double) (byte) 0);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalParkingDuration(0L);
        java.lang.Class<?> wildcardClass19 = tripsConfig6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.br.Context context0 = new org.br.Context();
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        java.lang.String str5 = context0.getFinal();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str9 = context0.getFinal();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        long long3 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 1);
        boolean boolean6 = tripsConfig0.getGreedyParking();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 10, (long) 10, (long) 0, true, 1L, false);
        long long7 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setMinimalTripDuration((long) ' ');
        long long10 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        double double3 = tripsConfig0.getMinimalTripDistance();
        long long4 = tripsConfig0.getMinimalParkingDuration();
        double double5 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalTripDistance((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 10.0f, (long) (byte) 10, (long) (short) 0, true, (long) 0, false);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1.0f, 35L, (long) 'a', true, (long) '4', true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        long long8 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalTripDistance((double) (-1L));
        long long11 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        java.lang.String str11 = context0.getFinal();
        java.lang.String str12 = context0.getFinal();
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 0, (long) 0, (long) '#', false, (long) 'a', true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalNoDataDuration(35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalTripDistance(0.0d);
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setMinimalNoDataDuration((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        long long7 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDuration((long) (short) 10);
        tripsConfig6.setMinimalParkingDuration((long) (short) 10);
        long long12 = tripsConfig6.getMinimalNoDataDuration();
        tripsConfig6.setGreedyParking(true);
        boolean boolean15 = tripsConfig6.getUseIgnition();
        tripsConfig6.setMinimalTripDistance((double) ' ');
        boolean boolean18 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 100, (long) '4', (long) (short) 1, false, (long) (byte) 10, true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalTripDistance(1.0d);
        boolean boolean3 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDuration(32L);
        tripsConfig0.setMinimalTripDistance(10.0d);
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        java.lang.Class<?> wildcardClass11 = tripsConfig0.getClass();
        tripsConfig0.setGreedyParking(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        long long7 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean8 = tripsConfig0.getGreedyParking();
        long long9 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        double double14 = tripsConfig6.getMinimalTripDistance();
        long long15 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 97L, (long) '4', 0L, false, (long) (byte) -1, true);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setMinimalTripDistance((double) (short) 1);
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) 10, 100L, 0L, false, (long) ' ', false);
        long long7 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        tripsConfig0.setMinimalTripDistance((double) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) 1.0f);
        long long17 = tripsConfig0.getMinimalNoDataDuration();
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) ' ');
        long long11 = tripsConfig0.getMinimalTripDuration();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration((long) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        long long13 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalNoDataDuration((long) (-1));
        tripsConfig0.setMinimalParkingDuration((long) 'a');
        double double20 = tripsConfig0.getMinimalTripDistance();
        long long21 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 0, (-1L), 100L, false, 10L, true);
        tripsConfig6.setMinimalParkingDuration((long) (short) 10);
        tripsConfig6.setUseIgnition(true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setGreedyParking(false);
        tripsConfig6.setMinimalTripDistance(0.0d);
        long long14 = tripsConfig6.getMinimalTripDuration();
        double double15 = tripsConfig6.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        boolean boolean13 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        long long16 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        tripsConfig0.setMinimalTripDuration((long) (short) 0);
        long long10 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration(35L);
        tripsConfig0.setUseIgnition(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) 100.0f);
        double double9 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setMinimalNoDataDuration((long) '4');
        java.lang.Class<?> wildcardClass12 = tripsConfig0.getClass();
        double double13 = tripsConfig0.getMinimalTripDistance();
        long long14 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalTripDuration(100L);
        long long17 = tripsConfig0.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) ' ', (long) (short) 10, 32L, true, 100L, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        tripsConfig6.setMinimalTripDuration((long) (short) 100);
        long long10 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 1L, 1L, 1L, true, (long) (-1), false);
        tripsConfig6.setUseIgnition(true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        boolean boolean13 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (byte) 10);
        long long16 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        context0.Context();
        java.lang.String str3 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str7 = context0.getFinal();
        java.lang.String str8 = context0.getFinal();
        context0.Context();
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        boolean boolean9 = tripsConfig6.getGreedyParking();
        tripsConfig6.setUseIgnition(true);
        tripsConfig6.setMinimalTripDuration((long) (short) 1);
        tripsConfig6.setMinimalTripDuration((long) (byte) 100);
        double double16 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) '#', (long) 10, (long) '4', false, (long) '#', false);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 1);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        long long12 = tripsConfig6.getMinimalTripDuration();
        double double13 = tripsConfig6.getMinimalTripDistance();
        java.lang.Class<?> wildcardClass14 = tripsConfig6.getClass();
        tripsConfig6.setMinimalTripDuration((long) 'a');
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        long long6 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalNoDataDuration((long) (byte) -1);
        boolean boolean11 = tripsConfig0.getUseIgnition();
        long long12 = tripsConfig0.getMinimalParkingDuration();
        java.lang.Class<?> wildcardClass13 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((long) ' ');
        tripsConfig0.setGreedyParking(true);
        boolean boolean10 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalTripDistance((-1.0d));
        boolean boolean13 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalParkingDuration((long) '4');
        double double16 = tripsConfig0.getMinimalTripDistance();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) 100);
        long long9 = tripsConfig6.getMinimalParkingDuration();
        tripsConfig6.setGreedyParking(false);
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration((long) '#');
        boolean boolean9 = tripsConfig6.getUseIgnition();
        tripsConfig6.setGreedyParking(true);
        long long12 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalNoDataDuration(0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) (byte) 10);
        double double13 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalTripDistance((double) (-1));
        long long16 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setGreedyParking(true);
        long long19 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalTripDistance(10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalParkingDuration(0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 97L, (long) 0, (long) (short) 1, true, (long) '#', true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        boolean boolean8 = tripsConfig0.getGreedyParking();
        tripsConfig0.setMinimalParkingDuration((long) (short) 10);
        tripsConfig0.setMinimalParkingDuration((long) 1);
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 10.0f, (long) (byte) 1, (long) (byte) 0, false, (long) ' ', true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        java.lang.Class<?> wildcardClass7 = tripsConfig6.getClass();
        tripsConfig6.setMinimalParkingDuration((long) 'a');
        java.lang.Class<?> wildcardClass10 = tripsConfig6.getClass();
        java.lang.Class<?> wildcardClass11 = tripsConfig6.getClass();
        boolean boolean12 = tripsConfig6.getGreedyParking();
        double double13 = tripsConfig6.getMinimalTripDistance();
        double double14 = tripsConfig6.getMinimalTripDistance();
        double double15 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalParkingDuration((long) (short) 100);
        boolean boolean18 = tripsConfig6.getUseIgnition();
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        java.lang.String str6 = context0.getFinal();
        context0.Context();
        java.lang.Class<?> wildcardClass8 = context0.getClass();
        java.lang.Class<?> wildcardClass9 = context0.getClass();
        context0.Context();
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDistance((double) (-1.0f));
        boolean boolean9 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalNoDataDuration((long) (short) 100);
        double double12 = tripsConfig0.getMinimalTripDistance();
        tripsConfig0.setUseIgnition(false);
        boolean boolean15 = tripsConfig0.getGreedyParking();
        tripsConfig0.setUseIgnition(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (byte) 100, 1L, 0L, true, (long) (short) 100, true);
        tripsConfig6.setMinimalParkingDuration((long) (short) 100);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        tripsConfig0.setMinimalTripDuration((long) (short) -1);
        tripsConfig0.setMinimalTripDuration((-1L));
        tripsConfig0.setUseIgnition(false);
        long long11 = tripsConfig0.getMinimalParkingDuration();
        tripsConfig0.setMinimalParkingDuration((long) (byte) -1);
        tripsConfig0.setMinimalTripDistance((double) (byte) 0);
        tripsConfig0.setGreedyParking(false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        boolean boolean6 = tripsConfig0.getUseIgnition();
        tripsConfig0.setMinimalTripDuration((long) (byte) 1);
        double double9 = tripsConfig0.getMinimalTripDistance();
        long long10 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig(0.0d, 10L, (long) (byte) 0, false, (long) (short) 0, true);
        tripsConfig6.setMinimalNoDataDuration((long) (short) -1);
        tripsConfig6.setMinimalParkingDuration(35L);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (short) -1, (long) (short) -1, (long) (byte) 10, false, (long) (short) 10, false);
        boolean boolean7 = tripsConfig6.getGreedyParking();
        double double8 = tripsConfig6.getMinimalTripDistance();
        tripsConfig6.setMinimalParkingDuration((long) (short) 100);
        long long11 = tripsConfig6.getMinimalTripDuration();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setMinimalNoDataDuration((-1L));
        java.lang.Class<?> wildcardClass8 = tripsConfig0.getClass();
        java.lang.Class<?> wildcardClass9 = tripsConfig0.getClass();
        tripsConfig0.setMinimalTripDuration((long) '4');
        tripsConfig0.setUseIgnition(false);
        long long14 = tripsConfig0.getMinimalNoDataDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) (-1.0f), (long) (-1), 0L, false, (long) (-1), true);
        tripsConfig6.setMinimalTripDuration(100L);
        tripsConfig6.setMinimalTripDistance((double) ' ');
        long long11 = tripsConfig6.getMinimalNoDataDuration();
        boolean boolean12 = tripsConfig6.getUseIgnition();
        long long13 = tripsConfig6.getMinimalTripDuration();
        tripsConfig6.setMinimalParkingDuration((long) 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.br.TripsConfig tripsConfig0 = new org.br.TripsConfig();
        tripsConfig0.setMinimalNoDataDuration((long) 0);
        tripsConfig0.setMinimalTripDistance((double) 0);
        long long5 = tripsConfig0.getMinimalTripDuration();
        tripsConfig0.setGreedyParking(true);
        tripsConfig0.setUseIgnition(true);
        tripsConfig0.setMinimalParkingDuration((long) 100);
        tripsConfig0.setMinimalNoDataDuration((long) 'a');
        long long14 = tripsConfig0.getMinimalParkingDuration();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.br.TripsConfig tripsConfig6 = new org.br.TripsConfig((double) 'a', (long) (byte) 100, (long) (byte) 100, true, (long) '#', false);
        tripsConfig6.setMinimalTripDuration((long) (short) -1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.br.Context context0 = new org.br.Context();
        java.lang.String str1 = context0.getFinal();
        java.lang.String str2 = context0.getFinal();
        context0.Context();
        java.lang.String str4 = context0.getFinal();
        context0.Context();
        context0.Context();
        context0.Context();
        java.lang.String str8 = context0.getFinal();
        java.lang.String str9 = context0.getFinal();
        java.lang.String str10 = context0.getFinal();
        context0.Context();
    }
}

