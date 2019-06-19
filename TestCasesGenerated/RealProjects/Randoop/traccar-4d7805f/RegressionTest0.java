import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.traccar.database.CalendarManager calendarManager0 = org.traccar.Context.getCalendarManager();
        org.junit.Assert.assertNull(calendarManager0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.velocity.app.VelocityEngine velocityEngine0 = org.traccar.Context.getVelocityEngine();
        org.junit.Assert.assertNull(velocityEngine0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.traccar.database.NotificationManager notificationManager0 = org.traccar.Context.getNotificationManager();
        org.junit.Assert.assertNull(notificationManager0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = org.traccar.Context.getObjectMapper();
        org.junit.Assert.assertNull(objectMapper0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.traccar.geolocation.GeolocationProvider geolocationProvider0 = org.traccar.Context.getGeolocationProvider();
        org.junit.Assert.assertNull(geolocationProvider0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.traccar.reports.model.TripsConfig tripsConfig0 = org.traccar.Context.getTripsConfig();
        org.junit.Assert.assertNull(tripsConfig0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.traccar.ServerManager serverManager0 = org.traccar.Context.getServerManager();
        org.junit.Assert.assertNull(serverManager0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        boolean boolean0 = org.traccar.Context.isLoggerEnabled();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.traccar.database.AliasesManager aliasesManager0 = org.traccar.Context.getAliasesManager();
        org.junit.Assert.assertNull(aliasesManager0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.traccar.database.AttributesManager attributesManager0 = org.traccar.Context.getAttributesManager();
        org.junit.Assert.assertNull(attributesManager0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.traccar.smpp.SmppClient smppClient0 = org.traccar.Context.getSmppManager();
        org.junit.Assert.assertNull(smppClient0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.traccar.database.DataManager dataManager0 = org.traccar.Context.getDataManager();
        org.junit.Assert.assertNull(dataManager0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.traccar.events.MotionEventHandler motionEventHandler0 = org.traccar.Context.getMotionEventHandler();
        org.junit.Assert.assertNull(motionEventHandler0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.traccar.database.PermissionsManager permissionsManager0 = org.traccar.Context.getPermissionsManager();
        org.junit.Assert.assertNull(permissionsManager0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.traccar.database.DeviceManager deviceManager0 = org.traccar.Context.getDeviceManager();
        org.junit.Assert.assertNull(deviceManager0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.traccar.Config config0 = org.traccar.Context.getConfig();
        org.junit.Assert.assertNull(config0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.traccar.database.UsersManager usersManager0 = org.traccar.Context.getUsersManager();
        org.junit.Assert.assertNull(usersManager0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.traccar.geocoder.Geocoder geocoder0 = org.traccar.Context.getGeocoder();
        org.junit.Assert.assertNull(geocoder0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.traccar.events.OverspeedEventHandler overspeedEventHandler0 = org.traccar.Context.getOverspeedEventHandler();
        org.junit.Assert.assertNull(overspeedEventHandler0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.traccar.database.MediaManager mediaManager0 = org.traccar.Context.getMediaManager();
        org.junit.Assert.assertNull(mediaManager0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.traccar.web.WebServer webServer0 = org.traccar.Context.getWebServer();
        org.junit.Assert.assertNull(webServer0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.traccar.database.ConnectionManager connectionManager0 = org.traccar.Context.getConnectionManager();
        org.junit.Assert.assertNull(connectionManager0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.traccar.database.GroupsManager groupsManager0 = org.traccar.Context.getGroupsManager();
        org.junit.Assert.assertNull(groupsManager0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.traccar.database.IdentityManager identityManager0 = org.traccar.Context.getIdentityManager();
        org.junit.Assert.assertNull(identityManager0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.traccar.database.DriversManager driversManager0 = org.traccar.Context.getDriversManager();
        org.junit.Assert.assertNull(driversManager0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String[] strArray0 = null;
        try {
            org.traccar.Context.init(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.traccar.database.StatisticsManager statisticsManager0 = org.traccar.Context.getStatisticsManager();
        org.junit.Assert.assertNull(statisticsManager0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.traccar.database.GeofenceManager geofenceManager0 = org.traccar.Context.getGeofenceManager();
        org.junit.Assert.assertNull(geofenceManager0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.traccar.notification.EventForwarder eventForwarder0 = org.traccar.Context.getEventForwarder();
        org.junit.Assert.assertNull(eventForwarder0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        try {
            org.traccar.Context.init(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Configuration file is not provided");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        try {
            org.traccar.Context.init(strArray1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        try {
            org.traccar.Context.init(strArray2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        try {
            org.traccar.Context.init(strArray2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        try {
            org.traccar.Context.init(strArray2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray2);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        try {
            org.traccar.Context.init(strArray1);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray4);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray3);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray5);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "", "", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "", "", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!", "hi!" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "" };
        try {
            org.traccar.Context.init(strArray6);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (Arquivo ou diretório não encontrado)");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.ning.http.client.AsyncHttpClient asyncHttpClient0 = org.traccar.Context.getAsyncHttpClient();
        java.lang.Class<?> wildcardClass1 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass2 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass3 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass4 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass5 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass6 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass7 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass8 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass9 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass10 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass11 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass12 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass13 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass14 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass15 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass16 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass17 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass18 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass19 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass20 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass21 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass22 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass23 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass24 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass25 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass26 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass27 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass28 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass29 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass30 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass31 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass32 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass33 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass34 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass35 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass36 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass37 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass38 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass39 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass40 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass41 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass42 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass43 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass44 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass45 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass46 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass47 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass48 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass49 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass50 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass51 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass52 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass53 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass54 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass55 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass56 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass57 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass58 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass59 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass60 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass61 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass62 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass63 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass64 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass65 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass66 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass67 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass68 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass69 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass70 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass71 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass72 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass73 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass74 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass75 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass76 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass77 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass78 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass79 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass80 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass81 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass82 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass83 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass84 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass85 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass86 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass87 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass88 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass89 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass90 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass91 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass92 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass93 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass94 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass95 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass96 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass97 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass98 = asyncHttpClient0.getClass();
        java.lang.Class<?> wildcardClass99 = asyncHttpClient0.getClass();
        org.junit.Assert.assertNotNull(asyncHttpClient0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.Class<?> wildcardClass5 = obj0.getClass();
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.Class<?> wildcardClass7 = obj0.getClass();
        java.lang.Class<?> wildcardClass8 = obj0.getClass();
        java.lang.Class<?> wildcardClass9 = obj0.getClass();
        java.lang.Class<?> wildcardClass10 = obj0.getClass();
        java.lang.Class<?> wildcardClass11 = obj0.getClass();
        java.lang.Class<?> wildcardClass12 = obj0.getClass();
        java.lang.Class<?> wildcardClass13 = obj0.getClass();
        java.lang.Class<?> wildcardClass14 = obj0.getClass();
        java.lang.Class<?> wildcardClass15 = obj0.getClass();
        java.lang.Class<?> wildcardClass16 = obj0.getClass();
        java.lang.Class<?> wildcardClass17 = obj0.getClass();
        java.lang.Class<?> wildcardClass18 = obj0.getClass();
        java.lang.Class<?> wildcardClass19 = obj0.getClass();
        java.lang.Class<?> wildcardClass20 = obj0.getClass();
        java.lang.Class<?> wildcardClass21 = obj0.getClass();
        java.lang.Class<?> wildcardClass22 = obj0.getClass();
        java.lang.Class<?> wildcardClass23 = obj0.getClass();
        java.lang.Class<?> wildcardClass24 = obj0.getClass();
        java.lang.Class<?> wildcardClass25 = obj0.getClass();
        java.lang.Class<?> wildcardClass26 = obj0.getClass();
        java.lang.Class<?> wildcardClass27 = obj0.getClass();
        java.lang.Class<?> wildcardClass28 = obj0.getClass();
        java.lang.Class<?> wildcardClass29 = obj0.getClass();
        java.lang.Class<?> wildcardClass30 = obj0.getClass();
        java.lang.Class<?> wildcardClass31 = obj0.getClass();
        java.lang.Class<?> wildcardClass32 = obj0.getClass();
        java.lang.Class<?> wildcardClass33 = obj0.getClass();
        java.lang.Class<?> wildcardClass34 = obj0.getClass();
        java.lang.Class<?> wildcardClass35 = obj0.getClass();
        java.lang.Class<?> wildcardClass36 = obj0.getClass();
        java.lang.Class<?> wildcardClass37 = obj0.getClass();
        java.lang.Class<?> wildcardClass38 = obj0.getClass();
        java.lang.Class<?> wildcardClass39 = obj0.getClass();
        java.lang.Class<?> wildcardClass40 = obj0.getClass();
        java.lang.Class<?> wildcardClass41 = obj0.getClass();
        java.lang.Class<?> wildcardClass42 = obj0.getClass();
        java.lang.Class<?> wildcardClass43 = obj0.getClass();
        java.lang.Class<?> wildcardClass44 = obj0.getClass();
        java.lang.Class<?> wildcardClass45 = obj0.getClass();
        java.lang.Class<?> wildcardClass46 = obj0.getClass();
        java.lang.Class<?> wildcardClass47 = obj0.getClass();
        java.lang.Class<?> wildcardClass48 = obj0.getClass();
        java.lang.Class<?> wildcardClass49 = obj0.getClass();
        java.lang.Class<?> wildcardClass50 = obj0.getClass();
        java.lang.Class<?> wildcardClass51 = obj0.getClass();
        java.lang.Class<?> wildcardClass52 = obj0.getClass();
        java.lang.Class<?> wildcardClass53 = obj0.getClass();
        java.lang.Class<?> wildcardClass54 = obj0.getClass();
        java.lang.Class<?> wildcardClass55 = obj0.getClass();
        java.lang.Class<?> wildcardClass56 = obj0.getClass();
        java.lang.Class<?> wildcardClass57 = obj0.getClass();
        java.lang.Class<?> wildcardClass58 = obj0.getClass();
        java.lang.Class<?> wildcardClass59 = obj0.getClass();
        java.lang.Class<?> wildcardClass60 = obj0.getClass();
        java.lang.Class<?> wildcardClass61 = obj0.getClass();
        java.lang.Class<?> wildcardClass62 = obj0.getClass();
        java.lang.Class<?> wildcardClass63 = obj0.getClass();
        java.lang.Class<?> wildcardClass64 = obj0.getClass();
        java.lang.Class<?> wildcardClass65 = obj0.getClass();
        java.lang.Class<?> wildcardClass66 = obj0.getClass();
        java.lang.Class<?> wildcardClass67 = obj0.getClass();
        java.lang.Class<?> wildcardClass68 = obj0.getClass();
        java.lang.Class<?> wildcardClass69 = obj0.getClass();
        java.lang.Class<?> wildcardClass70 = obj0.getClass();
        java.lang.Class<?> wildcardClass71 = obj0.getClass();
        java.lang.Class<?> wildcardClass72 = obj0.getClass();
        java.lang.Class<?> wildcardClass73 = obj0.getClass();
        java.lang.Class<?> wildcardClass74 = obj0.getClass();
        java.lang.Class<?> wildcardClass75 = obj0.getClass();
        java.lang.Class<?> wildcardClass76 = obj0.getClass();
        java.lang.Class<?> wildcardClass77 = obj0.getClass();
        java.lang.Class<?> wildcardClass78 = obj0.getClass();
        java.lang.Class<?> wildcardClass79 = obj0.getClass();
        java.lang.Class<?> wildcardClass80 = obj0.getClass();
        java.lang.Class<?> wildcardClass81 = obj0.getClass();
        java.lang.Class<?> wildcardClass82 = obj0.getClass();
        java.lang.Class<?> wildcardClass83 = obj0.getClass();
        java.lang.Class<?> wildcardClass84 = obj0.getClass();
        java.lang.Class<?> wildcardClass85 = obj0.getClass();
        java.lang.Class<?> wildcardClass86 = obj0.getClass();
        java.lang.Class<?> wildcardClass87 = obj0.getClass();
        java.lang.Class<?> wildcardClass88 = obj0.getClass();
        java.lang.Class<?> wildcardClass89 = obj0.getClass();
        java.lang.Class<?> wildcardClass90 = obj0.getClass();
        java.lang.Class<?> wildcardClass91 = obj0.getClass();
        java.lang.Class<?> wildcardClass92 = obj0.getClass();
        java.lang.Class<?> wildcardClass93 = obj0.getClass();
        java.lang.Class<?> wildcardClass94 = obj0.getClass();
        java.lang.Class<?> wildcardClass95 = obj0.getClass();
        java.lang.Class<?> wildcardClass96 = obj0.getClass();
        java.lang.Class<?> wildcardClass97 = obj0.getClass();
        java.lang.Class<?> wildcardClass98 = obj0.getClass();
        java.lang.Class<?> wildcardClass99 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass85);
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertNotNull(wildcardClass91);
        org.junit.Assert.assertNotNull(wildcardClass92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertNotNull(wildcardClass96);
        org.junit.Assert.assertNotNull(wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }
}

