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
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean9 = textNode7.hasAttr("i!");
        int int10 = textNode7.siblingIndex();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int15 = textNode14.siblingIndex();
        org.jsoup.nodes.Document document16 = textNode14.ownerDocument();
        int int17 = textNode14.childNodeSize();
        java.lang.String str19 = textNode14.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode14.childNodes();
        org.jsoup.nodes.TextNode textNode22 = textNode14.text("#text");
        boolean boolean23 = textNode7.equals((java.lang.Object) "#text");
        textNode7.setBaseUri("");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Node node15 = textNode12.attr("#text", "h");
        java.lang.String str16 = textNode12.nodeName();
        org.jsoup.nodes.TextNode textNode19 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str20 = textNode19.baseUri();
        boolean boolean22 = textNode19.hasAttr("hi!");
        java.lang.String str23 = textNode19.getWholeText();
        java.lang.String str24 = textNode19.getWholeText();
        boolean boolean25 = textNode19.isBlank();
        boolean boolean26 = textNode12.equals((java.lang.Object) textNode19);
        org.jsoup.nodes.Node node27 = textNode12.previousSibling();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "h" + "'", str5.equals("h"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        boolean boolean16 = textNode2.equals((java.lang.Object) nodeList15);
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        java.lang.String str18 = textNode2.text();
        org.jsoup.nodes.Node node21 = textNode2.attr("h", "");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.Node node15 = textNode13.clone();
        try {
            org.jsoup.nodes.Node node16 = textNode13.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("h");
        boolean boolean6 = textNode2.hasAttr("hi!");
        java.lang.String str8 = textNode2.attr("#text");
        org.jsoup.nodes.Node node11 = textNode2.attr("i!", "i!");
        int int12 = textNode2.siblingIndex();
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        org.jsoup.nodes.Document document9 = node8.ownerDocument();
        try {
            org.jsoup.nodes.Node node10 = node8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.childNodeSize();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node15 = textNode2.attr("i!", "h");
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        boolean boolean17 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        boolean boolean21 = textNode2.isBlank();
        java.lang.String str23 = textNode2.attr("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        boolean boolean11 = textNode2.isBlank();
        boolean boolean12 = textNode2.isBlank();
        boolean boolean13 = textNode2.isBlank();
        java.lang.String str14 = textNode2.text();
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.nodeName();
        textNode2.setBaseUri("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodes();
        java.lang.String str8 = textNode6.baseUri();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.baseUri();
        org.jsoup.nodes.Node node15 = textNode11.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.siblingNodes();
        boolean boolean17 = textNode6.equals((java.lang.Object) nodeList16);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        try {
            java.lang.String str8 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        boolean boolean15 = textNode2.hasAttr("hi!");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor7 = null;
        try {
            org.jsoup.nodes.Node node8 = textNode2.traverse(nodeVisitor7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "i!");
        try {
            org.jsoup.nodes.Node node4 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.lang.String str4 = textNode2.text();
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node8 = textNode2.attr("#text", "h");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.Class<?> wildcardClass10 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        java.lang.String str13 = textNode2.getWholeText();
        java.lang.String str14 = textNode2.text();
        try {
            org.jsoup.nodes.Node node16 = textNode2.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) (short) 1);
        java.lang.String str21 = textNode20.outerHtml();
        int int22 = textNode20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode20.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode20.childNodes();
        org.jsoup.nodes.Node node27 = textNode20.removeAttr("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "i!" + "'", str21.equals("i!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node12 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        boolean boolean11 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        boolean boolean13 = textNode2.equals((java.lang.Object) nodeList12);
        org.jsoup.nodes.TextNode textNode15 = textNode2.text("hi!");
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        java.lang.String str17 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode22 = textNode20.text("hi!");
        java.lang.String str23 = textNode20.outerHtml();
        java.lang.String str24 = textNode20.getWholeText();
        java.lang.String str26 = textNode20.absUrl("#text");
        java.lang.String str27 = textNode20.toString();
        boolean boolean29 = textNode20.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode20.childNodesCopy();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        java.lang.String str12 = textNode10.baseUri();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str16 = textNode15.baseUri();
        java.lang.String str17 = textNode15.baseUri();
        boolean boolean18 = textNode10.equals((java.lang.Object) textNode15);
        java.lang.String str20 = textNode15.absUrl("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode15.childNodes();
        boolean boolean22 = textNode5.equals((java.lang.Object) textNode15);
        boolean boolean23 = textNode15.isBlank();
        java.lang.String str25 = textNode15.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.baseUri();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode2.childNodes();
        java.lang.String str26 = textNode2.outerHtml();
        boolean boolean28 = textNode2.hasAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode32 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean33 = textNode32.isBlank();
        boolean boolean35 = textNode32.hasAttr("hi!");
        org.jsoup.nodes.Node node36 = textNode32.previousSibling();
        java.lang.String str37 = textNode32.text();
        try {
            org.jsoup.nodes.Node node38 = textNode2.after((org.jsoup.nodes.Node) textNode32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "i!" + "'", str26.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.toString();
        int int18 = textNode13.childNodeSize();
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode23 = textNode21.text("hi!");
        java.lang.String str24 = textNode21.outerHtml();
        org.jsoup.nodes.Node node27 = textNode21.attr("hi!", "#text");
        org.jsoup.nodes.Node node28 = textNode21.clone();
        boolean boolean29 = textNode13.equals((java.lang.Object) textNode21);
        boolean boolean30 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str31 = textNode13.outerHtml();
        try {
            org.jsoup.nodes.Node node33 = textNode13.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str11 = textNode2.text();
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("hi!");
        int int22 = textNode2.siblingIndex();
        java.lang.String str24 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode26 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.Node node28 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(textNode26);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Node node8 = textNode2.attr("i!", "h");
        try {
            org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) 0);
        java.lang.String str15 = textNode2.toString();
        java.lang.String str16 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.toString();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        java.lang.String str18 = textNode2.getWholeText();
        org.jsoup.nodes.Node node20 = textNode2.removeAttr("i!");
        try {
            org.jsoup.nodes.Node node22 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode8 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int9 = textNode8.siblingIndex();
        org.jsoup.nodes.Document document10 = textNode8.ownerDocument();
        int int11 = textNode8.childNodeSize();
        java.lang.Class<?> wildcardClass12 = textNode8.getClass();
        int int13 = textNode8.childNodeSize();
        java.lang.String str14 = textNode8.nodeName();
        textNode8.setBaseUri("i!");
        java.lang.String str18 = textNode8.absUrl("#text");
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean23 = textNode21.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes24 = textNode21.attributes();
        java.lang.String str25 = textNode21.outerHtml();
        java.lang.Class<?> wildcardClass26 = textNode21.getClass();
        java.lang.String str27 = textNode21.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode21.siblingNodes();
        org.jsoup.nodes.Node node29 = textNode21.nextSibling();
        java.lang.String str30 = textNode21.nodeName();
        java.lang.String str31 = textNode21.text();
        boolean boolean32 = textNode8.equals((java.lang.Object) str31);
        try {
            org.jsoup.nodes.Node node33 = textNode2.after((org.jsoup.nodes.Node) textNode8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(attributes24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "#text" + "'", str30.equals("#text"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.String str14 = textNode2.attr("#text");
        java.lang.Class<?> wildcardClass15 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("i!");
        boolean boolean26 = textNode24.hasAttr("#text");
        try {
            org.jsoup.nodes.Node node28 = textNode24.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        java.lang.String str21 = textNode20.getWholeText();
        java.lang.String str23 = textNode20.absUrl("i!");
        org.jsoup.nodes.Node node24 = textNode20.nextSibling();
        org.jsoup.nodes.TextNode textNode26 = textNode20.text("i!");
        try {
            org.jsoup.nodes.Node node28 = textNode26.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(textNode26);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Attributes attributes10 = textNode9.attributes();
        org.jsoup.nodes.Node node11 = textNode9.previousSibling();
        try {
            org.jsoup.nodes.Document document12 = node11.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.absUrl("h");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode15.childNodes();
        org.jsoup.nodes.TextNode textNode22 = textNode15.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode15.childNodesCopy();
        java.lang.String str25 = textNode15.attr("hi!");
        java.lang.String str27 = textNode15.attr("#text");
        java.lang.String str29 = textNode15.absUrl("#text");
        try {
            org.jsoup.nodes.Node node30 = document12.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        boolean boolean9 = textNode2.isBlank();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node13 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node8 = textNode6.removeAttr("hi!");
        org.jsoup.nodes.Node node9 = node8.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = node8.siblingNodes();
        boolean boolean11 = textNode2.equals((java.lang.Object) nodeList10);
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        java.lang.String str14 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor10 = null;
        try {
            org.jsoup.nodes.Node node11 = textNode2.traverse(nodeVisitor10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean29 = textNode28.isBlank();
        boolean boolean30 = textNode17.equals((java.lang.Object) textNode28);
        java.lang.String str31 = textNode17.getWholeText();
        try {
            java.lang.String str33 = textNode17.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.toString();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        java.lang.String str18 = textNode2.nodeName();
        org.jsoup.nodes.Document document19 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("#text");
        java.lang.Class<?> wildcardClass22 = node21.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor23 = null;
        try {
            org.jsoup.nodes.Node node24 = node21.traverse(nodeVisitor23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode17.childNodes();
        boolean boolean29 = textNode17.hasAttr("hi!");
        org.jsoup.nodes.Node node32 = textNode17.attr("#text", "#text");
        int int33 = textNode17.siblingIndex();
        java.lang.String str34 = textNode17.nodeName();
        int int35 = textNode17.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "#text" + "'", str34.equals("#text"));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) (short) 1);
        java.lang.String str21 = textNode20.outerHtml();
        int int22 = textNode20.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode20.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.siblingNodes();
        java.lang.String str26 = textNode20.absUrl("#text");
        java.lang.String str27 = textNode20.text();
        org.jsoup.nodes.TextNode textNode30 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str31 = textNode30.getWholeText();
        org.jsoup.nodes.TextNode textNode34 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean35 = textNode30.equals((java.lang.Object) "hi!");
        java.lang.String str36 = textNode30.getWholeText();
        try {
            textNode20.replaceWith((org.jsoup.nodes.Node) textNode30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "i!" + "'", str21.equals("i!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "i!" + "'", str27.equals("i!"));
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        try {
            org.jsoup.nodes.Node node6 = textNode2.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        java.lang.String str3 = textNode2.text();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode8 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("hi!");
        java.lang.String str11 = textNode8.outerHtml();
        org.jsoup.nodes.Node node14 = textNode8.attr("hi!", "#text");
        org.jsoup.nodes.Node node15 = textNode8.clone();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        int int20 = textNode18.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode18.previousSibling();
        java.lang.String str22 = textNode18.nodeName();
        org.jsoup.nodes.Node node23 = textNode18.clone();
        int int24 = textNode18.siblingIndex();
        org.jsoup.nodes.TextNode textNode26 = textNode18.text("h");
        org.jsoup.nodes.TextNode textNode28 = textNode18.text("i!");
        java.lang.String str29 = textNode28.text();
        boolean boolean30 = textNode8.equals((java.lang.Object) str29);
        org.jsoup.nodes.Node node33 = textNode8.attr("h", "h");
        boolean boolean34 = textNode2.equals((java.lang.Object) node33);
        try {
            org.jsoup.nodes.Node node36 = textNode2.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "i!" + "'", str29.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.baseUri();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str11 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node14 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        boolean boolean13 = textNode2.hasAttr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        textNode2.setBaseUri("h");
        boolean boolean7 = textNode2.hasAttr("hi!");
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node12 = node10.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.String str12 = textNode2.nodeName();
        textNode2.setBaseUri("h");
        java.lang.String str15 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode2.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        org.jsoup.nodes.Node node12 = textNode10.clone();
        org.jsoup.nodes.Node node13 = textNode10.previousSibling();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        int int21 = textNode16.childNodeSize();
        org.jsoup.nodes.TextNode textNode24 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode26 = textNode24.text("hi!");
        java.lang.String str27 = textNode24.outerHtml();
        org.jsoup.nodes.Node node30 = textNode24.attr("hi!", "#text");
        org.jsoup.nodes.Node node31 = textNode24.clone();
        boolean boolean32 = textNode16.equals((java.lang.Object) textNode24);
        org.jsoup.nodes.TextNode textNode34 = textNode16.splitText((int) (short) 1);
        java.lang.String str35 = textNode34.outerHtml();
        java.lang.String str37 = textNode34.attr("h");
        java.lang.String str38 = textNode34.outerHtml();
        try {
            org.jsoup.nodes.Node node39 = textNode10.before((org.jsoup.nodes.Node) textNode34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "i!" + "'", str35.equals("i!"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "i!" + "'", str38.equals("i!"));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode19 = textNode17.text("hi!");
        int int20 = textNode17.siblingIndex();
        int int21 = textNode17.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("hi!");
        org.jsoup.nodes.Node node15 = textNode12.nextSibling();
        org.jsoup.nodes.Node node16 = textNode12.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        org.jsoup.nodes.Node node18 = textNode12.nextSibling();
        java.lang.String str19 = textNode12.getWholeText();
        java.lang.String str20 = textNode12.getWholeText();
        boolean boolean21 = textNode2.equals((java.lang.Object) textNode12);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.siblingNodes();
        boolean boolean12 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        org.jsoup.nodes.Node node7 = node6.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = node6.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode6.splitText((int) (byte) 1);
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean13 = textNode11.hasAttr("h");
        org.jsoup.nodes.Node node14 = textNode11.previousSibling();
        java.lang.String str15 = textNode11.text();
        try {
            org.jsoup.nodes.Node node16 = textNode6.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "i!" + "'", str15.equals("i!"));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean15 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes16 = textNode13.attributes();
        java.lang.String str17 = textNode13.outerHtml();
        org.jsoup.nodes.Node node18 = textNode13.nextSibling();
        java.lang.String str19 = textNode13.toString();
        org.jsoup.nodes.Node node22 = textNode13.attr("h", "#text");
        org.jsoup.nodes.Node node23 = textNode13.previousSibling();
        try {
            org.jsoup.nodes.Node node24 = textNode10.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.lang.String str6 = textNode2.outerHtml();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("hi!");
        java.lang.String str14 = textNode11.outerHtml();
        org.jsoup.nodes.Node node15 = textNode11.previousSibling();
        boolean boolean17 = textNode11.hasAttr("#text");
        try {
            org.jsoup.nodes.Node node18 = textNode2.after((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.Node node6 = textNode5.nextSibling();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.nodeName();
        java.lang.String str14 = textNode9.attr("");
        org.jsoup.nodes.Node node15 = textNode9.previousSibling();
        boolean boolean16 = textNode5.equals((java.lang.Object) node15);
        try {
            int int17 = node15.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        java.lang.String str21 = textNode19.attr("i!");
        boolean boolean22 = textNode19.isBlank();
        org.jsoup.nodes.Node node23 = textNode19.previousSibling();
        try {
            org.jsoup.nodes.Node node24 = node23.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str16 = textNode2.attr("");
        java.lang.String str18 = textNode2.attr("");
        java.lang.String str20 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode2.siblingNodes();
        boolean boolean23 = textNode2.hasAttr("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode9.childNodesCopy();
        java.lang.String str14 = textNode9.attr("h");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode19 = textNode17.text("hi!");
        org.jsoup.nodes.Node node20 = textNode17.nextSibling();
        java.lang.String str21 = textNode17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode17.siblingNodes();
        boolean boolean23 = textNode9.equals((java.lang.Object) textNode17);
        int int24 = textNode9.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean8 = textNode2.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        boolean boolean12 = textNode2.hasAttr("hi!");
        try {
            org.jsoup.nodes.Node node13 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = node4.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node4.childNodesCopy();
        java.lang.Class<?> wildcardClass7 = nodeList6.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.Node node15 = textNode2.parent();
        java.lang.String str16 = textNode2.toString();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        java.lang.String str18 = textNode2.nodeName();
        boolean boolean20 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node21 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes23 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes24 = textNode2.attributes();
        try {
            org.jsoup.nodes.Node node26 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node7 = node6.previousSibling();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        java.lang.String str19 = textNode2.text();
        java.lang.String str20 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str24 = textNode23.text();
        org.jsoup.nodes.TextNode textNode26 = textNode23.splitText((int) (byte) 1);
        boolean boolean27 = textNode26.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode26.childNodesCopy();
        boolean boolean29 = textNode26.isBlank();
        java.lang.String str31 = textNode26.attr("i!");
        org.jsoup.nodes.Node node32 = textNode26.parent();
        org.jsoup.nodes.TextNode textNode35 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode37 = textNode35.text("hi!");
        java.lang.String str38 = textNode35.outerHtml();
        org.jsoup.nodes.Node node41 = textNode35.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes42 = textNode35.attributes();
        org.jsoup.nodes.Node node43 = textNode35.parent();
        java.lang.String str45 = textNode35.absUrl("#text");
        java.lang.String str46 = textNode35.toString();
        textNode35.setBaseUri("");
        java.util.List<org.jsoup.nodes.Node> nodeList49 = textNode35.siblingNodes();
        java.lang.String str51 = textNode35.attr("hi!");
        boolean boolean52 = textNode26.equals((java.lang.Object) textNode35);
        try {
            org.jsoup.nodes.Node node53 = textNode2.before((org.jsoup.nodes.Node) textNode35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(textNode35);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(attributes42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "" + "'", str45.equals(""));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList49);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "#text" + "'", str51.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node10 = textNode2.attr("", "i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        org.jsoup.nodes.Node node12 = textNode10.clone();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.lang.String str20 = textNode15.text();
        int int21 = textNode15.siblingIndex();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode24.childNodesCopy();
        int int26 = textNode24.siblingIndex();
        java.lang.String str27 = textNode24.nodeName();
        java.lang.String str28 = textNode24.toString();
        int int29 = textNode24.siblingIndex();
        boolean boolean30 = textNode15.equals((java.lang.Object) int29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode15.childNodes();
        org.jsoup.nodes.Attributes attributes32 = textNode15.attributes();
        java.lang.Class<?> wildcardClass33 = textNode15.getClass();
        boolean boolean34 = node12.equals((java.lang.Object) textNode15);
        try {
            textNode15.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.lang.String str8 = textNode5.attr("h");
        java.lang.Class<?> wildcardClass9 = textNode5.getClass();
        org.jsoup.nodes.TextNode textNode11 = textNode5.text("h");
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("hi!");
        boolean boolean18 = textNode14.hasAttr("#text");
        java.lang.String str20 = textNode14.absUrl("h");
        java.lang.String str21 = textNode14.text();
        try {
            org.jsoup.nodes.Node node22 = textNode11.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        boolean boolean8 = textNode2.hasAttr("");
        boolean boolean9 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Document document11 = textNode10.ownerDocument();
        java.lang.String str12 = textNode10.text();
        org.jsoup.nodes.Node node13 = null;
        try {
            textNode10.replaceWith(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNull(document11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Document document7 = textNode2.ownerDocument();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        java.lang.String str16 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node19 = node17.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = node11.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        java.lang.String str8 = textNode2.text();
        java.lang.String str9 = textNode2.baseUri();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.getWholeText();
        org.jsoup.nodes.Node node17 = textNode2.attr("#text", "");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.Node node23 = textNode2.attr("i!", "h");
        try {
            org.jsoup.nodes.Node node25 = node23.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(node23);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean6 = textNode2.isBlank();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("h");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = node10.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node12 = node10.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = node9.nextSibling();
        try {
            int int11 = node10.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str10 = textNode6.toString();
        int int11 = textNode6.childNodeSize();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("hi!");
        java.lang.String str17 = textNode14.outerHtml();
        org.jsoup.nodes.Node node20 = textNode14.attr("hi!", "#text");
        org.jsoup.nodes.Node node21 = textNode14.clone();
        boolean boolean22 = textNode6.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.TextNode textNode24 = textNode6.text("");
        org.jsoup.nodes.TextNode textNode26 = textNode6.text("h");
        org.jsoup.nodes.TextNode textNode28 = textNode6.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode6.childNodes();
        boolean boolean30 = textNode2.equals((java.lang.Object) textNode6);
        org.jsoup.nodes.Attributes attributes31 = textNode2.attributes();
        int int32 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(attributes31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.baseUri();
        textNode2.setBaseUri("h");
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        java.lang.String str5 = textNode2.text();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode29.childNodesCopy();
        int int31 = textNode29.siblingIndex();
        org.jsoup.nodes.Node node32 = textNode29.previousSibling();
        java.lang.String str33 = textNode29.nodeName();
        org.jsoup.nodes.Node node34 = textNode29.clone();
        int int35 = textNode29.siblingIndex();
        org.jsoup.nodes.TextNode textNode37 = textNode29.text("h");
        org.jsoup.nodes.Attributes attributes38 = textNode37.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode37.siblingNodes();
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = textNode42.childNodesCopy();
        int int44 = textNode42.siblingIndex();
        java.lang.String str45 = textNode42.nodeName();
        java.lang.String str46 = textNode42.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode42.childNodes();
        java.lang.String str48 = textNode42.outerHtml();
        org.jsoup.nodes.Node node49 = textNode42.parent();
        org.jsoup.nodes.Document document50 = textNode42.ownerDocument();
        org.jsoup.nodes.Node node51 = textNode42.previousSibling();
        boolean boolean52 = textNode37.equals((java.lang.Object) node51);
        try {
            textNode17.replaceWith(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertNotNull(attributes38);
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "#text" + "'", str45.equals("#text"));
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(document50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("i!");
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean10 = textNode2.isBlank();
        int int11 = textNode2.childNodeSize();
        boolean boolean12 = textNode2.isBlank();
        org.jsoup.nodes.Node node15 = textNode2.attr("i!", "h");
        org.jsoup.nodes.Node node16 = node15.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str10 = textNode2.absUrl("h");
        boolean boolean11 = textNode2.isBlank();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("hi!");
        int int17 = textNode16.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        java.lang.String str3 = textNode2.text();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node6 = textNode2.parent();
        try {
            int int7 = node6.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.lang.String str5 = textNode2.nodeName();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("h");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int13 = textNode12.siblingIndex();
        java.lang.String str14 = textNode12.text();
        boolean boolean15 = textNode12.isBlank();
        java.lang.String str16 = textNode12.baseUri();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        boolean boolean20 = textNode10.hasAttr("#text");
        java.lang.String str22 = textNode10.absUrl("i!");
        try {
            org.jsoup.nodes.Node node24 = textNode10.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node15 = textNode14.parent();
        java.lang.Class<?> wildcardClass16 = textNode14.getClass();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean21 = textNode19.hasAttr("i!");
        int int22 = textNode19.siblingIndex();
        boolean boolean23 = textNode14.equals((java.lang.Object) textNode19);
        java.lang.String str24 = textNode19.toString();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str16 = textNode14.attr("hi!");
        java.lang.String str17 = textNode14.baseUri();
        boolean boolean18 = textNode14.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        textNode10.setBaseUri("h");
        try {
            java.lang.String str22 = textNode10.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.equals((java.lang.Object) (short) 0);
        boolean boolean13 = textNode2.hasAttr("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        try {
            org.jsoup.nodes.Node node13 = node10.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("hi!");
        org.jsoup.nodes.Node node15 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode5.childNodesCopy();
        boolean boolean8 = textNode5.isBlank();
        java.lang.String str10 = textNode5.attr("i!");
        org.jsoup.nodes.Node node11 = textNode5.parent();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str19 = textNode14.attr("");
        org.jsoup.nodes.Node node20 = textNode14.previousSibling();
        org.jsoup.nodes.TextNode textNode22 = textNode14.text("hi!");
        org.jsoup.nodes.TextNode textNode24 = textNode14.splitText(1);
        try {
            node11.replaceWith((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodes();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.select.NodeVisitor nodeVisitor5 = null;
        try {
            org.jsoup.nodes.Node node6 = node4.traverse(nodeVisitor5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node8 = textNode2.removeAttr("h");
        boolean boolean9 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        int int20 = textNode15.siblingIndex();
        org.jsoup.nodes.Attributes attributes21 = textNode15.attributes();
        org.jsoup.nodes.Node node22 = textNode15.parent();
        org.jsoup.nodes.Node node24 = textNode15.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode26 = textNode15.text("");
        java.lang.String str27 = textNode15.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode15.childNodesCopy();
        try {
            boolean boolean29 = node12.equals((java.lang.Object) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("i!");
        org.jsoup.nodes.Node node16 = textNode13.attr("i!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = node16.childNodesCopy();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(nodeList17);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean29 = textNode28.isBlank();
        boolean boolean30 = textNode17.equals((java.lang.Object) textNode28);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode17.childNodes();
        org.jsoup.nodes.Node node33 = textNode17.removeAttr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.nodeName();
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        java.lang.String str16 = textNode11.toString();
        boolean boolean18 = textNode11.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode11.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode11.childNodes();
        try {
            org.jsoup.nodes.Node node21 = document8.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(nodeList20);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        org.jsoup.nodes.Node node12 = textNode10.clone();
        org.jsoup.nodes.Node node13 = textNode10.previousSibling();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList14 = node13.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        boolean boolean8 = textNode2.isBlank();
        int int9 = textNode2.siblingIndex();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        textNode2.setBaseUri("");
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node8 = textNode2.parent();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node12 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.hasAttr("i!");
        textNode2.setBaseUri("h");
        boolean boolean7 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node9 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode17.childNodes();
        boolean boolean29 = textNode17.hasAttr("hi!");
        textNode17.setBaseUri("#text");
        boolean boolean32 = textNode17.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.equals((java.lang.Object) (short) 0);
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(0);
        org.jsoup.nodes.Node node15 = textNode13.removeAttr("i!");
        try {
            org.jsoup.nodes.Node node17 = node15.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        org.jsoup.nodes.Node node12 = textNode10.clone();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.lang.String str20 = textNode15.text();
        int int21 = textNode15.siblingIndex();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode24.childNodesCopy();
        int int26 = textNode24.siblingIndex();
        java.lang.String str27 = textNode24.nodeName();
        java.lang.String str28 = textNode24.toString();
        int int29 = textNode24.siblingIndex();
        boolean boolean30 = textNode15.equals((java.lang.Object) int29);
        java.util.List<org.jsoup.nodes.Node> nodeList31 = textNode15.childNodes();
        org.jsoup.nodes.Attributes attributes32 = textNode15.attributes();
        java.lang.Class<?> wildcardClass33 = textNode15.getClass();
        boolean boolean34 = node12.equals((java.lang.Object) textNode15);
        java.lang.String str35 = textNode15.nodeName();
        org.jsoup.nodes.TextNode textNode38 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList39 = textNode38.childNodesCopy();
        int int40 = textNode38.siblingIndex();
        java.lang.String str41 = textNode38.nodeName();
        java.lang.String str42 = textNode38.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = textNode38.childNodes();
        org.jsoup.nodes.TextNode textNode45 = textNode38.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode38.childNodesCopy();
        org.jsoup.nodes.TextNode textNode49 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean50 = textNode38.equals((java.lang.Object) textNode49);
        org.jsoup.nodes.TextNode textNode53 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList54 = textNode53.childNodesCopy();
        int int55 = textNode53.siblingIndex();
        org.jsoup.nodes.Node node57 = textNode53.removeAttr("#text");
        java.lang.String str58 = textNode53.getWholeText();
        java.lang.String str59 = textNode53.baseUri();
        boolean boolean60 = textNode49.equals((java.lang.Object) textNode53);
        java.lang.Class<?> wildcardClass61 = textNode53.getClass();
        org.jsoup.nodes.Node node63 = textNode53.removeAttr("h");
        try {
            org.jsoup.nodes.Node node64 = textNode15.after(node63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList31);
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "#text" + "'", str35.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "#text" + "'", str41.equals("#text"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertNotNull(textNode45);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        textNode13.setBaseUri("h");
        org.jsoup.nodes.Attributes attributes37 = textNode13.attributes();
        try {
            org.jsoup.nodes.TextNode textNode39 = textNode13.splitText((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(attributes37);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        java.lang.String str20 = textNode19.outerHtml();
        org.jsoup.nodes.Document document21 = textNode19.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.lang.Class<?> wildcardClass14 = textNode2.getClass();
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode2.splitText((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        boolean boolean22 = textNode2.hasAttr("");
        org.jsoup.nodes.Node node23 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "h");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("i!");
        try {
            org.jsoup.nodes.Node node6 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("i!");
        boolean boolean26 = textNode24.hasAttr("#text");
        java.lang.String str27 = textNode24.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode24.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList28);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText(0);
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        textNode2.setBaseUri("#text");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        java.lang.String str22 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean27 = textNode26.isBlank();
        boolean boolean29 = textNode26.hasAttr("hi!");
        int int30 = textNode26.childNodeSize();
        java.lang.String str31 = textNode26.text();
        org.jsoup.nodes.Attributes attributes32 = textNode26.attributes();
        java.lang.String str33 = textNode26.nodeName();
        boolean boolean34 = textNode2.equals((java.lang.Object) str33);
        org.jsoup.nodes.Node node36 = textNode2.removeAttr("#text");
        try {
            node36.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.nodeName();
        textNode2.setBaseUri("#text");
        java.lang.String str13 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean17 = textNode16.isBlank();
        boolean boolean19 = textNode16.hasAttr("hi!");
        int int20 = textNode16.childNodeSize();
        java.lang.String str21 = textNode16.text();
        boolean boolean23 = textNode16.hasAttr("i!");
        java.lang.Class<?> wildcardClass24 = textNode16.getClass();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node5 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        boolean boolean14 = textNode2.isBlank();
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.baseUri();
        java.lang.String str9 = textNode2.absUrl("h");
        java.lang.Class<?> wildcardClass10 = textNode2.getClass();
        java.lang.String str11 = textNode2.baseUri();
        org.jsoup.nodes.Node node12 = null;
        try {
            org.jsoup.nodes.Node node13 = textNode2.after(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str16 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("i!");
        try {
            org.jsoup.nodes.Node node20 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        org.jsoup.nodes.Document document13 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node11 = textNode2.clone();
        int int12 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodesCopy();
        java.lang.String str16 = textNode2.attr("#text");
        try {
            org.jsoup.nodes.Node node17 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "");
        java.lang.String str3 = textNode2.toString();
        boolean boolean5 = textNode2.hasAttr("i!");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "i!" + "'", str3.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node4.childNodesCopy();
        org.jsoup.nodes.Node node7 = node4.clone();
        int int8 = node7.childNodeSize();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = node7.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.equals((java.lang.Object) "h");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Document document6 = textNode2.ownerDocument();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        int int9 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNull(document6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node9 = textNode2.removeAttr("#text");
        try {
            org.jsoup.nodes.Node node11 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        try {
            org.jsoup.nodes.Node node16 = textNode2.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        java.lang.String str18 = textNode2.outerHtml();
        java.lang.String str19 = textNode2.text();
        org.jsoup.nodes.Node node22 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode25.childNodesCopy();
        int int27 = textNode25.siblingIndex();
        java.lang.String str28 = textNode25.nodeName();
        java.lang.String str29 = textNode25.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode25.childNodes();
        java.lang.String str31 = textNode25.outerHtml();
        org.jsoup.nodes.Node node32 = textNode25.parent();
        org.jsoup.nodes.Document document33 = textNode25.ownerDocument();
        org.jsoup.nodes.Node node34 = textNode25.previousSibling();
        org.jsoup.nodes.Document document35 = textNode25.ownerDocument();
        org.jsoup.nodes.TextNode textNode37 = textNode25.text("hi!");
        try {
            org.jsoup.nodes.Node node38 = textNode2.before((org.jsoup.nodes.Node) textNode25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "#text" + "'", str28.equals("#text"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(document35);
        org.junit.Assert.assertNotNull(textNode37);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode19 = textNode17.text("hi!");
        java.lang.String str20 = textNode17.nodeName();
        org.jsoup.nodes.Node node23 = textNode17.attr("i!", "hi!");
        org.jsoup.nodes.TextNode textNode26 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode26.siblingNodes();
        try {
            org.jsoup.nodes.Node node28 = textNode17.after((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(nodeList27);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.attr("");
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        java.lang.String str10 = textNode2.attr("h");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.siblingNodes();
        try {
            org.jsoup.nodes.Node node27 = textNode17.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.siblingNodes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str15 = textNode2.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass17 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node15 = node14.nextSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode23 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "");
        boolean boolean24 = textNode20.equals((java.lang.Object) "");
        java.lang.String str25 = textNode20.nodeName();
        boolean boolean26 = textNode20.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.toString();
        int int10 = textNode2.siblingIndex();
        java.lang.String str12 = textNode2.attr("#text");
        org.jsoup.select.NodeVisitor nodeVisitor13 = null;
        try {
            org.jsoup.nodes.Node node14 = textNode2.traverse(nodeVisitor13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        int int21 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass22 = textNode2.getClass();
        org.jsoup.nodes.Node node24 = textNode2.removeAttr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node10 = textNode2.attr("hi!", "h");
        java.lang.String str11 = textNode2.getWholeText();
        boolean boolean13 = textNode2.hasAttr("hi!");
        java.lang.String str14 = textNode2.toString();
        org.jsoup.select.NodeVisitor nodeVisitor15 = null;
        try {
            org.jsoup.nodes.Node node16 = textNode2.traverse(nodeVisitor15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.hasAttr("i!");
        textNode2.setBaseUri("h");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int6 = textNode5.siblingIndex();
        org.jsoup.nodes.Document document7 = textNode5.ownerDocument();
        int int8 = textNode5.siblingIndex();
        textNode5.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode5.previousSibling();
        org.jsoup.nodes.Node node12 = textNode5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode5.siblingNodes();
        java.lang.String str14 = textNode5.outerHtml();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode5);
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode5.childNodesCopy();
        try {
            org.jsoup.nodes.Node node18 = textNode5.childNode(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        try {
            org.jsoup.nodes.Node node13 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str12 = textNode11.baseUri();
        java.lang.String str13 = textNode11.baseUri();
        java.lang.Object obj14 = null;
        boolean boolean15 = textNode11.equals(obj14);
        java.lang.String str17 = textNode11.attr("");
        int int18 = textNode11.siblingIndex();
        java.lang.Class<?> wildcardClass19 = textNode11.getClass();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode22.childNodesCopy();
        int int24 = textNode22.siblingIndex();
        java.lang.String str25 = textNode22.nodeName();
        java.lang.String str26 = textNode22.toString();
        java.lang.String str27 = textNode22.text();
        org.jsoup.nodes.Attributes attributes28 = textNode22.attributes();
        java.lang.String str29 = textNode22.text();
        boolean boolean31 = textNode22.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode22.childNodes();
        java.lang.String str33 = textNode22.nodeName();
        java.lang.String str34 = textNode22.nodeName();
        boolean boolean35 = textNode11.equals((java.lang.Object) str34);
        try {
            org.jsoup.nodes.Node node36 = textNode2.before((org.jsoup.nodes.Node) textNode11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "#text" + "'", str34.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.Node node4 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.siblingNodes();
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "h" + "'", str3.equals("h"));
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "h" + "'", str6.equals("h"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.attr("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass13 = textNode2.getClass();
        java.lang.String str15 = textNode2.attr("");
        java.lang.Class<?> wildcardClass16 = textNode2.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node17 = textNode2.clone();
        try {
            org.jsoup.nodes.TextNode textNode19 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.lang.String str11 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str15 = textNode14.baseUri();
        boolean boolean17 = textNode14.hasAttr("hi!");
        boolean boolean18 = textNode14.isBlank();
        org.jsoup.nodes.Node node19 = textNode14.previousSibling();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node13 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean10 = textNode2.isBlank();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.Node node12 = textNode2.clone();
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node5 = node4.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = node4.childNodesCopy();
        try {
            org.jsoup.nodes.Node node8 = node4.childNode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("h");
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "");
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.jsoup.nodes.Node node12 = node10.clone();
        try {
            org.jsoup.nodes.Node node14 = node10.childNode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node7 = node6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        boolean boolean16 = textNode2.equals((java.lang.Object) nodeList15);
        boolean boolean18 = textNode2.equals((java.lang.Object) (short) 10);
        java.lang.String str19 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        textNode8.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode8.previousSibling();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode6.childNodesCopy();
        int int8 = textNode6.siblingIndex();
        java.lang.String str9 = textNode6.nodeName();
        java.lang.String str10 = textNode6.toString();
        int int11 = textNode6.childNodeSize();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode14.text("hi!");
        java.lang.String str17 = textNode14.outerHtml();
        org.jsoup.nodes.Node node20 = textNode14.attr("hi!", "#text");
        org.jsoup.nodes.Node node21 = textNode14.clone();
        boolean boolean22 = textNode6.equals((java.lang.Object) textNode14);
        org.jsoup.nodes.TextNode textNode24 = textNode6.text("");
        org.jsoup.nodes.TextNode textNode26 = textNode6.text("h");
        org.jsoup.nodes.TextNode textNode28 = textNode6.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode6.childNodes();
        boolean boolean30 = textNode2.equals((java.lang.Object) textNode6);
        org.jsoup.nodes.Node node31 = textNode2.nextSibling();
        try {
            int int32 = node31.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(textNode26);
        org.junit.Assert.assertNotNull(textNode28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.attr("i!");
        java.lang.String str9 = textNode2.nodeName();
        java.lang.String str10 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node11 = textNode2.previousSibling();
        java.lang.String str12 = textNode2.nodeName();
        java.lang.String str13 = textNode2.toString();
        java.lang.String str15 = textNode2.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodes();
        org.jsoup.nodes.Node node19 = textNode2.attr("#text", "h");
        boolean boolean21 = textNode2.hasAttr("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        int int4 = textNode2.childNodeSize();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.text();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 1);
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str20 = textNode16.toString();
        java.lang.String str21 = textNode16.text();
        int int22 = textNode16.siblingIndex();
        boolean boolean24 = textNode16.equals((java.lang.Object) (short) 10);
        boolean boolean26 = textNode16.hasAttr("");
        org.jsoup.nodes.Attributes attributes27 = textNode16.attributes();
        int int28 = textNode16.siblingIndex();
        try {
            org.jsoup.nodes.Node node29 = textNode2.before((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(attributes27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        org.jsoup.nodes.TextNode textNode19 = textNode12.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.childNodesCopy();
        boolean boolean21 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str22 = textNode12.getWholeText();
        org.jsoup.nodes.TextNode textNode24 = textNode12.text("i!");
        org.jsoup.nodes.Document document25 = textNode12.ownerDocument();
        try {
            org.jsoup.nodes.Document document26 = document25.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "#text" + "'", str22.equals("#text"));
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNull(document25);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        int int8 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node10 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(0);
        org.jsoup.nodes.Node node15 = textNode2.removeAttr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodesCopy();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.lang.String str3 = textNode2.toString();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.nodeName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("i!");
        org.jsoup.nodes.Node node25 = null;
        try {
            org.jsoup.nodes.Node node26 = textNode2.before(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node9 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        org.jsoup.nodes.Node node12 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node13 = node12.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str15 = textNode14.baseUri();
        boolean boolean17 = textNode14.hasAttr("hi!");
        boolean boolean18 = textNode14.isBlank();
        org.jsoup.nodes.Node node19 = textNode14.previousSibling();
        org.jsoup.nodes.Attributes attributes20 = textNode14.attributes();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(attributes20);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node13 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node14 = textNode2.clone();
        org.jsoup.nodes.Node node15 = node14.previousSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        java.lang.String str8 = textNode2.attr("");
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        org.jsoup.nodes.Node node16 = textNode13.nextSibling();
        org.jsoup.nodes.Node node17 = textNode13.parent();
        org.jsoup.nodes.Node node19 = textNode13.removeAttr("h");
        try {
            node10.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        java.lang.String str10 = textNode2.absUrl("hi!");
        java.lang.String str11 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        try {
            java.lang.String str11 = document10.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(document10);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str16 = textNode2.attr("");
        java.lang.String str18 = textNode2.attr("");
        java.lang.String str20 = textNode2.attr("");
        java.lang.String str21 = textNode2.toString();
        try {
            org.jsoup.nodes.TextNode textNode23 = textNode2.splitText(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList6);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(nodeList13);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        org.jsoup.nodes.TextNode textNode10 = textNode4.text("");
        org.jsoup.nodes.Node node13 = textNode10.attr("i!", "hi!");
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode16.text("hi!");
        java.lang.String str19 = textNode16.outerHtml();
        org.jsoup.nodes.Node node20 = textNode16.previousSibling();
        org.jsoup.nodes.Document document21 = textNode16.ownerDocument();
        try {
            org.jsoup.nodes.Node node22 = textNode10.after((org.jsoup.nodes.Node) textNode16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(document21);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        java.lang.String str12 = textNode2.attr("");
        boolean boolean14 = textNode2.hasAttr("i!");
        int int15 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        java.lang.String str14 = textNode13.baseUri();
        try {
            org.jsoup.nodes.TextNode textNode16 = textNode13.splitText(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node16 = textNode2.clone();
        boolean boolean17 = textNode2.isBlank();
        java.lang.String str18 = textNode2.outerHtml();
        java.lang.String str19 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str14 = textNode10.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode10.childNodes();
        org.jsoup.nodes.TextNode textNode17 = textNode10.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode10.childNodesCopy();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean22 = textNode10.equals((java.lang.Object) textNode21);
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode25.childNodesCopy();
        int int27 = textNode25.siblingIndex();
        org.jsoup.nodes.Node node29 = textNode25.removeAttr("#text");
        java.lang.String str30 = textNode25.getWholeText();
        java.lang.String str31 = textNode25.baseUri();
        boolean boolean32 = textNode21.equals((java.lang.Object) textNode25);
        java.lang.String str33 = textNode25.getWholeText();
        java.lang.String str34 = textNode25.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList35 = textNode25.childNodes();
        boolean boolean36 = textNode2.equals((java.lang.Object) textNode25);
        boolean boolean38 = textNode2.hasAttr("#text");
        org.jsoup.select.NodeVisitor nodeVisitor39 = null;
        try {
            org.jsoup.nodes.Node node40 = textNode2.traverse(nodeVisitor39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        java.lang.String str10 = textNode9.nodeName();
        org.jsoup.nodes.Node node11 = textNode9.clone();
        try {
            org.jsoup.nodes.Node node13 = textNode9.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        java.lang.String str3 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node5 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "#text" + "'", str3.equals("#text"));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node8 = textNode2.attr("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeList5);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str8 = textNode2.attr("#text");
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode11);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode2.childNodes();
        java.lang.String str26 = textNode2.outerHtml();
        org.jsoup.nodes.Node node27 = textNode2.previousSibling();
        int int28 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes29 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "i!" + "'", str26.equals("i!"));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(attributes29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) 0);
        textNode2.setBaseUri("");
        try {
            org.jsoup.nodes.Node node18 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.lang.String str17 = textNode12.text();
        int int18 = textNode12.siblingIndex();
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.childNodesCopy();
        int int23 = textNode21.siblingIndex();
        java.lang.String str24 = textNode21.nodeName();
        java.lang.String str25 = textNode21.toString();
        int int26 = textNode21.siblingIndex();
        boolean boolean27 = textNode12.equals((java.lang.Object) int26);
        org.jsoup.nodes.TextNode textNode29 = textNode12.text("");
        org.jsoup.nodes.Node node31 = textNode12.removeAttr("hi!");
        org.jsoup.nodes.Node node32 = node31.clone();
        org.jsoup.nodes.Node node33 = node31.clone();
        try {
            org.jsoup.nodes.Node node34 = textNode2.after(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.absUrl("i!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (short) 1);
        java.lang.String str15 = textNode13.absUrl("i!");
        int int16 = textNode13.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.getWholeText();
        try {
            org.jsoup.nodes.Node node10 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        boolean boolean21 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node22 = textNode2.clone();
        java.lang.Class<?> wildcardClass23 = node22.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.nodeName();
        org.jsoup.nodes.Node node12 = textNode2.nextSibling();
        try {
            int int13 = node12.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodesCopy();
        java.lang.String str9 = textNode2.attr("i!");
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int13 = textNode12.siblingIndex();
        org.jsoup.nodes.Document document14 = textNode12.ownerDocument();
        org.jsoup.nodes.Node node15 = textNode12.parent();
        boolean boolean16 = textNode12.isBlank();
        org.jsoup.nodes.Node node17 = textNode12.nextSibling();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode12);
        java.lang.String str19 = textNode12.getWholeText();
        org.jsoup.nodes.TextNode textNode22 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int23 = textNode22.siblingIndex();
        org.jsoup.nodes.Document document24 = textNode22.ownerDocument();
        int int25 = textNode22.siblingIndex();
        textNode22.setBaseUri("hi!");
        org.jsoup.nodes.Node node28 = textNode22.previousSibling();
        boolean boolean29 = textNode22.isBlank();
        org.jsoup.nodes.Node node32 = textNode22.attr("h", "");
        try {
            org.jsoup.nodes.Node node33 = textNode12.after(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(document24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.attr("hi!");
        try {
            org.jsoup.nodes.Node node14 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        boolean boolean16 = textNode2.hasAttr("i!");
        java.lang.String str17 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        boolean boolean36 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Node node37 = textNode13.clone();
        boolean boolean38 = textNode13.isBlank();
        org.jsoup.nodes.Attributes attributes39 = textNode13.attributes();
        boolean boolean41 = textNode13.hasAttr("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int15 = textNode14.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode14.childNodesCopy();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(nodeList16);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.Class<?> wildcardClass12 = textNode2.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode2.childNodes();
        boolean boolean14 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        int int10 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str15 = textNode14.text();
        org.jsoup.nodes.TextNode textNode17 = textNode14.splitText((int) (byte) 1);
        boolean boolean18 = textNode17.isBlank();
        org.jsoup.nodes.Node node19 = textNode17.nextSibling();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        boolean boolean21 = textNode2.hasAttr("i!");
        org.jsoup.nodes.Node node22 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node24 = node22.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node11 = node10.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.String str8 = textNode2.absUrl("hi!");
        boolean boolean10 = textNode2.hasAttr("#text");
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        java.lang.String str5 = textNode2.toString();
        java.lang.String str6 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("hi!");
        java.lang.String str14 = textNode13.baseUri();
        try {
            org.jsoup.nodes.Node node15 = textNode2.before((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        java.lang.String str16 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        try {
            org.jsoup.nodes.Node node19 = node17.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        try {
            java.lang.String str15 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(attributes13);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        java.lang.String str19 = textNode2.text();
        java.lang.String str20 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node22 = textNode2.childNode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Node node13 = textNode10.attr("hi!", "h");
        try {
            org.jsoup.nodes.TextNode textNode15 = textNode10.splitText((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must be not be negative");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        org.jsoup.nodes.TextNode textNode19 = textNode12.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.childNodesCopy();
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean24 = textNode12.equals((java.lang.Object) textNode23);
        java.lang.String str26 = textNode12.attr("");
        java.lang.String str28 = textNode12.attr("");
        java.lang.String str30 = textNode12.attr("");
        java.lang.String str31 = textNode12.nodeName();
        try {
            org.jsoup.nodes.Node node32 = textNode2.before((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        int int15 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode20 = org.jsoup.nodes.TextNode.createFromEncoded("", "h");
        boolean boolean21 = textNode20.isBlank();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode20);
        java.lang.String str23 = textNode20.text();
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode20.childNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        org.junit.Assert.assertNotNull(nodeList24);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        java.lang.Class<?> wildcardClass12 = nodeList11.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.toString();
        java.lang.String str9 = textNode2.getWholeText();
        int int10 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 1);
        boolean boolean15 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document document16 = textNode2.ownerDocument();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node13 = textNode2.clone();
        java.lang.String str14 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        java.lang.String str20 = textNode17.nodeName();
        java.lang.String str22 = textNode17.attr("");
        java.lang.String str23 = textNode17.text();
        org.jsoup.nodes.Node node25 = textNode17.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes26 = textNode17.attributes();
        boolean boolean28 = textNode17.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode30 = textNode17.splitText((int) (short) 0);
        java.lang.String str31 = textNode30.baseUri();
        try {
            org.jsoup.nodes.Node node32 = textNode2.before((org.jsoup.nodes.Node) textNode30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(attributes26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(textNode30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.Node node18 = textNode2.parent();
        try {
            org.jsoup.nodes.Document document19 = node18.ownerDocument();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        org.jsoup.nodes.Node node24 = textNode22.removeAttr("#text");
        try {
            org.jsoup.nodes.Node node26 = textNode22.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.getWholeText();
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode24 = textNode2.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode2.childNodes();
        java.lang.String str26 = textNode2.outerHtml();
        org.jsoup.nodes.Node node27 = textNode2.previousSibling();
        try {
            org.jsoup.nodes.Node node29 = node27.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "i!" + "'", str26.equals("i!"));
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str12 = textNode2.outerHtml();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("i!", "i!");
        try {
            org.jsoup.nodes.Node node16 = textNode2.before((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode15);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode17.childNodes();
        boolean boolean29 = textNode17.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode17.childNodesCopy();
        org.jsoup.nodes.TextNode textNode33 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean34 = textNode33.isBlank();
        boolean boolean36 = textNode33.hasAttr("hi!");
        int int37 = textNode33.childNodeSize();
        java.lang.String str38 = textNode33.text();
        boolean boolean40 = textNode33.hasAttr("i!");
        boolean boolean41 = textNode17.equals((java.lang.Object) boolean40);
        try {
            textNode17.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        textNode17.setBaseUri("#text");
        java.lang.Class<?> wildcardClass29 = textNode17.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode17.siblingNodes();
        try {
            org.jsoup.nodes.TextNode textNode32 = textNode17.splitText((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        org.jsoup.nodes.Node node16 = textNode2.attr("i!", "");
        int int17 = textNode2.siblingIndex();
        java.lang.String str19 = textNode2.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean11 = textNode9.hasAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode9.nextSibling();
        boolean boolean13 = textNode2.equals((java.lang.Object) node12);
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode16.childNodesCopy();
        int int18 = textNode16.siblingIndex();
        java.lang.String str19 = textNode16.nodeName();
        java.lang.String str21 = textNode16.attr("");
        java.lang.String str22 = textNode16.text();
        org.jsoup.nodes.Node node24 = textNode16.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes25 = textNode16.attributes();
        org.jsoup.nodes.Node node27 = textNode16.removeAttr("i!");
        org.jsoup.nodes.Node node28 = node27.clone();
        try {
            node12.replaceWith(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "#text" + "'", str19.equals("#text"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.absUrl("#text");
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.toString();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.nodeName();
        java.lang.String str9 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "#text" + "'", str7.equals("#text"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        java.lang.String str5 = textNode2.toString();
        try {
            org.jsoup.nodes.Node node7 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        org.jsoup.nodes.TextNode textNode8 = textNode4.text("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode17 = textNode2.splitText((int) (short) 0);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertNotNull(textNode17);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.nodeName();
        java.lang.String str10 = textNode2.attr("");
        org.jsoup.nodes.Node node11 = textNode2.parent();
        boolean boolean12 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        org.jsoup.nodes.Node node9 = textNode8.previousSibling();
        java.lang.String str11 = textNode8.absUrl("h");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        try {
            org.jsoup.nodes.Node node11 = textNode2.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        java.lang.String str13 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node8 = textNode2.parent();
        java.lang.String str9 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean13 = textNode11.hasAttr("h");
        java.lang.String str14 = textNode11.getWholeText();
        boolean boolean15 = textNode2.equals((java.lang.Object) str14);
        java.lang.String str17 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "i!" + "'", str14.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(nodeList18);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean8 = textNode2.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "h");
        org.jsoup.nodes.Node node3 = textNode2.clone();
        org.jsoup.nodes.Node node4 = node3.nextSibling();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList5 = node4.siblingNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) 0);
        java.lang.String str15 = textNode2.toString();
        int int16 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node17 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        int int11 = textNode2.siblingIndex();
        java.lang.String str13 = textNode2.absUrl("h");
        org.jsoup.nodes.Node node14 = textNode2.previousSibling();
        textNode2.setBaseUri("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        int int15 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("#text");
        try {
            org.jsoup.nodes.Node node21 = textNode19.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNotNull(textNode19);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node11 = textNode2.attr("h", "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        java.lang.String str14 = textNode2.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.TextNode textNode10 = textNode8.text("");
        try {
            org.jsoup.nodes.Node node11 = textNode8.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str14 = textNode10.toString();
        java.lang.String str15 = textNode10.text();
        org.jsoup.nodes.Attributes attributes16 = textNode10.attributes();
        java.lang.String str17 = textNode10.text();
        java.lang.String str19 = textNode10.attr("#text");
        org.jsoup.nodes.Document document20 = textNode10.ownerDocument();
        boolean boolean22 = textNode10.hasAttr("hi!");
        java.lang.String str24 = textNode10.attr("");
        java.lang.String str25 = textNode10.nodeName();
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode29 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode31 = textNode29.text("hi!");
        org.jsoup.nodes.TextNode textNode33 = textNode31.text("hi!");
        java.lang.String str34 = textNode33.baseUri();
        int int35 = textNode33.childNodeSize();
        org.jsoup.nodes.TextNode textNode37 = textNode33.splitText(0);
        java.lang.String str39 = textNode37.absUrl("hi!");
        try {
            org.jsoup.nodes.Node node40 = textNode2.after((org.jsoup.nodes.Node) textNode37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "#text" + "'", str25.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.outerHtml();
        java.lang.String str6 = textNode2.text();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.getWholeText();
        org.jsoup.nodes.Node node13 = textNode2.nextSibling();
        java.lang.String str14 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        java.lang.String str20 = textNode17.nodeName();
        java.lang.String str21 = textNode17.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode17.childNodes();
        org.jsoup.nodes.TextNode textNode24 = textNode17.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode17.childNodesCopy();
        org.jsoup.nodes.TextNode textNode28 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean29 = textNode17.equals((java.lang.Object) textNode28);
        org.jsoup.nodes.TextNode textNode32 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode32.childNodesCopy();
        int int34 = textNode32.siblingIndex();
        org.jsoup.nodes.Node node36 = textNode32.removeAttr("#text");
        java.lang.String str37 = textNode32.getWholeText();
        java.lang.String str38 = textNode32.baseUri();
        boolean boolean39 = textNode28.equals((java.lang.Object) textNode32);
        org.jsoup.nodes.TextNode textNode42 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList43 = textNode42.childNodesCopy();
        int int44 = textNode42.siblingIndex();
        org.jsoup.nodes.Node node45 = textNode42.previousSibling();
        java.lang.String str46 = textNode42.nodeName();
        org.jsoup.nodes.Node node47 = textNode42.clone();
        org.jsoup.nodes.Document document48 = node47.ownerDocument();
        boolean boolean49 = textNode28.equals((java.lang.Object) node47);
        org.jsoup.nodes.TextNode textNode52 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList53 = textNode52.childNodesCopy();
        int int54 = textNode52.siblingIndex();
        java.lang.String str55 = textNode52.nodeName();
        java.lang.String str56 = textNode52.toString();
        java.lang.String str57 = textNode52.text();
        int int58 = textNode52.siblingIndex();
        org.jsoup.nodes.TextNode textNode61 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList62 = textNode61.childNodesCopy();
        int int63 = textNode61.siblingIndex();
        java.lang.String str64 = textNode61.nodeName();
        java.lang.String str65 = textNode61.toString();
        int int66 = textNode61.siblingIndex();
        boolean boolean67 = textNode52.equals((java.lang.Object) int66);
        org.jsoup.nodes.TextNode textNode69 = textNode52.text("");
        org.jsoup.nodes.Node node71 = textNode52.removeAttr("hi!");
        boolean boolean72 = textNode28.equals((java.lang.Object) node71);
        java.lang.String str74 = textNode28.attr("h");
        org.jsoup.nodes.Node node75 = textNode28.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList76 = textNode28.childNodes();
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "#text" + "'", str46.equals("#text"));
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(document48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(nodeList53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "#text" + "'", str55.equals("#text"));
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(nodeList62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "#text" + "'", str64.equals("#text"));
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!" + "'", str65.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(textNode69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(nodeList76);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("hi!");
        java.lang.String str13 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        boolean boolean8 = textNode2.isBlank();
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        java.lang.Class<?> wildcardClass10 = textNode2.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor11 = null;
        try {
            org.jsoup.nodes.Node node12 = textNode2.traverse(nodeVisitor11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        org.jsoup.nodes.Node node19 = textNode2.attr("hi!", "");
        boolean boolean20 = textNode2.isBlank();
        java.lang.String str21 = textNode2.text();
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode24.childNodesCopy();
        int int26 = textNode24.siblingIndex();
        java.lang.String str27 = textNode24.nodeName();
        java.lang.String str28 = textNode24.toString();
        java.lang.String str29 = textNode24.text();
        org.jsoup.nodes.Attributes attributes30 = textNode24.attributes();
        java.lang.String str31 = textNode24.text();
        java.lang.String str33 = textNode24.attr("#text");
        java.lang.String str35 = textNode24.absUrl("h");
        boolean boolean37 = textNode24.hasAttr("");
        org.jsoup.nodes.Node node38 = textNode24.nextSibling();
        org.jsoup.nodes.TextNode textNode41 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int42 = textNode41.siblingIndex();
        org.jsoup.nodes.Document document43 = textNode41.ownerDocument();
        textNode41.setBaseUri("#text");
        boolean boolean47 = textNode41.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.TextNode textNode49 = textNode41.text("hi!");
        boolean boolean50 = textNode24.equals((java.lang.Object) "hi!");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(textNode49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode9.childNodesCopy();
        int int11 = textNode9.siblingIndex();
        java.lang.String str12 = textNode9.nodeName();
        java.lang.String str13 = textNode9.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode9.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode9.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode9.childNodesCopy();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean21 = textNode9.equals((java.lang.Object) textNode20);
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode24.childNodesCopy();
        int int26 = textNode24.siblingIndex();
        org.jsoup.nodes.Node node28 = textNode24.removeAttr("#text");
        java.lang.String str29 = textNode24.getWholeText();
        java.lang.String str30 = textNode24.baseUri();
        boolean boolean31 = textNode20.equals((java.lang.Object) textNode24);
        java.lang.String str32 = textNode24.getWholeText();
        java.lang.String str33 = textNode24.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode24.childNodes();
        boolean boolean35 = textNode2.equals((java.lang.Object) textNode24);
        org.jsoup.nodes.Node node36 = textNode2.parent();
        java.lang.String str38 = textNode2.absUrl("h");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        java.lang.String str5 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.siblingNodes();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        boolean boolean8 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node10 = textNode2.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("i!");
        boolean boolean13 = textNode12.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode12.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodes();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.attr("hi!");
        java.lang.String str13 = textNode2.getWholeText();
        java.lang.String str14 = textNode2.toString();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("i!");
        java.lang.String str20 = textNode2.absUrl("hi!");
        textNode2.setBaseUri("#text");
        java.lang.String str23 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "i!");
        textNode2.setBaseUri("i!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList6 = document5.childNodesCopy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        int int11 = node10.siblingIndex();
        int int12 = node10.siblingIndex();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean17 = textNode15.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes18 = textNode15.attributes();
        java.lang.String str19 = textNode15.outerHtml();
        org.jsoup.nodes.Node node20 = textNode15.nextSibling();
        boolean boolean21 = textNode15.isBlank();
        org.jsoup.nodes.Document document22 = textNode15.ownerDocument();
        boolean boolean23 = node10.equals((java.lang.Object) textNode15);
        java.lang.String str24 = textNode15.getWholeText();
        org.jsoup.nodes.TextNode textNode27 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean29 = textNode27.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes30 = textNode27.attributes();
        java.lang.String str31 = textNode27.outerHtml();
        java.lang.Class<?> wildcardClass32 = textNode27.getClass();
        java.lang.String str33 = textNode27.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode27.siblingNodes();
        boolean boolean36 = textNode27.hasAttr("");
        org.jsoup.nodes.Node node37 = textNode27.clone();
        try {
            org.jsoup.nodes.Node node38 = textNode15.before(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText(0);
        org.jsoup.nodes.Document document14 = textNode2.ownerDocument();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(document14);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str16 = textNode14.toString();
        java.lang.String str17 = textNode14.baseUri();
        org.jsoup.nodes.Attributes attributes18 = textNode14.attributes();
        org.jsoup.nodes.Document document19 = textNode14.ownerDocument();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode14);
        java.lang.Class<?> wildcardClass21 = textNode14.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor22 = null;
        try {
            org.jsoup.nodes.Node node23 = textNode14.traverse(nodeVisitor22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        boolean boolean22 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int26 = textNode25.siblingIndex();
        java.lang.String str27 = textNode25.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode25.childNodes();
        boolean boolean29 = textNode2.equals((java.lang.Object) nodeList28);
        java.lang.String str31 = textNode2.absUrl("#text");
        java.lang.String str33 = textNode2.attr("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Attributes attributes19 = textNode2.attributes();
        java.lang.Class<?> wildcardClass20 = textNode2.getClass();
        org.jsoup.nodes.Node node23 = textNode2.attr("i!", "h");
        java.lang.String str24 = textNode2.getWholeText();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(attributes19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.getWholeText();
        java.lang.String str9 = textNode2.baseUri();
        try {
            org.jsoup.nodes.Node node10 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("i!");
        try {
            org.jsoup.nodes.TextNode textNode12 = textNode2.splitText((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Node node13 = textNode2.attr("#text", "");
        try {
            org.jsoup.nodes.Node node15 = node13.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node11 = textNode2.childNode((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean15 = textNode14.isBlank();
        java.lang.String str16 = textNode14.toString();
        java.lang.String str17 = textNode14.baseUri();
        org.jsoup.nodes.Attributes attributes18 = textNode14.attributes();
        org.jsoup.nodes.Document document19 = textNode14.ownerDocument();
        boolean boolean20 = textNode2.equals((java.lang.Object) textNode14);
        try {
            org.jsoup.nodes.Node node22 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode11.text("hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        java.lang.String str17 = textNode13.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode13.childNodesCopy();
        java.lang.Class<?> wildcardClass19 = textNode13.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode13.childNodesCopy();
        boolean boolean21 = textNode8.equals((java.lang.Object) nodeList20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        boolean boolean36 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Node node37 = textNode13.clone();
        java.lang.String str38 = node37.outerHtml();
        int int39 = node37.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        java.lang.String str8 = textNode2.attr("");
        int int9 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.absUrl("h");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.Node node14 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        java.lang.String str13 = textNode2.nodeName();
        java.lang.String str14 = textNode2.nodeName();
        org.jsoup.nodes.Node node17 = textNode2.attr("#text", "#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.nodes.Node node11 = textNode2.attr("#text", "#text");
        try {
            org.jsoup.nodes.Node node13 = textNode2.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        java.lang.String str8 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode10 = textNode2.splitText(0);
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        boolean boolean15 = textNode13.isBlank();
        java.lang.String str16 = textNode13.text();
        org.jsoup.nodes.Attributes attributes17 = textNode13.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode13.childNodes();
        java.lang.String str20 = textNode13.attr("");
        try {
            textNode10.replaceWith((org.jsoup.nodes.Node) textNode13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(attributes17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.toString();
        int int18 = textNode13.childNodeSize();
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode23 = textNode21.text("hi!");
        java.lang.String str24 = textNode21.outerHtml();
        org.jsoup.nodes.Node node27 = textNode21.attr("hi!", "#text");
        org.jsoup.nodes.Node node28 = textNode21.clone();
        boolean boolean29 = textNode13.equals((java.lang.Object) textNode21);
        boolean boolean30 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.Class<?> wildcardClass31 = textNode13.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList32 = textNode13.childNodes();
        java.lang.Class<?> wildcardClass33 = nodeList32.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(nodeList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode37.childNodesCopy();
        int int39 = textNode37.siblingIndex();
        java.lang.String str40 = textNode37.nodeName();
        java.lang.String str41 = textNode37.toString();
        java.lang.String str42 = textNode37.text();
        int int43 = textNode37.siblingIndex();
        org.jsoup.nodes.TextNode textNode46 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode46.childNodesCopy();
        int int48 = textNode46.siblingIndex();
        java.lang.String str49 = textNode46.nodeName();
        java.lang.String str50 = textNode46.toString();
        int int51 = textNode46.siblingIndex();
        boolean boolean52 = textNode37.equals((java.lang.Object) int51);
        org.jsoup.nodes.TextNode textNode54 = textNode37.text("");
        org.jsoup.nodes.Node node56 = textNode37.removeAttr("hi!");
        boolean boolean57 = textNode13.equals((java.lang.Object) node56);
        java.lang.String str59 = textNode13.attr("h");
        java.lang.String str60 = textNode13.outerHtml();
        org.jsoup.nodes.Node node61 = textNode13.nextSibling();
        boolean boolean62 = textNode13.isBlank();
        textNode13.setBaseUri("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "#text" + "'", str40.equals("#text"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "#text" + "'", str49.equals("#text"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(textNode54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.lang.String str9 = textNode2.baseUri();
        java.lang.String str11 = textNode2.attr("");
        int int12 = textNode2.siblingIndex();
        java.lang.String str14 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("#text");
        boolean boolean18 = textNode16.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str22 = textNode21.baseUri();
        boolean boolean24 = textNode21.hasAttr("hi!");
        int int25 = textNode21.siblingIndex();
        try {
            textNode16.replaceWith((org.jsoup.nodes.Node) textNode21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode7 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str8 = textNode7.baseUri();
        java.lang.String str9 = textNode7.baseUri();
        boolean boolean10 = textNode2.equals((java.lang.Object) textNode7);
        java.lang.String str12 = textNode7.absUrl("i!");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        org.jsoup.nodes.Node node19 = textNode15.removeAttr("#text");
        java.lang.String str20 = textNode15.getWholeText();
        java.lang.String str21 = textNode15.baseUri();
        java.lang.String str22 = textNode15.baseUri();
        java.lang.String str23 = textNode15.getWholeText();
        boolean boolean24 = textNode7.equals((java.lang.Object) str23);
        java.lang.String str25 = textNode7.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        int int9 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str18 = textNode13.attr("");
        org.jsoup.nodes.Node node19 = textNode13.previousSibling();
        org.jsoup.nodes.TextNode textNode21 = textNode13.text("hi!");
        org.jsoup.nodes.Attributes attributes22 = textNode13.attributes();
        org.jsoup.nodes.TextNode textNode25 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node27 = textNode25.removeAttr("hi!");
        org.jsoup.nodes.Node node28 = node27.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = node27.siblingNodes();
        boolean boolean30 = textNode13.equals((java.lang.Object) nodeList29);
        boolean boolean31 = textNode2.equals((java.lang.Object) boolean30);
        org.jsoup.nodes.Node node33 = textNode2.removeAttr("hi!");
        try {
            node33.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(attributes22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str8 = textNode2.attr("i!");
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node14 = textNode13.nextSibling();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        java.lang.String str20 = textNode17.nodeName();
        java.lang.String str21 = textNode17.toString();
        int int22 = textNode17.childNodeSize();
        org.jsoup.nodes.TextNode textNode25 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode27 = textNode25.text("hi!");
        java.lang.String str28 = textNode25.outerHtml();
        org.jsoup.nodes.Node node31 = textNode25.attr("hi!", "#text");
        org.jsoup.nodes.Node node32 = textNode25.clone();
        boolean boolean33 = textNode17.equals((java.lang.Object) textNode25);
        org.jsoup.nodes.TextNode textNode35 = textNode17.text("");
        org.jsoup.nodes.TextNode textNode37 = textNode17.text("h");
        org.jsoup.nodes.TextNode textNode39 = textNode17.text("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList40 = textNode17.childNodes();
        boolean boolean41 = textNode13.equals((java.lang.Object) textNode17);
        textNode17.setBaseUri("h");
        try {
            node10.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(textNode35);
        org.junit.Assert.assertNotNull(textNode37);
        org.junit.Assert.assertNotNull(textNode39);
        org.junit.Assert.assertNotNull(nodeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.childNodesCopy();
        org.jsoup.nodes.Attributes attributes9 = textNode7.attributes();
        java.lang.String str10 = textNode7.toString();
        boolean boolean11 = textNode2.equals((java.lang.Object) str10);
        java.lang.String str13 = textNode2.absUrl("hi!");
        java.lang.String str14 = textNode2.baseUri();
        java.lang.String str15 = textNode2.text();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        org.jsoup.select.NodeVisitor nodeVisitor8 = null;
        try {
            org.jsoup.nodes.Node node9 = node7.traverse(nodeVisitor8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode37.childNodesCopy();
        int int39 = textNode37.siblingIndex();
        java.lang.String str40 = textNode37.nodeName();
        java.lang.String str41 = textNode37.toString();
        java.lang.String str42 = textNode37.text();
        int int43 = textNode37.siblingIndex();
        org.jsoup.nodes.TextNode textNode46 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode46.childNodesCopy();
        int int48 = textNode46.siblingIndex();
        java.lang.String str49 = textNode46.nodeName();
        java.lang.String str50 = textNode46.toString();
        int int51 = textNode46.siblingIndex();
        boolean boolean52 = textNode37.equals((java.lang.Object) int51);
        org.jsoup.nodes.TextNode textNode54 = textNode37.text("");
        org.jsoup.nodes.Node node56 = textNode37.removeAttr("hi!");
        boolean boolean57 = textNode13.equals((java.lang.Object) node56);
        node56.setBaseUri("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "#text" + "'", str40.equals("#text"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "#text" + "'", str49.equals("#text"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(textNode54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        org.jsoup.nodes.Node node7 = textNode6.previousSibling();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("i!", "h");
        int int13 = textNode12.siblingIndex();
        org.jsoup.nodes.Node node15 = textNode12.removeAttr("h");
        org.jsoup.nodes.TextNode textNode17 = textNode12.text("#text");
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode12);
        org.jsoup.nodes.TextNode textNode20 = textNode12.text("i!");
        try {
            org.jsoup.nodes.Node node22 = textNode12.after("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.childNodeSize();
        org.jsoup.nodes.TextNode textNode19 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode21 = textNode19.text("hi!");
        java.lang.String str22 = textNode19.outerHtml();
        org.jsoup.nodes.Node node25 = textNode19.attr("hi!", "#text");
        org.jsoup.nodes.Node node26 = textNode19.clone();
        boolean boolean27 = textNode11.equals((java.lang.Object) textNode19);
        org.jsoup.nodes.TextNode textNode29 = textNode11.text("");
        org.jsoup.nodes.TextNode textNode31 = textNode11.text("h");
        org.jsoup.nodes.Node node33 = textNode31.removeAttr("#text");
        try {
            org.jsoup.nodes.Node node34 = node8.after(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNotNull(node33);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str12 = textNode9.absUrl("#text");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("");
        java.lang.String str14 = textNode2.baseUri();
        java.lang.String str16 = textNode2.attr("hi!");
        java.lang.Class<?> wildcardClass17 = textNode2.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        boolean boolean13 = textNode2.hasAttr("i!");
        java.lang.String str14 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        boolean boolean36 = textNode13.hasAttr("hi!");
        org.jsoup.nodes.Node node37 = textNode13.clone();
        boolean boolean38 = textNode13.isBlank();
        org.jsoup.nodes.Attributes attributes39 = textNode13.attributes();
        java.lang.String str40 = textNode13.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(attributes39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "#text" + "'", str40.equals("#text"));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        java.util.List<org.jsoup.nodes.Node> nodeList4 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("#text");
        try {
            org.jsoup.nodes.Node node7 = textNode6.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(nodeList4);
        org.junit.Assert.assertNotNull(textNode6);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        boolean boolean15 = textNode14.isBlank();
        try {
            org.jsoup.nodes.TextNode textNode17 = textNode14.splitText((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        node11.setBaseUri("h");
        org.jsoup.nodes.Node node14 = node11.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = node11.siblingNodes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.getWholeText();
        org.jsoup.nodes.Attributes attributes14 = textNode2.attributes();
        boolean boolean15 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertNotNull(attributes14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("#text");
        java.lang.String str13 = textNode2.absUrl("h");
        int int14 = textNode2.childNodeSize();
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        int int20 = textNode18.siblingIndex();
        java.lang.String str21 = textNode18.nodeName();
        java.lang.String str22 = textNode18.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode18.childNodes();
        org.jsoup.nodes.TextNode textNode25 = textNode18.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode18.childNodesCopy();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean30 = textNode18.equals((java.lang.Object) textNode29);
        org.jsoup.nodes.TextNode textNode33 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList34 = textNode33.childNodesCopy();
        int int35 = textNode33.siblingIndex();
        org.jsoup.nodes.Node node37 = textNode33.removeAttr("#text");
        java.lang.String str38 = textNode33.getWholeText();
        java.lang.String str39 = textNode33.baseUri();
        boolean boolean40 = textNode29.equals((java.lang.Object) textNode33);
        java.lang.String str41 = textNode33.getWholeText();
        java.lang.String str42 = textNode33.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList43 = textNode33.childNodes();
        boolean boolean45 = textNode33.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList46 = textNode33.childNodesCopy();
        java.lang.Class<?> wildcardClass47 = textNode33.getClass();
        org.jsoup.nodes.Attributes attributes48 = textNode33.attributes();
        org.jsoup.nodes.Attributes attributes49 = textNode33.attributes();
        java.lang.String str50 = textNode33.text();
        try {
            org.jsoup.nodes.Node node51 = textNode2.before((org.jsoup.nodes.Node) textNode33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "#text" + "'", str21.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertNotNull(textNode25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(nodeList46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(attributes48);
        org.junit.Assert.assertNotNull(attributes49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode5.isBlank();
        org.jsoup.nodes.Node node7 = textNode5.nextSibling();
        org.jsoup.nodes.Node node8 = textNode5.nextSibling();
        try {
            node8.setBaseUri("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        boolean boolean6 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode9 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str10 = textNode9.baseUri();
        java.lang.String str11 = textNode9.baseUri();
        java.lang.Object obj12 = null;
        boolean boolean13 = textNode9.equals(obj12);
        java.lang.String str15 = textNode9.attr("");
        int int16 = textNode9.siblingIndex();
        java.lang.String str18 = textNode9.absUrl("h");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode9.baseUri();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int17 = textNode16.siblingIndex();
        org.jsoup.nodes.Document document18 = textNode16.ownerDocument();
        int int19 = textNode16.childNodeSize();
        org.jsoup.nodes.Node node20 = textNode16.previousSibling();
        boolean boolean21 = textNode9.equals((java.lang.Object) node20);
        org.jsoup.nodes.TextNode textNode24 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode24.childNodesCopy();
        int int26 = textNode24.siblingIndex();
        java.lang.String str27 = textNode24.nodeName();
        java.lang.String str28 = textNode24.toString();
        java.lang.String str29 = textNode24.toString();
        boolean boolean31 = textNode24.hasAttr("hi!");
        java.lang.String str32 = textNode24.baseUri();
        try {
            org.jsoup.nodes.Node node33 = textNode9.before((org.jsoup.nodes.Node) textNode24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(document18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node8 = node7.previousSibling();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document17 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(document17);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        boolean boolean16 = textNode2.equals((java.lang.Object) nodeList15);
        java.lang.String str17 = textNode2.toString();
        java.lang.String str18 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.toString();
        int int18 = textNode13.childNodeSize();
        org.jsoup.nodes.TextNode textNode21 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode23 = textNode21.text("hi!");
        java.lang.String str24 = textNode21.outerHtml();
        org.jsoup.nodes.Node node27 = textNode21.attr("hi!", "#text");
        org.jsoup.nodes.Node node28 = textNode21.clone();
        boolean boolean29 = textNode13.equals((java.lang.Object) textNode21);
        boolean boolean30 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.Class<?> wildcardClass31 = textNode13.getClass();
        try {
            org.jsoup.nodes.Node node33 = textNode13.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(textNode21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        boolean boolean12 = textNode2.hasAttr("i!");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        java.lang.String str20 = textNode15.text();
        org.jsoup.nodes.Attributes attributes21 = textNode15.attributes();
        java.lang.String str22 = textNode15.text();
        java.lang.String str24 = textNode15.attr("#text");
        org.jsoup.nodes.Document document25 = textNode15.ownerDocument();
        boolean boolean27 = textNode15.hasAttr("#text");
        java.lang.String str28 = textNode15.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList29 = textNode15.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode15.childNodes();
        try {
            org.jsoup.nodes.Node node31 = textNode2.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNull(document25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList29);
        org.junit.Assert.assertNotNull(nodeList30);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        java.lang.String str10 = textNode2.nodeName();
        java.lang.String str11 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str15 = textNode14.text();
        textNode14.setBaseUri("");
        int int18 = textNode14.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode14.childNodes();
        try {
            org.jsoup.nodes.Node node20 = textNode2.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "#text" + "'", str10.equals("#text"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = textNode2.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodes();
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(nodeList11);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode17.childNodes();
        boolean boolean29 = textNode17.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList30 = textNode17.childNodesCopy();
        java.lang.Class<?> wildcardClass31 = textNode17.getClass();
        org.jsoup.nodes.Node node32 = textNode17.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList33 = textNode17.childNodes();
        org.jsoup.nodes.Node node35 = textNode17.removeAttr("i!");
        org.jsoup.nodes.Node node36 = node35.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList37 = node35.childNodesCopy();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(nodeList33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(nodeList37);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.Node node7 = textNode2.attr("h", "hi!");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean12 = textNode10.hasAttr("hi!");
        java.lang.String str14 = textNode10.absUrl("#text");
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode18 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node19 = textNode18.parent();
        java.lang.Class<?> wildcardClass20 = textNode18.getClass();
        java.lang.String str21 = textNode18.outerHtml();
        boolean boolean22 = textNode2.equals((java.lang.Object) str21);
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        java.lang.String str20 = textNode19.outerHtml();
        try {
            org.jsoup.nodes.Node node22 = textNode19.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        boolean boolean14 = textNode2.hasAttr("#text");
        textNode2.setBaseUri("h");
        java.lang.String str17 = textNode2.getWholeText();
        try {
            org.jsoup.nodes.Node node19 = textNode2.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode2.hasAttr("#text");
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str14 = textNode2.attr("i!");
        org.jsoup.nodes.Attributes attributes15 = textNode2.attributes();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(attributes15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("i!");
        java.lang.String str18 = textNode2.absUrl("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        java.lang.String str4 = textNode2.baseUri();
        java.lang.Object obj5 = null;
        boolean boolean6 = textNode2.equals(obj5);
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        int int8 = textNode2.siblingIndex();
        try {
            java.lang.String str10 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        int int13 = textNode2.childNodeSize();
        boolean boolean15 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("hi!");
        boolean boolean19 = textNode2.hasAttr("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int13 = textNode12.siblingIndex();
        java.lang.String str14 = textNode12.text();
        boolean boolean15 = textNode12.isBlank();
        org.jsoup.nodes.Node node18 = textNode12.attr("#text", "h");
        try {
            boolean boolean19 = node9.equals((java.lang.Object) "#text");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node9 = textNode2.after("h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(nodeList7);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 1);
        textNode2.setBaseUri("h");
        org.jsoup.nodes.Node node16 = textNode2.nextSibling();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("i!");
        java.lang.String str20 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node22 = textNode2.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "i!" + "'", str20.equals("i!"));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean3 = textNode2.isBlank();
        textNode2.setBaseUri("h");
        java.lang.String str6 = textNode2.nodeName();
        int int7 = textNode2.childNodeSize();
        try {
            org.jsoup.nodes.Node node8 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.Node node11 = textNode2.removeAttr("#text");
        java.lang.String str12 = node11.outerHtml();
        int int13 = node11.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = node11.childNodes();
        org.jsoup.nodes.Node node15 = node11.previousSibling();
        org.jsoup.nodes.TextNode textNode18 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode18.childNodesCopy();
        org.jsoup.nodes.Attributes attributes20 = textNode18.attributes();
        org.jsoup.nodes.Attributes attributes21 = textNode18.attributes();
        int int22 = textNode18.siblingIndex();
        java.lang.String str23 = textNode18.baseUri();
        textNode18.setBaseUri("h");
        org.jsoup.nodes.Node node27 = textNode18.removeAttr("i!");
        boolean boolean28 = node11.equals((java.lang.Object) node27);
        try {
            org.jsoup.nodes.Node node30 = node11.childNode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.TextNode textNode17 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean19 = textNode17.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode17.childNodes();
        java.lang.String str21 = textNode17.outerHtml();
        boolean boolean22 = textNode2.equals((java.lang.Object) str21);
        java.lang.String str23 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        java.lang.String str4 = textNode2.text();
        org.jsoup.nodes.TextNode textNode6 = textNode2.text("hi!");
        textNode2.setBaseUri("");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        boolean boolean11 = textNode2.isBlank();
        org.jsoup.nodes.Node node12 = textNode2.parent();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode18 = textNode16.text("hi!");
        java.lang.String str19 = textNode16.outerHtml();
        org.jsoup.nodes.Node node22 = textNode16.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes23 = textNode16.attributes();
        org.jsoup.nodes.Node node24 = textNode16.clone();
        java.lang.Class<?> wildcardClass25 = textNode16.getClass();
        boolean boolean26 = textNode2.equals((java.lang.Object) textNode16);
        int int27 = textNode16.siblingIndex();
        boolean boolean29 = textNode16.hasAttr("#text");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        boolean boolean10 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node12 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.nodeName();
        boolean boolean12 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node14 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str11 = textNode2.outerHtml();
        java.lang.String str13 = textNode2.attr("h");
        java.lang.String str14 = textNode2.outerHtml();
        int int15 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean9 = textNode7.hasAttr("i!");
        int int10 = textNode7.siblingIndex();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.nodes.Node node12 = null;
        try {
            org.jsoup.nodes.Node node13 = textNode2.after(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode7 = textNode2.text("i!");
        boolean boolean9 = textNode7.hasAttr("h");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str13 = textNode12.getWholeText();
        org.jsoup.nodes.TextNode textNode16 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean17 = textNode12.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node18 = textNode12.parent();
        java.lang.String str19 = textNode12.toString();
        boolean boolean20 = textNode7.equals((java.lang.Object) str19);
        org.jsoup.nodes.Node node23 = textNode7.attr("hi!", "");
        boolean boolean24 = textNode7.isBlank();
        org.jsoup.select.NodeVisitor nodeVisitor25 = null;
        try {
            org.jsoup.nodes.Node node26 = textNode7.traverse(nodeVisitor25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.Node node6 = textNode4.childNode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        int int5 = textNode4.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode4.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode7.siblingNodes();
        java.lang.Class<?> wildcardClass9 = textNode7.getClass();
        int int10 = textNode7.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.attr("");
        org.jsoup.nodes.Node node12 = textNode2.parent();
        java.lang.String str14 = textNode2.absUrl("hi!");
        java.lang.String str15 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes4 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertNotNull(attributes4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertNotNull(attributes6);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        try {
            int int10 = document9.siblingIndex();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("i!", "hi!");
        try {
            org.jsoup.nodes.Node node4 = textNode2.after("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        org.jsoup.nodes.Node node9 = textNode2.previousSibling();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        boolean boolean12 = textNode2.hasAttr("i!");
        java.lang.String str14 = textNode2.attr("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.attr("hi!");
        java.lang.String str14 = textNode2.attr("#text");
        java.lang.String str16 = textNode2.absUrl("#text");
        int int17 = textNode2.siblingIndex();
        try {
            org.jsoup.nodes.TextNode textNode19 = textNode2.splitText((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "#text");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        textNode2.setBaseUri("hi!");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        boolean boolean9 = textNode2.isBlank();
        org.jsoup.nodes.Node node12 = textNode2.attr("h", "");
        org.jsoup.nodes.Node node13 = node12.parent();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node5 = textNode2.previousSibling();
        java.lang.String str6 = textNode2.nodeName();
        org.jsoup.nodes.Node node7 = textNode2.clone();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("h");
        org.jsoup.nodes.Attributes attributes11 = textNode10.attributes();
        try {
            org.jsoup.nodes.Node node13 = textNode10.removeAttr("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(attributes11);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        try {
            org.jsoup.nodes.Node node10 = textNode9.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        org.jsoup.nodes.Node node16 = textNode2.attr("#text", "i!");
        java.lang.String str18 = textNode2.attr("#text");
        java.lang.String str20 = textNode2.absUrl("#text");
        int int21 = textNode2.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "i!" + "'", str18.equals("i!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) 0);
        java.lang.String str15 = textNode2.toString();
        int int16 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass17 = textNode2.getClass();
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(attributes18);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        boolean boolean6 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node9 = textNode2.nextSibling();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.lang.String str12 = node11.baseUri();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("h", "#text");
        java.lang.String str16 = textNode15.getWholeText();
        org.jsoup.nodes.Node node17 = textNode15.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode15.siblingNodes();
        java.lang.String str19 = textNode15.text();
        org.jsoup.nodes.Node node20 = textNode15.clone();
        org.jsoup.nodes.Node node21 = textNode15.clone();
        try {
            node11.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "h" + "'", str16.equals("h"));
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "h" + "'", str19.equals("h"));
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.TextNode textNode5 = textNode2.splitText((int) (byte) 1);
        java.lang.String str7 = textNode2.attr("hi!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.Node node8 = textNode6.removeAttr("#text");
        org.jsoup.nodes.Node node11 = textNode6.attr("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "hi!");
        java.lang.String str4 = textNode2.attr("h");
        java.lang.String str5 = textNode2.nodeName();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node7 = textNode2.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        int int6 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode11.childNodes();
        org.jsoup.nodes.TextNode textNode18 = textNode11.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode11.childNodesCopy();
        java.lang.String str20 = textNode11.getWholeText();
        java.lang.String str22 = textNode11.absUrl("#text");
        org.jsoup.nodes.Node node23 = textNode11.previousSibling();
        try {
            org.jsoup.nodes.Node node24 = node8.before(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(textNode18);
        org.junit.Assert.assertNotNull(nodeList19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "#text" + "'", str20.equals("#text"));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode17.childNodes();
        boolean boolean29 = textNode17.hasAttr("hi!");
        org.jsoup.nodes.Node node32 = textNode17.attr("#text", "#text");
        int int33 = textNode17.siblingIndex();
        int int34 = textNode17.siblingIndex();
        java.lang.String str36 = textNode17.absUrl("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "" + "'", str36.equals(""));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        java.lang.String str22 = textNode2.attr("#text");
        int int23 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node24 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList25 = textNode2.childNodes();
        org.jsoup.select.NodeVisitor nodeVisitor26 = null;
        try {
            org.jsoup.nodes.Node node27 = textNode2.traverse(nodeVisitor26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(nodeList25);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        int int9 = textNode2.siblingIndex();
        java.lang.String str11 = textNode2.absUrl("hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node4 = textNode2.removeAttr("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList6 = textNode2.childNodesCopy();
        java.lang.String str7 = textNode2.getWholeText();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node12 = textNode11.parent();
        java.lang.Class<?> wildcardClass13 = textNode11.getClass();
        java.lang.String str14 = textNode11.outerHtml();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode11);
        java.lang.Class<?> wildcardClass16 = textNode11.getClass();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode6.toString();
        java.lang.String str14 = textNode6.toString();
        java.lang.String str15 = textNode6.toString();
        org.jsoup.nodes.Node node16 = textNode6.nextSibling();
        java.lang.String str17 = textNode6.outerHtml();
        java.lang.String str18 = textNode6.nodeName();
        org.jsoup.nodes.Node node21 = textNode6.attr("hi!", "hi!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "i!" + "'", str14.equals("i!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "i!" + "'", str15.equals("i!"));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "i!" + "'", str17.equals("i!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("h", "i!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText(0);
        try {
            org.jsoup.nodes.TextNode textNode6 = textNode2.splitText((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode4);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        textNode2.setBaseUri("i!");
        int int11 = textNode2.siblingIndex();
        boolean boolean13 = textNode2.hasAttr("h");
        java.lang.String str14 = textNode2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        java.lang.String str22 = textNode2.attr("#text");
        int int23 = textNode2.siblingIndex();
        int int24 = textNode2.childNodeSize();
        java.lang.String str25 = textNode2.outerHtml();
        try {
            java.lang.String str27 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode8 = textNode2.text("h");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        int int10 = textNode2.childNodeSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(textNode8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("hi!");
        textNode2.setBaseUri("i!");
        try {
            org.jsoup.nodes.Node node8 = textNode2.childNode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("hi!");
        try {
            org.jsoup.nodes.Node node13 = textNode10.attr("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(textNode10);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        java.lang.String str4 = textNode2.text();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        try {
            int int7 = node6.childNodeSize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        org.jsoup.nodes.Attributes attributes11 = textNode2.attributes();
        java.lang.String str12 = textNode2.text();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.siblingIndex();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        org.jsoup.nodes.TextNode textNode11 = textNode2.text("");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodes();
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.nodeName();
        org.jsoup.nodes.Document document10 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("#text");
        java.lang.String str14 = textNode2.attr("");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "#text" + "'", str9.equals("#text"));
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        java.lang.String str6 = textNode2.nodeName();
        java.lang.String str8 = textNode2.attr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.Node node10 = textNode2.previousSibling();
        java.lang.String str11 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.Node node13 = textNode2.childNode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        int int19 = textNode2.childNodeSize();
        org.jsoup.nodes.Document document20 = textNode2.ownerDocument();
        boolean boolean21 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("#text", "");
        org.jsoup.nodes.Node node3 = textNode2.nextSibling();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        int int8 = textNode2.childNodeSize();
        java.lang.String str9 = textNode2.outerHtml();
        java.lang.String str11 = textNode2.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        java.lang.String str11 = textNode2.getWholeText();
        try {
            org.jsoup.nodes.Node node13 = textNode2.before("#text");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("h", "h");
        try {
            org.jsoup.nodes.Node node4 = textNode2.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.outerHtml();
        textNode2.setBaseUri("hi!");
        try {
            org.jsoup.nodes.Node node7 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str4 = textNode2.attr("#text");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        boolean boolean6 = textNode2.isBlank();
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("h");
        org.jsoup.nodes.TextNode textNode12 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str13 = textNode12.text();
        org.jsoup.nodes.TextNode textNode15 = textNode12.splitText((int) (byte) 1);
        boolean boolean16 = textNode15.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode15.childNodesCopy();
        boolean boolean18 = textNode15.isBlank();
        java.lang.String str20 = textNode15.attr("i!");
        org.jsoup.nodes.Node node21 = textNode15.parent();
        try {
            textNode9.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean10 = textNode2.hasAttr("#text");
        org.jsoup.nodes.Node node11 = textNode2.clone();
        boolean boolean12 = textNode2.isBlank();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("hi!");
        org.jsoup.nodes.Document document10 = textNode9.ownerDocument();
        java.lang.String str12 = textNode9.attr("");
        java.lang.String str13 = textNode9.baseUri();
        textNode9.setBaseUri("h");
        try {
            org.jsoup.nodes.Node node17 = textNode9.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(document10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        int int8 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("i!", "i!");
        boolean boolean13 = textNode11.hasAttr("h");
        java.lang.String str14 = textNode11.getWholeText();
        boolean boolean15 = textNode2.equals((java.lang.Object) str14);
        java.lang.String str17 = textNode2.attr("#text");
        org.jsoup.nodes.Node node19 = textNode2.removeAttr("h");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "i!" + "'", str14.equals("i!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node10 = textNode2.nextSibling();
        try {
            org.jsoup.nodes.Node node12 = textNode2.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode2.childNodes();
        org.jsoup.nodes.Node node19 = textNode2.parent();
        java.lang.String str20 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList24 = textNode23.childNodesCopy();
        int int25 = textNode23.siblingIndex();
        java.lang.String str26 = textNode23.nodeName();
        java.lang.String str27 = textNode23.toString();
        int int28 = textNode23.siblingIndex();
        java.lang.String str29 = textNode23.nodeName();
        org.jsoup.nodes.TextNode textNode31 = textNode23.splitText(0);
        org.jsoup.nodes.TextNode textNode33 = textNode23.text("h");
        boolean boolean34 = textNode2.equals((java.lang.Object) textNode33);
        try {
            org.jsoup.nodes.Node node36 = textNode2.before("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "#text" + "'", str26.equals("#text"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "#text" + "'", str29.equals("#text"));
        org.junit.Assert.assertNotNull(textNode31);
        org.junit.Assert.assertNotNull(textNode33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.text("");
        org.jsoup.nodes.TextNode textNode22 = textNode2.text("h");
        java.lang.String str23 = textNode2.getWholeText();
        org.jsoup.nodes.Node node24 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "h" + "'", str23.equals("h"));
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        java.lang.String str22 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode2.siblingNodes();
        try {
            org.jsoup.nodes.Node node25 = textNode2.childNode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertNotNull(nodeList23);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        textNode17.setBaseUri("#text");
        textNode17.setBaseUri("i!");
        org.jsoup.nodes.Node node31 = textNode17.clone();
        java.lang.Class<?> wildcardClass32 = node31.getClass();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.lang.Class<?> wildcardClass9 = textNode2.getClass();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.TextNode textNode13 = textNode2.splitText((int) (byte) 0);
        boolean boolean14 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int18 = textNode17.siblingIndex();
        java.lang.String str19 = textNode17.outerHtml();
        org.jsoup.nodes.Document document20 = textNode17.ownerDocument();
        java.lang.String str21 = textNode17.text();
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode17.childNodes();
        try {
            org.jsoup.nodes.Node node23 = textNode2.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList22);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean4 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass5 = textNode2.getClass();
        int int6 = textNode2.childNodeSize();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("hi!");
        boolean boolean11 = textNode2.isBlank();
        boolean boolean12 = textNode2.isBlank();
        boolean boolean13 = textNode2.isBlank();
        java.lang.String str14 = textNode2.getWholeText();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        org.jsoup.nodes.Document document8 = textNode2.ownerDocument();
        java.lang.String str9 = textNode2.text();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode12.childNodesCopy();
        int int14 = textNode12.siblingIndex();
        java.lang.String str15 = textNode12.nodeName();
        java.lang.String str16 = textNode12.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode12.childNodes();
        org.jsoup.nodes.TextNode textNode19 = textNode12.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList20 = textNode12.childNodesCopy();
        org.jsoup.nodes.TextNode textNode23 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean24 = textNode12.equals((java.lang.Object) textNode23);
        java.lang.String str26 = textNode12.attr("");
        java.lang.String str28 = textNode12.attr("");
        java.lang.String str30 = textNode12.attr("");
        java.lang.String str31 = textNode12.nodeName();
        try {
            org.jsoup.nodes.Node node32 = textNode2.after((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNull(document8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "#text" + "'", str15.equals("#text"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(nodeList20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (byte) 0);
        java.lang.String str12 = textNode11.toString();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str20 = textNode15.attr("");
        org.jsoup.nodes.Node node21 = textNode15.previousSibling();
        org.jsoup.nodes.TextNode textNode23 = textNode15.text("hi!");
        org.jsoup.nodes.Node node24 = textNode23.parent();
        java.lang.String str26 = textNode23.attr("h");
        try {
            org.jsoup.nodes.Node node27 = textNode11.before((org.jsoup.nodes.Node) textNode23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(textNode23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "i!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.clone();
        java.lang.String str6 = textNode2.outerHtml();
        try {
            org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        boolean boolean9 = textNode2.hasAttr("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.TextNode textNode20 = textNode2.splitText((int) (short) 1);
        org.jsoup.nodes.Document document21 = textNode20.ownerDocument();
        java.lang.String str22 = textNode20.toString();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(textNode20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "i!" + "'", str22.equals("i!"));
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        org.jsoup.nodes.Node node3 = textNode2.parent();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean9 = textNode7.hasAttr("i!");
        int int10 = textNode7.siblingIndex();
        boolean boolean11 = textNode2.equals((java.lang.Object) textNode7);
        org.jsoup.nodes.TextNode textNode14 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode14.childNodesCopy();
        int int16 = textNode14.siblingIndex();
        java.lang.String str17 = textNode14.nodeName();
        java.lang.String str18 = textNode14.toString();
        int int19 = textNode14.childNodeSize();
        org.jsoup.nodes.TextNode textNode22 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode24 = textNode22.text("hi!");
        java.lang.String str25 = textNode22.outerHtml();
        org.jsoup.nodes.Node node28 = textNode22.attr("hi!", "#text");
        org.jsoup.nodes.Node node29 = textNode22.clone();
        boolean boolean30 = textNode14.equals((java.lang.Object) textNode22);
        org.jsoup.nodes.TextNode textNode32 = textNode14.text("");
        org.jsoup.nodes.TextNode textNode34 = textNode14.text("h");
        java.lang.String str35 = textNode14.getWholeText();
        java.lang.String str36 = textNode14.toString();
        java.lang.Class<?> wildcardClass37 = textNode14.getClass();
        java.lang.String str38 = textNode14.nodeName();
        textNode14.setBaseUri("");
        try {
            org.jsoup.nodes.Node node41 = textNode2.after((org.jsoup.nodes.Node) textNode14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(textNode22);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(textNode32);
        org.junit.Assert.assertNotNull(textNode34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "h" + "'", str35.equals("h"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "h" + "'", str36.equals("h"));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "#text" + "'", str38.equals("#text"));
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("i!");
        org.jsoup.nodes.Node node10 = textNode2.attr("i!", "h");
        java.lang.Class<?> wildcardClass11 = node10.getClass();
        node10.setBaseUri("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.lang.String str9 = node8.baseUri();
        org.jsoup.nodes.TextNode textNode12 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        boolean boolean13 = textNode12.isBlank();
        textNode12.setBaseUri("h");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode12.childNodes();
        java.lang.String str17 = textNode12.baseUri();
        try {
            node8.replaceWith((org.jsoup.nodes.Node) textNode12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "h" + "'", str17.equals("h"));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        boolean boolean4 = textNode2.hasAttr("i!");
        int int5 = textNode2.siblingIndex();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.parent();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "#text" + "'", str6.equals("#text"));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes10 = textNode2.attributes();
        org.jsoup.nodes.TextNode textNode13 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode15 = textNode13.text("hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode15.text("hi!");
        java.lang.String str18 = textNode17.baseUri();
        textNode17.setBaseUri("");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        java.lang.String str7 = textNode2.absUrl("hi!");
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        boolean boolean12 = textNode10.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode10.siblingNodes();
        org.jsoup.nodes.TextNode textNode16 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        java.lang.String str18 = textNode16.attr("#text");
        org.jsoup.nodes.TextNode textNode21 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList22 = textNode21.childNodesCopy();
        int int23 = textNode21.siblingIndex();
        java.lang.String str24 = textNode21.nodeName();
        java.lang.String str26 = textNode21.attr("");
        java.lang.String str27 = textNode21.text();
        org.jsoup.nodes.Node node29 = textNode21.removeAttr("hi!");
        org.jsoup.nodes.Attributes attributes30 = textNode21.attributes();
        org.jsoup.nodes.Node node32 = textNode21.removeAttr("i!");
        boolean boolean33 = textNode16.equals((java.lang.Object) "i!");
        boolean boolean34 = textNode10.equals((java.lang.Object) "i!");
        try {
            textNode2.replaceWith((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertNotNull(nodeList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "#text" + "'", str24.equals("#text"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(attributes30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        boolean boolean11 = textNode2.equals((java.lang.Object) (short) 0);
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.jsoup.nodes.Attributes attributes13 = textNode2.attributes();
        org.jsoup.nodes.Node node14 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node16 = node14.before("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNotNull(attributes13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 0);
        try {
            textNode8.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        boolean boolean36 = textNode13.hasAttr("hi!");
        try {
            org.jsoup.nodes.Node node38 = textNode13.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        boolean boolean8 = textNode2.isBlank();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.equals((java.lang.Object) "");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode9.childNodesCopy();
        java.lang.String str14 = textNode9.attr("h");
        org.jsoup.nodes.Node node16 = textNode9.removeAttr("h");
        boolean boolean18 = textNode9.hasAttr("#text");
        org.jsoup.nodes.Node node21 = textNode9.attr("#text", "#text");
        org.jsoup.nodes.Node node22 = node21.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        java.lang.String str6 = textNode2.text();
        org.jsoup.nodes.Node node7 = textNode2.previousSibling();
        java.lang.String str8 = textNode2.getWholeText();
        boolean boolean10 = textNode2.hasAttr("i!");
        boolean boolean12 = textNode2.hasAttr("#text");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str16 = textNode15.baseUri();
        boolean boolean18 = textNode15.hasAttr("hi!");
        int int19 = textNode15.siblingIndex();
        int int20 = textNode15.childNodeSize();
        java.lang.String str21 = textNode15.toString();
        try {
            org.jsoup.nodes.Node node22 = textNode2.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList28 = textNode27.childNodesCopy();
        int int29 = textNode27.siblingIndex();
        org.jsoup.nodes.Node node30 = textNode27.previousSibling();
        java.lang.String str31 = textNode27.nodeName();
        org.jsoup.nodes.Node node32 = textNode27.clone();
        org.jsoup.nodes.Document document33 = node32.ownerDocument();
        boolean boolean34 = textNode13.equals((java.lang.Object) node32);
        org.jsoup.nodes.TextNode textNode37 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList38 = textNode37.childNodesCopy();
        int int39 = textNode37.siblingIndex();
        java.lang.String str40 = textNode37.nodeName();
        java.lang.String str41 = textNode37.toString();
        java.lang.String str42 = textNode37.text();
        int int43 = textNode37.siblingIndex();
        org.jsoup.nodes.TextNode textNode46 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList47 = textNode46.childNodesCopy();
        int int48 = textNode46.siblingIndex();
        java.lang.String str49 = textNode46.nodeName();
        java.lang.String str50 = textNode46.toString();
        int int51 = textNode46.siblingIndex();
        boolean boolean52 = textNode37.equals((java.lang.Object) int51);
        org.jsoup.nodes.TextNode textNode54 = textNode37.text("");
        org.jsoup.nodes.Node node56 = textNode37.removeAttr("hi!");
        boolean boolean57 = textNode13.equals((java.lang.Object) node56);
        org.jsoup.nodes.TextNode textNode60 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList61 = textNode60.childNodesCopy();
        int int62 = textNode60.siblingIndex();
        org.jsoup.nodes.Node node64 = textNode60.removeAttr("#text");
        org.jsoup.nodes.Node node65 = node64.nextSibling();
        java.lang.Class<?> wildcardClass66 = node64.getClass();
        boolean boolean67 = node56.equals((java.lang.Object) wildcardClass66);
        node56.setBaseUri("h");
        org.jsoup.nodes.TextNode textNode72 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList73 = textNode72.childNodesCopy();
        int int74 = textNode72.siblingIndex();
        java.lang.String str75 = textNode72.nodeName();
        java.lang.String str77 = textNode72.attr("");
        org.jsoup.nodes.Node node78 = textNode72.previousSibling();
        java.lang.String str80 = textNode72.attr("#text");
        java.lang.String str81 = textNode72.outerHtml();
        org.jsoup.nodes.Node node84 = textNode72.attr("#text", "#text");
        int int85 = node84.childNodeSize();
        try {
            node56.replaceWith(node84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "#text" + "'", str31.equals("#text"));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "#text" + "'", str40.equals("#text"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(nodeList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "#text" + "'", str49.equals("#text"));
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(textNode54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(nodeList61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeList73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "#text" + "'", str75.equals("#text"));
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        boolean boolean6 = textNode2.hasAttr("#text");
        java.lang.String str8 = textNode2.absUrl("h");
        java.lang.String str9 = textNode2.text();
        try {
            org.jsoup.nodes.Node node11 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.splitText((int) (byte) 1);
        boolean boolean6 = textNode2.hasAttr("i!");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node14 = textNode10.previousSibling();
        boolean boolean15 = textNode2.equals((java.lang.Object) node14);
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        boolean boolean17 = textNode2.isBlank();
        org.jsoup.nodes.Node node18 = textNode2.previousSibling();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode2.siblingNodes();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(nodeList19);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.clone();
        org.jsoup.nodes.Node node11 = node10.nextSibling();
        int int12 = node10.childNodeSize();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode17 = textNode15.text("hi!");
        org.jsoup.nodes.Node node18 = textNode15.nextSibling();
        java.lang.String str19 = textNode15.toString();
        java.lang.String str20 = textNode15.getWholeText();
        textNode15.setBaseUri("#text");
        try {
            node10.replaceWith((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.outerHtml();
        org.jsoup.nodes.Node node9 = textNode2.parent();
        try {
            node9.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        org.jsoup.nodes.Document document17 = textNode15.ownerDocument();
        java.lang.String str18 = textNode15.outerHtml();
        org.jsoup.nodes.TextNode textNode20 = textNode15.text("hi!");
        try {
            org.jsoup.nodes.Node node21 = textNode12.after((org.jsoup.nodes.Node) textNode15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode20);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.attr("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodes();
        org.jsoup.nodes.Document document9 = textNode2.ownerDocument();
        try {
            org.jsoup.nodes.Node node11 = textNode2.childNode((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNull(document9);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.jsoup.nodes.Node node12 = node10.clone();
        org.jsoup.nodes.Document document13 = node12.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(document13);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        org.jsoup.nodes.Node node26 = textNode17.previousSibling();
        org.jsoup.nodes.Node node27 = textNode17.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.toString();
        boolean boolean9 = textNode2.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        boolean boolean11 = textNode2.isBlank();
        java.lang.String str12 = textNode2.getWholeText();
        java.lang.String str13 = textNode2.nodeName();
        try {
            org.jsoup.nodes.Node node15 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode6.toString();
        java.lang.String str14 = textNode6.toString();
        int int15 = textNode6.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "i!" + "'", str14.equals("i!"));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.TextNode textNode6 = textNode4.text("hi!");
        java.lang.String str8 = textNode4.attr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode4.childNodesCopy();
        java.lang.Class<?> wildcardClass10 = textNode4.getClass();
        int int11 = textNode4.siblingIndex();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        org.jsoup.nodes.Node node11 = node10.previousSibling();
        org.jsoup.nodes.Node node12 = node10.clone();
        node12.setBaseUri("i!");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("hi!");
        int int22 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node23 = textNode2.previousSibling();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.getWholeText();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass6 = textNode2.getClass();
        int int7 = textNode2.childNodeSize();
        java.lang.String str8 = textNode2.nodeName();
        boolean boolean10 = textNode2.hasAttr("#text");
        try {
            org.jsoup.nodes.Node node12 = textNode2.after("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "#text" + "'", str8.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        java.lang.String str8 = textNode2.text();
        org.jsoup.nodes.Node node10 = textNode2.removeAttr("hi!");
        int int11 = node10.siblingIndex();
        int int12 = node10.siblingIndex();
        org.jsoup.nodes.TextNode textNode15 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean17 = textNode15.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes18 = textNode15.attributes();
        java.lang.String str19 = textNode15.outerHtml();
        org.jsoup.nodes.Node node20 = textNode15.nextSibling();
        boolean boolean21 = textNode15.isBlank();
        org.jsoup.nodes.Document document22 = textNode15.ownerDocument();
        boolean boolean23 = node10.equals((java.lang.Object) textNode15);
        try {
            org.jsoup.nodes.Node node25 = node10.before("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNode15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        java.lang.String str11 = textNode2.text();
        int int12 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("#text");
        int int15 = textNode14.childNodeSize();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node14 = textNode10.previousSibling();
        boolean boolean15 = textNode2.equals((java.lang.Object) node14);
        org.jsoup.nodes.Attributes attributes16 = textNode2.attributes();
        org.jsoup.nodes.Node node17 = textNode2.previousSibling();
        org.jsoup.nodes.Node node18 = textNode2.nextSibling();
        textNode2.setBaseUri("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        int int7 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        java.lang.String str13 = textNode10.outerHtml();
        org.jsoup.nodes.Node node16 = textNode10.attr("hi!", "#text");
        org.jsoup.nodes.Node node17 = textNode10.clone();
        boolean boolean18 = textNode2.equals((java.lang.Object) textNode10);
        org.jsoup.nodes.Node node19 = textNode2.nextSibling();
        try {
            java.util.List<org.jsoup.nodes.Node> nodeList20 = node19.childNodes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.Node node6 = textNode2.removeAttr("#text");
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.String str8 = textNode2.baseUri();
        java.lang.String str9 = textNode2.baseUri();
        boolean boolean10 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode13.childNodesCopy();
        int int15 = textNode13.siblingIndex();
        java.lang.String str16 = textNode13.nodeName();
        java.lang.String str17 = textNode13.toString();
        java.lang.String str18 = textNode13.toString();
        boolean boolean20 = textNode13.hasAttr("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode13.childNodesCopy();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode13);
        java.util.List<org.jsoup.nodes.Node> nodeList23 = textNode13.childNodes();
        org.jsoup.nodes.TextNode textNode26 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str27 = textNode26.baseUri();
        boolean boolean29 = textNode26.hasAttr("hi!");
        java.lang.String str30 = textNode26.text();
        org.jsoup.nodes.Node node31 = textNode26.previousSibling();
        java.lang.String str32 = textNode26.getWholeText();
        boolean boolean34 = textNode26.hasAttr("i!");
        boolean boolean36 = textNode26.hasAttr("#text");
        try {
            org.jsoup.nodes.Node node37 = textNode13.before((org.jsoup.nodes.Node) textNode26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeList23);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        java.lang.String str15 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node17 = textNode2.clone();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        org.jsoup.nodes.Node node5 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node7 = textNode2.childNode(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        boolean boolean11 = textNode9.hasAttr("hi!");
        java.lang.String str12 = textNode9.nodeName();
        org.jsoup.nodes.TextNode textNode15 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode15.childNodesCopy();
        int int17 = textNode15.siblingIndex();
        java.lang.String str18 = textNode15.nodeName();
        java.lang.String str19 = textNode15.toString();
        int int20 = textNode15.siblingIndex();
        org.jsoup.nodes.Attributes attributes21 = textNode15.attributes();
        boolean boolean22 = textNode9.equals((java.lang.Object) textNode15);
        boolean boolean23 = textNode15.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        try {
            textNode2.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        java.lang.String str15 = textNode2.baseUri();
        org.jsoup.nodes.Node node16 = textNode2.parent();
        org.jsoup.nodes.Node node19 = textNode2.attr("hi!", "");
        java.lang.String str21 = textNode2.attr("h");
        org.jsoup.nodes.Node node23 = textNode2.removeAttr("h");
        boolean boolean25 = textNode2.hasAttr("i!");
        org.jsoup.nodes.TextNode textNode27 = textNode2.text("h");
        int int28 = textNode27.childNodeSize();
        textNode27.setBaseUri("#text");
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.clone();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        org.jsoup.nodes.Node node8 = textNode2.nextSibling();
        org.jsoup.nodes.TextNode textNode10 = textNode2.text("#text");
        java.lang.String str11 = textNode2.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.childNodesCopy();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        java.lang.String str10 = textNode2.outerHtml();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        boolean boolean12 = textNode2.isBlank();
        java.lang.String str13 = textNode2.outerHtml();
        java.lang.String str14 = textNode2.nodeName();
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "#text");
        java.lang.String str19 = textNode17.attr("#text");
        java.lang.String str20 = textNode17.outerHtml();
        boolean boolean22 = textNode17.hasAttr("i!");
        try {
            org.jsoup.nodes.Node node23 = textNode2.after((org.jsoup.nodes.Node) textNode17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node20 = textNode2.nextSibling();
        java.lang.String str22 = textNode2.attr("#text");
        int int23 = textNode2.siblingIndex();
        int int24 = textNode2.childNodeSize();
        java.lang.String str25 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode2.childNodesCopy();
        org.jsoup.nodes.Document document27 = textNode2.ownerDocument();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNull(document27);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        java.lang.String str13 = textNode2.toString();
        textNode2.setBaseUri("");
        org.jsoup.nodes.TextNode textNode17 = textNode2.text("");
        org.jsoup.nodes.Node node18 = textNode17.nextSibling();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str6 = textNode4.attr("h");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode13.baseUri();
        java.lang.String str26 = textNode13.outerHtml();
        java.lang.String str27 = textNode13.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "#text" + "'", str27.equals("#text"));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.absUrl("hi!");
        java.lang.String str9 = textNode2.attr("i!");
        try {
            org.jsoup.nodes.TextNode textNode11 = textNode2.splitText(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        boolean boolean5 = textNode2.isBlank();
        org.jsoup.nodes.Node node7 = textNode2.removeAttr("#text");
        org.jsoup.nodes.TextNode textNode10 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode10.childNodesCopy();
        int int12 = textNode10.siblingIndex();
        java.lang.String str13 = textNode10.nodeName();
        java.lang.String str14 = textNode10.toString();
        java.lang.String str15 = textNode10.text();
        org.jsoup.nodes.Attributes attributes16 = textNode10.attributes();
        java.lang.String str17 = textNode10.text();
        java.lang.String str19 = textNode10.attr("#text");
        java.lang.String str21 = textNode10.absUrl("h");
        boolean boolean23 = textNode10.hasAttr("");
        org.jsoup.nodes.Node node24 = textNode10.nextSibling();
        org.jsoup.nodes.TextNode textNode27 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int28 = textNode27.siblingIndex();
        org.jsoup.nodes.Document document29 = textNode27.ownerDocument();
        textNode27.setBaseUri("#text");
        boolean boolean33 = textNode27.equals((java.lang.Object) 1.0f);
        org.jsoup.nodes.TextNode textNode35 = textNode27.text("hi!");
        boolean boolean36 = textNode10.equals((java.lang.Object) "hi!");
        try {
            org.jsoup.nodes.Node node37 = textNode2.after((org.jsoup.nodes.Node) textNode10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(document29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(textNode35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        java.lang.String str4 = textNode2.text();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodes();
        textNode2.setBaseUri("hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.lang.String str10 = textNode2.getWholeText();
        java.lang.String str11 = textNode2.outerHtml();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertNotNull(nodeList8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        java.lang.String str3 = textNode2.getWholeText();
        org.jsoup.nodes.TextNode textNode6 = new org.jsoup.nodes.TextNode("hi!", "#text");
        boolean boolean7 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.Node node11 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        boolean boolean5 = textNode2.hasAttr("");
        org.jsoup.nodes.Attributes attributes6 = textNode2.attributes();
        java.lang.String str7 = textNode2.getWholeText();
        java.lang.Class<?> wildcardClass8 = textNode2.getClass();
        org.jsoup.select.NodeVisitor nodeVisitor9 = null;
        try {
            org.jsoup.nodes.Node node10 = textNode2.traverse(nodeVisitor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "#text");
        boolean boolean11 = textNode9.hasAttr("hi!");
        org.jsoup.nodes.Node node12 = textNode9.nextSibling();
        boolean boolean13 = textNode2.equals((java.lang.Object) node12);
        boolean boolean14 = textNode2.isBlank();
        org.jsoup.nodes.Node node15 = textNode2.parent();
        try {
            org.jsoup.nodes.Node node16 = node15.parent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Attributes attributes9 = textNode2.attributes();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        java.lang.String str12 = textNode2.absUrl("#text");
        boolean boolean13 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList14 = textNode2.childNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList15 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeList14);
        org.junit.Assert.assertNotNull(nodeList15);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        boolean boolean12 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode14 = textNode2.text("");
        int int15 = textNode14.siblingIndex();
        int int16 = textNode14.siblingIndex();
        try {
            org.jsoup.nodes.Node node18 = textNode14.childNode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        java.lang.String str9 = textNode2.text();
        java.lang.String str11 = textNode2.attr("#text");
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        boolean boolean14 = textNode2.hasAttr("hi!");
        java.lang.String str15 = textNode2.getWholeText();
        java.lang.String str16 = textNode2.toString();
        textNode2.setBaseUri("");
        try {
            java.lang.String str20 = textNode2.absUrl("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertNull(document12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        int int5 = textNode2.childNodeSize();
        java.lang.String str6 = textNode2.baseUri();
        java.lang.String str7 = textNode2.baseUri();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.text();
        textNode2.setBaseUri("");
        int int6 = textNode2.childNodeSize();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.siblingNodes();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str3 = textNode2.text();
        org.jsoup.nodes.Node node4 = textNode2.previousSibling();
        org.jsoup.nodes.TextNode textNode7 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode9 = textNode7.text("hi!");
        org.jsoup.nodes.Node node10 = textNode7.nextSibling();
        org.jsoup.nodes.Node node11 = textNode7.parent();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode7.childNodes();
        org.jsoup.nodes.Node node13 = textNode7.nextSibling();
        java.lang.String str14 = textNode7.text();
        java.lang.String str15 = textNode7.baseUri();
        org.jsoup.nodes.Document document16 = textNode7.ownerDocument();
        try {
            org.jsoup.nodes.Node node17 = node4.after((org.jsoup.nodes.Node) textNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(textNode7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertNull(document16);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode6 = textNode2.splitText(1);
        org.jsoup.nodes.TextNode textNode9 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode11 = textNode9.text("hi!");
        boolean boolean12 = textNode6.equals((java.lang.Object) textNode9);
        java.lang.String str13 = textNode6.toString();
        java.lang.String str14 = textNode6.toString();
        java.lang.String str15 = textNode6.toString();
        org.jsoup.nodes.Node node16 = textNode6.nextSibling();
        boolean boolean17 = textNode6.isBlank();
        org.jsoup.nodes.Document document18 = textNode6.ownerDocument();
        try {
            org.jsoup.nodes.Node node20 = document18.wrap("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(textNode6);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "i!" + "'", str13.equals("i!"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "i!" + "'", str14.equals("i!"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "i!" + "'", str15.equals("i!"));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(document18);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        int int6 = textNode2.siblingIndex();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Node node5 = textNode2.nextSibling();
        org.jsoup.nodes.Node node6 = textNode2.parent();
        java.lang.String str7 = textNode2.getWholeText();
        org.jsoup.nodes.Node node8 = textNode2.clone();
        org.jsoup.nodes.Node node9 = node8.clone();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        java.lang.String str8 = textNode2.outerHtml();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.childNodesCopy();
        int int10 = textNode2.childNodeSize();
        org.jsoup.nodes.Node node12 = textNode2.removeAttr("h");
        try {
            org.jsoup.nodes.Node node14 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.Class<?> wildcardClass4 = textNode2.getClass();
        java.util.List<org.jsoup.nodes.Node> nodeList5 = textNode2.childNodesCopy();
        boolean boolean6 = textNode2.isBlank();
        boolean boolean7 = textNode2.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList8 = textNode2.childNodesCopy();
        try {
            org.jsoup.nodes.Node node10 = textNode2.wrap("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(nodeList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeList8);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        java.lang.String str7 = textNode2.text();
        org.jsoup.nodes.Attributes attributes8 = textNode2.attributes();
        org.jsoup.nodes.Node node9 = textNode2.clone();
        org.jsoup.nodes.Node node10 = textNode2.parent();
        org.jsoup.nodes.Document document11 = textNode2.ownerDocument();
        try {
            java.lang.String str12 = document11.outerHtml();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(document11);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.childNodeSize();
        org.jsoup.nodes.TextNode textNode8 = textNode2.splitText((int) (short) 0);
        textNode2.setBaseUri("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(textNode8);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("#text", "i!");
        org.jsoup.nodes.TextNode textNode5 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int6 = textNode5.siblingIndex();
        org.jsoup.nodes.Document document7 = textNode5.ownerDocument();
        int int8 = textNode5.siblingIndex();
        textNode5.setBaseUri("hi!");
        org.jsoup.nodes.Node node11 = textNode5.previousSibling();
        org.jsoup.nodes.Node node12 = textNode5.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList13 = textNode5.siblingNodes();
        java.lang.String str14 = textNode5.outerHtml();
        boolean boolean15 = textNode2.equals((java.lang.Object) textNode5);
        java.lang.String str16 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList17 = textNode2.siblingNodes();
        java.lang.String str18 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(document7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(nodeList13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "#text" + "'", str18.equals("#text"));
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.TextNode textNode17 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode17.childNodesCopy();
        int int19 = textNode17.siblingIndex();
        org.jsoup.nodes.Node node21 = textNode17.removeAttr("#text");
        java.lang.String str22 = textNode17.getWholeText();
        java.lang.String str23 = textNode17.baseUri();
        boolean boolean24 = textNode13.equals((java.lang.Object) textNode17);
        java.lang.String str25 = textNode17.getWholeText();
        java.lang.String str26 = textNode17.baseUri();
        java.util.List<org.jsoup.nodes.Node> nodeList27 = textNode17.childNodes();
        boolean boolean29 = textNode17.hasAttr("hi!");
        java.lang.String str30 = textNode17.toString();
        try {
            org.jsoup.nodes.TextNode textNode32 = textNode17.splitText((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.util.List<org.jsoup.nodes.Node> nodeList7 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode9 = textNode2.text("#text");
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.childNodesCopy();
        org.jsoup.nodes.TextNode textNode13 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean14 = textNode2.equals((java.lang.Object) textNode13);
        org.jsoup.nodes.Node node16 = textNode13.removeAttr("h");
        java.lang.String str17 = textNode13.nodeName();
        try {
            org.jsoup.nodes.Node node19 = textNode13.childNode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList7);
        org.junit.Assert.assertNotNull(textNode9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        org.jsoup.nodes.Node node21 = textNode2.removeAttr("hi!");
        int int22 = textNode2.siblingIndex();
        java.lang.String str24 = textNode2.absUrl("i!");
        org.jsoup.nodes.Attributes attributes25 = textNode2.attributes();
        java.util.List<org.jsoup.nodes.Node> nodeList26 = textNode2.childNodes();
        org.jsoup.nodes.TextNode textNode29 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        org.jsoup.nodes.Node node31 = textNode29.removeAttr("hi!");
        org.jsoup.nodes.Node node32 = node31.clone();
        int int33 = node31.siblingIndex();
        org.jsoup.nodes.Node node34 = node31.previousSibling();
        try {
            textNode2.replaceWith(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        org.junit.Assert.assertNotNull(attributes25);
        org.junit.Assert.assertNotNull(nodeList26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.Attributes attributes18 = textNode2.attributes();
        textNode2.setBaseUri("hi!");
        int int21 = textNode2.childNodeSize();
        java.lang.Class<?> wildcardClass22 = textNode2.getClass();
        java.lang.String str23 = textNode2.nodeName();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(attributes18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "#text" + "'", str23.equals("#text"));
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("", "");
        java.lang.String str3 = textNode2.outerHtml();
        java.lang.String str4 = textNode2.nodeName();
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str7 = textNode2.attr("h");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "#text" + "'", str4.equals("#text"));
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        org.jsoup.nodes.Document document5 = textNode2.ownerDocument();
        org.jsoup.select.NodeVisitor nodeVisitor6 = null;
        try {
            org.jsoup.nodes.Node node7 = document5.traverse(nodeVisitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertNull(document5);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        org.jsoup.nodes.TextNode textNode11 = textNode2.splitText((int) (short) 0);
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        try {
            org.jsoup.nodes.TextNode textNode14 = textNode2.splitText((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Split offset must not be greater than current text length");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertNotNull(attributes12);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.Class<?> wildcardClass3 = textNode2.getClass();
        org.jsoup.nodes.Node node4 = textNode2.parent();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node6 = textNode2.previousSibling();
        boolean boolean8 = textNode2.hasAttr("#text");
        java.lang.String str9 = textNode2.text();
        java.lang.String str10 = textNode2.text();
        java.lang.String str11 = textNode2.nodeName();
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode2.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "#text" + "'", str11.equals("#text"));
        org.junit.Assert.assertNotNull(nodeList12);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        java.lang.String str3 = textNode2.baseUri();
        boolean boolean5 = textNode2.hasAttr("hi!");
        int int6 = textNode2.siblingIndex();
        java.lang.String str7 = textNode2.outerHtml();
        java.lang.String str8 = textNode2.baseUri();
        boolean boolean10 = textNode2.hasAttr("h");
        int int11 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document12 = textNode2.ownerDocument();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        int int3 = textNode2.siblingIndex();
        org.jsoup.nodes.Document document4 = textNode2.ownerDocument();
        textNode2.setBaseUri("#text");
        boolean boolean7 = textNode2.isBlank();
        org.jsoup.nodes.TextNode textNode10 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode12 = textNode10.text("hi!");
        org.jsoup.nodes.TextNode textNode14 = textNode12.text("hi!");
        boolean boolean15 = textNode2.equals((java.lang.Object) "hi!");
        org.jsoup.nodes.Node node16 = textNode2.previousSibling();
        java.lang.String str17 = textNode2.nodeName();
        java.lang.String str18 = textNode2.getWholeText();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(textNode10);
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "#text" + "'", str17.equals("#text"));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        org.jsoup.nodes.TextNode textNode11 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList12 = textNode11.childNodesCopy();
        int int13 = textNode11.siblingIndex();
        java.lang.String str14 = textNode11.nodeName();
        java.lang.String str15 = textNode11.toString();
        int int16 = textNode11.siblingIndex();
        boolean boolean17 = textNode2.equals((java.lang.Object) int16);
        org.jsoup.nodes.TextNode textNode19 = textNode2.text("");
        java.lang.String str20 = textNode19.text();
        try {
            org.jsoup.nodes.Node node21 = textNode19.unwrap();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(nodeList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "#text" + "'", str14.equals("#text"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(textNode19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str6 = textNode2.toString();
        java.lang.String str7 = textNode2.text();
        int int8 = textNode2.siblingIndex();
        boolean boolean10 = textNode2.equals((java.lang.Object) (short) 10);
        org.jsoup.nodes.Node node11 = textNode2.clone();
        org.jsoup.nodes.Attributes attributes12 = textNode2.attributes();
        java.lang.String str13 = textNode2.nodeName();
        boolean boolean14 = textNode2.isBlank();
        boolean boolean15 = textNode2.isBlank();
        try {
            org.jsoup.nodes.Node node17 = textNode2.before("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(attributes12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "#text" + "'", str13.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.lang.String str12 = textNode2.attr("hi!");
        boolean boolean14 = textNode2.hasAttr("#text");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "#text" + "'", str12.equals("#text"));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList3 = textNode2.childNodesCopy();
        int int4 = textNode2.siblingIndex();
        java.lang.String str5 = textNode2.nodeName();
        java.lang.String str7 = textNode2.attr("");
        org.jsoup.nodes.Node node8 = textNode2.previousSibling();
        java.lang.String str10 = textNode2.attr("#text");
        java.lang.String str11 = textNode2.outerHtml();
        org.jsoup.nodes.Node node14 = textNode2.attr("#text", "#text");
        org.jsoup.nodes.Node node15 = textNode2.nextSibling();
        java.lang.String str16 = textNode2.nodeName();
        org.jsoup.nodes.Node node18 = textNode2.removeAttr("i!");
        boolean boolean19 = textNode2.isBlank();
        org.junit.Assert.assertNotNull(nodeList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "#text" + "'", str5.equals("#text"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "#text" + "'", str16.equals("#text"));
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        org.jsoup.nodes.Node node7 = textNode2.nextSibling();
        java.lang.String str8 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode11 = org.jsoup.nodes.TextNode.createFromEncoded("hi!", "");
        java.lang.String str12 = textNode11.text();
        org.jsoup.nodes.TextNode textNode14 = textNode11.splitText((int) (byte) 1);
        boolean boolean15 = textNode14.isBlank();
        java.util.List<org.jsoup.nodes.Node> nodeList16 = textNode14.childNodesCopy();
        boolean boolean17 = textNode14.isBlank();
        java.lang.String str19 = textNode14.attr("i!");
        org.jsoup.nodes.Node node20 = textNode14.parent();
        org.jsoup.nodes.Node node21 = textNode14.parent();
        boolean boolean22 = textNode2.equals((java.lang.Object) textNode14);
        java.lang.String str24 = textNode2.attr("");
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(textNode11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(nodeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        java.lang.String str5 = textNode2.outerHtml();
        org.jsoup.nodes.Node node8 = textNode2.attr("hi!", "#text");
        org.jsoup.nodes.Node node9 = textNode2.clone();
        java.util.List<org.jsoup.nodes.Node> nodeList10 = textNode2.siblingNodes();
        java.util.List<org.jsoup.nodes.Node> nodeList11 = textNode2.childNodesCopy();
        java.lang.String str12 = textNode2.toString();
        org.jsoup.nodes.Node node14 = textNode2.removeAttr("i!");
        org.jsoup.nodes.TextNode textNode16 = textNode2.text("hi!");
        java.lang.String str17 = textNode16.text();
        org.jsoup.nodes.TextNode textNode20 = new org.jsoup.nodes.TextNode("hi!", "hi!");
        java.util.List<org.jsoup.nodes.Node> nodeList21 = textNode20.childNodesCopy();
        int int22 = textNode20.siblingIndex();
        org.jsoup.nodes.TextNode textNode24 = textNode20.splitText(1);
        org.jsoup.nodes.TextNode textNode27 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode29 = textNode27.text("hi!");
        boolean boolean30 = textNode24.equals((java.lang.Object) textNode27);
        java.lang.String str31 = textNode27.baseUri();
        java.lang.String str32 = textNode27.outerHtml();
        java.lang.String str33 = textNode27.nodeName();
        try {
            textNode16.replaceWith((org.jsoup.nodes.Node) textNode27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(nodeList10);
        org.junit.Assert.assertNotNull(nodeList11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(textNode16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        org.junit.Assert.assertNotNull(nodeList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(textNode24);
        org.junit.Assert.assertNotNull(textNode27);
        org.junit.Assert.assertNotNull(textNode29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "#text" + "'", str33.equals("#text"));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.jsoup.nodes.TextNode textNode2 = new org.jsoup.nodes.TextNode("hi!", "");
        boolean boolean3 = textNode2.isBlank();
        java.lang.String str4 = textNode2.toString();
        java.lang.String str5 = textNode2.baseUri();
        java.lang.String str7 = textNode2.attr("hi!");
        java.lang.String str9 = textNode2.attr("");
        java.lang.String str10 = textNode2.toString();
        org.jsoup.nodes.TextNode textNode12 = textNode2.text("hi!");
        org.jsoup.nodes.Node node15 = textNode12.attr("#text", "h");
        org.jsoup.nodes.Node node16 = textNode12.nextSibling();
        java.lang.String str17 = textNode12.outerHtml();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        org.junit.Assert.assertNotNull(textNode12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        org.jsoup.nodes.TextNode textNode4 = textNode2.text("hi!");
        int int5 = textNode4.siblingIndex();
        org.jsoup.nodes.TextNode textNode7 = textNode4.text("#text");
        textNode4.setBaseUri("hi!");
        try {
            org.jsoup.nodes.Node node11 = textNode4.after("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Object must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertNotNull(textNode4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(textNode7);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.jsoup.nodes.TextNode textNode2 = org.jsoup.nodes.TextNode.createFromEncoded("", "hi!");
        boolean boolean4 = textNode2.hasAttr("hi!");
        org.jsoup.nodes.Attributes attributes5 = textNode2.attributes();
        java.lang.String str6 = textNode2.outerHtml();
        java.lang.Class<?> wildcardClass7 = textNode2.getClass();
        java.lang.String str8 = textNode2.getWholeText();
        java.util.List<org.jsoup.nodes.Node> nodeList9 = textNode2.siblingNodes();
        boolean boolean11 = textNode2.hasAttr("");
        org.jsoup.nodes.TextNode textNode13 = textNode2.text("#text");
        java.lang.String str15 = textNode13.attr("");
        boolean boolean17 = textNode13.hasAttr("i!");
        java.util.List<org.jsoup.nodes.Node> nodeList18 = textNode13.childNodesCopy();
        java.util.List<org.jsoup.nodes.Node> nodeList19 = textNode13.siblingNodes();
        org.junit.Assert.assertNotNull(textNode2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(attributes5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(nodeList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(textNode13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeList18);
        org.junit.Assert.assertNotNull(nodeList19);
    }
}

